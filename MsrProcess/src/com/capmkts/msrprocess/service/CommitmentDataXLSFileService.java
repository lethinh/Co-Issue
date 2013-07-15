package com.capmkts.msrprocess.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.hibernate.Query;
import org.hibernate.Session;

import com.capmkts.msrprocess.constants.MsrConstants;
import com.capmkts.msrprocess.dao.CMCCommitmentNumberDAO;
import com.capmkts.msrprocess.dao.CMCFileDAO;
import com.capmkts.msrprocess.dao.CommitmentDataDAO;
import com.capmkts.msrprocess.data.CommitmentData;
import com.capmkts.msrprocess.util.DataConversionUtil;
import com.capmkts.msrprocess.util.HibernateUtil;
import com.capmkts.msrprocess.validator.CommitmentDataValidator;
import com.capmkts.msrprocess.validator.DataValidator;

public class CommitmentDataXLSFileService implements FileService {

	@Override
	public void process(File file, DataValidator dataValidator)
			throws Exception {

		if (!isFileContentDuplicate(file)) {
			List<CommitmentData> commitmentDataAL = readExcelFile(file,
					dataValidator);

			CommitmentDataDAO commitmentDAO = new CommitmentDataDAO();

			// Validation -- State, B Of I California 30% cap, LA cap per patron
			// per month
			CommitmentDataValidator commitmentDataValidator = new CommitmentDataValidator();
			commitmentDataValidator.validate(commitmentDataAL, dataValidator,
					commitmentDAO);

			// Persist to the Database if no errors found
			if (dataValidator.getMessageList().isEmpty()) {
				commitmentDAO.saveAll(commitmentDataAL);

				Integer cmcCommitmentNumber = 0;
				// get unique Agency Commitment Numbers
				List<String> agencyUniqueCommitNumners = getAgencyCommitmentNumbers(commitmentDataAL);

				// Generate CMC commitment# for Agency Commitment Number , i.e.
				// one CMC Commitment # to Many Agency CommitmentID
				// Also calling generate PDF class
				if (agencyUniqueCommitNumners.size() > 0) {
					CMCCommitmentNumberDAO cmcCommitmentNumberDAO = new CMCCommitmentNumberDAO();
					cmcCommitmentNumber = cmcCommitmentNumberDAO
							.generateCMCCommitmentNumber(agencyUniqueCommitNumners);
				}

				// Save file
				CMCFileDAO cmcFileDAO = new CMCFileDAO();
				cmcFileDAO.saveFile(file, MsrConstants.COMMITMENT_REQUEST,
						dataValidator.isValid(), dataValidator.getMessageList()
								.toString(), cmcCommitmentNumber, null);

				if (dataValidator.getMessageList().isEmpty()) {
					dataValidator
							.addMessage("Your commitment request uploaded successfully.\nYour CMC Commitment # is "
									+ cmcCommitmentNumber
									+ ".\n"
									+ "A CMC commitment letter will be emailed to you shortly.");
				}
			}
		} else {
			dataValidator
					.addMessage("This is a duplicate file. Please contact CMC if this is an error.");
		}

	}

	private boolean isFileContentDuplicate(File file) {
		boolean isDuplicate = false;
		String fileName = file.getName();
		Session session = HibernateUtil.getSession();

		byte[] fileByteArray = new byte[1024];

		try {
			fileByteArray = FileUtils.readFileToByteArray(file);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<byte[]> list = null;
		byte[] fileData = null;
		try {
			Query query = session.createQuery("select fileData FROM CMCFile "
					+ "WHERE fileName = '" + fileName + "'");
			// System.out.println("QUERY: " +query);
			list = query.list();
			if (!list.isEmpty()) {
				System.out.println("\n\nBYTE ARRAY LIST SIZE: " + list.size()
						+ "\n\n");
				for (int i = 0; i < list.size(); i++) {
					if (Arrays.equals(fileByteArray, list.get(i))) {
						isDuplicate = true;
						System.out.println("\n\nFile Is Duplicate!\n\n");
						break;
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return isDuplicate;
	}

	public static boolean contentEquals(InputStream input1, InputStream input2)
			throws IOException {
		if (!(input1 instanceof BufferedInputStream)) {
			input1 = new BufferedInputStream(input1);
		}
		if (!(input2 instanceof BufferedInputStream)) {
			input2 = new BufferedInputStream(input2);
		}

		int ch = input1.read();
		while (-1 != ch) {
			int ch2 = input2.read();
			if (ch != ch2) {
				return false;
			}
			ch = input1.read();
		}

		int ch2 = input2.read();
		return (ch2 == -1);
	}

	public ArrayList<CommitmentData> readExcelFile(File file,
			DataValidator dataValidator) throws Exception {

		ArrayList<CommitmentData> commitmentDataAL = new ArrayList<CommitmentData>();

		try {

			// change it to to read from file
			// FileInputStream myInput = new
			// FileInputStream("C:\\CMC_Files\\CommitRequest_small.xls");
			FileInputStream myInput = new FileInputStream(file);

			if (file.getName().endsWith("xls")) {
				POIFSFileSystem myFileSystem = new POIFSFileSystem(myInput);

				HSSFWorkbook myWorkBook = new HSSFWorkbook(myFileSystem);

				HSSFSheet mySheet = myWorkBook.getSheetAt(0);

				Iterator<Row> rowIter = mySheet.iterator();
				System.out.println("\nHITTING rowIter.hasNext()");
				if (rowIter.hasNext()) {
					rowIter.next();

					int rowCount = 0;

					while (rowIter.hasNext()) {

						rowCount++;
						System.out.println("\nRow Count: " + rowCount);
						CommitmentData commitmentData = new CommitmentData();
						commitmentData.setCreatedDate(new Date());
						System.out.println("\nCreate Date: "
								+ commitmentData.getCreatedDate());
						commitmentData.setValid(true);
						System.out.println("\nIs Valid: "
								+ commitmentData.getValid());
						Row myRow = rowIter.next();

						Iterator<Cell> cellIter = myRow.cellIterator();

						int cellCount = 0;

						while (cellIter.hasNext()) {

							cellCount++;
							Cell cell = cellIter.next();
							System.out.println("\nPreparing Commit Data");
							System.out.println("\nCELL: " + cell);
							prepareCommitmentData(commitmentData, cellCount,
									cell, dataValidator, rowCount);

						}
						if (cellCount != 18) {
							dataValidator.addMessage("\nLoan at row "
									+ rowCount
									+ ": Missing Column. Please check data.");
						}
						commitmentDataAL.add(commitmentData);
						// rowCount++;
					}

				}
			}
			else if (file.getName().endsWith("xlsx"))
			{
				DataConversionUtil dcUtil = new DataConversionUtil();
				
				CommitmentData commitmentData = new CommitmentData();
				commitmentData.setCreatedDate(new Date());
				commitmentData.setValid(true);
				
				String fileContent = dcUtil.getExcelToCSVStringCommitRequest(file);
				
				String[] recordArray = fileContent.split("\\n");
				String[] headerArray = recordArray[0].split("\\,");
				
				for (int i=1; i<recordArray.length; i++){
					String[] dataArray = recordArray[i].split("\\,");
				
					prepareCommitmentDataXLSX(dataArray, commitmentData,dataValidator, i);
					commitmentDataAL.add(commitmentData);
				}
			}
		} catch (Exception e) {
			throw e;
		}

		return commitmentDataAL;
	}

	private String getCellStringValue(Cell cell) {
		String tmpStr = null;
		try {
			tmpStr = cell.getStringCellValue();
		} catch (Exception e) {
			System.out.println(e);
		}
		return tmpStr;
	}

	private Integer getCellIntegerValue(Cell cell) {
		String tmpStr = null;
		try {
			tmpStr = cell.getNumericCellValue() + "";
		} catch (Exception e) {
			System.out.println(e);
		}
		if (tmpStr != null) {
			if (tmpStr.indexOf(".") != -1) {
				tmpStr = tmpStr.substring(0, tmpStr.length() - 2);
			}
			return new Integer(tmpStr);
		} else {
			return null;
		}
	}
	
	private BigDecimal getBigDecimalValue(Cell cell){
		BigDecimal bd = null;
		try {
			bd = new BigDecimal(cell.getNumericCellValue());
		}catch(Exception e){
			System.out.println(e);
			bd = new BigDecimal("0");
		}
		return bd;
		
	}

	private Double getCellDoubleValue(Cell cell) {
		Double tmpDbl = null;
		try {
			tmpDbl = new Double(cell.getNumericCellValue());
		} catch (Exception e) {
			System.out.println(e);
		}
		return tmpDbl;

	}

	private BigDecimal getCellBigDecimalValue(Cell cell) {
		BigDecimal tmpBigDec = null;
		try {
			tmpBigDec = new BigDecimal(cell.getNumericCellValue());
		} catch (Exception e) {
			System.out.println(e);
		}
		return tmpBigDec;

	}

	private Boolean getCellBooleanValue(Cell cell) {
		Boolean tmpBool = null;
		try {
			tmpBool = new Boolean(cell.getBooleanCellValue());
		} catch (Exception e) {
			System.out.println(e);
		}
		return tmpBool;
	}

	private Date getCellDateValue(Cell cell) {
		Date tmpDate = null;
		try {
			tmpDate = cell.getDateCellValue();
		} catch (Exception e) {
			System.out.println(e);
		}
		return tmpDate;
	}
	
	private void prepareCommitmentDataXLSX(String[] dataArray, CommitmentData commitmentData, DataValidator dataValidator, int loanRow){
		
		try {	
				for (int j=0; j<dataArray.length; j++){
					switch(j){
						case 0:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setOriginatorID(parseInteger(dataArray[j]));
							break;
						case 1:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setLoanNumber(dataArray[j]);
							break;
						case 2:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setAgencyCommitmentID(dataArray[j]);
							break;
						case 3:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setProduct(dataArray[j]);
							break;
						case 4:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setLoanAmount(parseBigDecimal(dataArray[j]));
							break;
						case 5:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setNoteRate(parseDouble(dataArray[j]));
							break;
						case 6:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setPropertyState(dataArray[j]);
							break;
						case 7:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setLtv(parseDouble(dataArray[j]));
							break;
						case 8:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setCltv(parseDouble(dataArray[j]));
							break;
						case 9:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setBorrowerFICO(parseDouble(dataArray[j]));
							break;
						case 10:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setOccupancyDesc(dataArray[j]);
							break;
						case 11:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setPropertyTypeDesc(dataArray[j]);
							break;
						case 12:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setLoanPurposeDesc(dataArray[j]);
							break;
						case 13:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setDocTypeDesc(dataArray[j]);
							break;
						case 14:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setWaiveEscrowFlag(parseBoolean(dataArray[j]));
							break;
						case 15:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setDti(parseDouble(dataArray[j]));
							break;
						case 16:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setActualCloseDate(parseDate(dataArray[j]));
							break;
						case 17:
							if (dataArray[j] == null || dataArray[j].isEmpty()){
								dataValidator.addMessage("\nLoan at row " + loanRow
										+ ": Missing or Invalid Loan Number");
							}
							commitmentData.setCmcSRP(parseDouble(dataArray[j]));
							break;
					}
			}	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void prepareCommitmentData(CommitmentData commitmentData,
			int cellCount, Cell cell, DataValidator dataValidator, int loanRow) {

		if (cell.getCellType() != Cell.CELL_TYPE_BLANK) {
			if (cellCount == 1) { // cell 1 = OriginatorID - Numeric
				if (getCellIntegerValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid OriginatorID");
				}
				commitmentData.setOriginatorID(getCellIntegerValue(cell));

			} else if (cellCount == 2) { // cell 2 = LoanNumber - String

				String loanNumberTmp = "";
				// System.out.println("Cell Type: " + cell.getCellType());
				// System.out.println("Cell Numeric: " +
				// cell.CELL_TYPE_NUMERIC);
				// String tmpStr = String.valueOf(cell);
				// System.out.println("TempString: " +tmpStr);
				if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					// System.out.println("\nGetCellIntegerValue: "
					// +getCellIntegerValue(cell)+"");
					long test = Double.valueOf(
							String.valueOf(cell).replaceAll("-", ""))
							.longValue();
					loanNumberTmp = String.valueOf(test);
					System.out.println("\nTestValue: " + test);
				} else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
					loanNumberTmp = String.valueOf(cell).replaceAll("-", "");
					System.out.println("\nLoan Number(NEW): " + loanNumberTmp);
				} else {
					// System.out.println("\nGetCellIntegerValue: "
					// +getCellIntegerValue(cell)+"");
					long test = Double.valueOf(
							String.valueOf(cell).replaceAll("-", ""))
							.longValue();
					loanNumberTmp = String.valueOf(test);
					System.out.println("\nTestValue: " + test);
				}
				if (loanNumberTmp == null || loanNumberTmp.isEmpty()) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Loan Number");
				}
				commitmentData.setLoanNumber(loanNumberTmp);

			} else if (cellCount == 3) {// cell 3 = AgencyCommitmentID - Numeric
				if (getBigDecimalValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Agency Commitment ID");
				}
				commitmentData.setAgencyCommitmentID(getBigDecimalValue(cell).toPlainString());

			} else if (cellCount == 4) {// cell 4 = Product - String
				if (cell.getStringCellValue() == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Product");
				}
				commitmentData.setProduct(cell.getStringCellValue());

			} else if (cellCount == 5) { // cell 5 = LoanAmount - Numeric
				if (getCellBigDecimalValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Loan Amount");
				}
				commitmentData.setLoanAmount(getCellBigDecimalValue(cell));

			} else if (cellCount == 6) {// cell 6 = NoteRate - Numeric
				if (getCellDoubleValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Note Rate");
				}
				commitmentData.setNoteRate(getCellDoubleValue(cell));

			} else if (cellCount == 7) { // cell 7 = PropertyState - String
				if (getCellStringValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid PropertyState");
				}
				commitmentData.setPropertyState(getCellStringValue(cell));

			} else if (cellCount == 8) { // cell 8 = LTV - Numeric
				if (getCellDoubleValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid LTV");
				}
				commitmentData.setLtv(getCellDoubleValue(cell));

			} else if (cellCount == 9) { // cell 9 = CLTV - Numeric
				if (getCellDoubleValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid CLTV");
				}
				commitmentData.setCltv(getCellDoubleValue(cell));

			} else if (cellCount == 10) { // cell 10 = BorrowerFICO - Numeric
				if (getCellDoubleValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Borrower FICO");
				}
				commitmentData.setBorrowerFICO(getCellDoubleValue(cell));

			} else if (cellCount == 11) {// cell 11 = OccupancyDesc - String
				if (getCellStringValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Occupancy Description");
				}
				commitmentData.setOccupancyDesc(getCellStringValue(cell));

			} else if (cellCount == 12) { // cell 12 = PropertyTypeDesc - String
				if (getCellStringValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Product");
				}
				commitmentData.setProduct(getCellStringValue(cell));

			} else if (cellCount == 13) { // cell 13 = LoanPurposeDesc - String
				if (getCellStringValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Loan Purpose Description");
				}
				commitmentData.setLoanPurposeDesc(getCellStringValue(cell));

			} else if (cellCount == 14) {// cell 14 = DocTypeDesc - String
				if (getCellStringValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Doc Type Description");
				}
				commitmentData.setDocTypeDesc(getCellStringValue(cell));

			} else if (cellCount == 15) {// cell 15 = WaiveEscrowsFlag - Boolean
				if (getCellBooleanValue(cell) == null) {
					dataValidator
							.addMessage("\nLoan at row "
									+ loanRow
									+ ": Missing or Invalid Waive Escrow Flag (TRUE/FALSE)");
				}
				commitmentData.setWaiveEscrowFlag(getCellBooleanValue(cell));

			} else if (cellCount == 16) { // cell 16 = DTI - Numeric
				if (getCellDoubleValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid DTI");
				}
				commitmentData.setDti(getCellDoubleValue(cell));

			} else if (cellCount == 17) { // cell 17 = ActualCloseDate - Numeric

				// System.out.println(" CELL TYPE "+cell.getCellType());
				if (getCellDateValue(cell) == null) {
					dataValidator.addMessage("\nLoan at row " + loanRow
							+ ": Missing or Invalid Actual Close Date");
				}
				if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
					commitmentData.setActualCloseDate(getCellDateValue(cell));
				}

			} else if (cellCount == 18) { // cell 18 = CMC_SRP - Numeric
//				if (getCellDoubleValue(cell) == null) {
//					dataValidator.addMessage("\nLoan at row " + loanRow
//							+ ": Missing or Invalid SRP");
//				}
				commitmentData.setCmcSRP(getCellDoubleValue(cell));
			}
		}
	}

	private List<String> getAgencyCommitmentNumbers(
			List<CommitmentData> commitmentDataAL) {

		List<String> agencyCommitmentNumbersAL = new ArrayList<String>();

		System.out.println("\nUNIQUE agencyCommitmentNumbersAL : "
				+ agencyCommitmentNumbersAL);

		for (int i = 0; i < commitmentDataAL.size(); i++) {

			CommitmentData commitmentData = commitmentDataAL.get(i);

			String agencyCommitID = commitmentData.getAgencyCommitmentID();
			if (commitmentData.getValid()
					&& !agencyCommitmentNumbersAL.contains(agencyCommitID)) {
				agencyCommitmentNumbersAL.add(agencyCommitID);
			}
		}

		// System.out.println(" UNIQUE agencyCommitmentNumbersAL :  22 "+agencyCommitmentNumbersAL);

		return agencyCommitmentNumbersAL;
	}
	
	public Double parseDouble(String value){
		try {
			if (!value.isEmpty()){
				return Double.parseDouble(value);
			}
			else{
				return new Double("0.0");
			}
		}catch(Exception e){
			return new Double("0.0");
		}
	}
	
	public int parseInteger(String value){
		try {
			if (!value.isEmpty()){
				return Integer.parseInt(value);
			}
			else{
				return new Integer(0);
			}
		}catch(Exception e){
			return new Integer(0);
		}
	}
	
	public BigDecimal parseBigDecimal(String value){
		BigDecimal newValue;
		if (value == null || value.isEmpty()){
			newValue = new BigDecimal("0");
		}
		try{
			newValue = new BigDecimal(value);
		}catch(Exception e){
			newValue = new BigDecimal("0");
		}
		return newValue;
	}
	
	public boolean parseBoolean(String value){
		if (value.equalsIgnoreCase("true") || value.equalsIgnoreCase("yes") || value.equalsIgnoreCase("1")){
			return true;
		}
		else{
			return false;
		}
	}

	public Date parseDate(String dateToParse){
		Date date = null;
		if (!dateToParse.isEmpty()){
			if (dateToParse.length() > 11){
				try {
					date = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(dateToParse);
				} catch (ParseException e) {
					System.out.println("Invalid Date: " +dateToParse);
				}
			}
			else{
				try {
					date = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH).parse(dateToParse);
				} catch (ParseException e) {
					System.out.println("Invalid Date: " +dateToParse);
				}
			}
		}
		
		return date;
	}

}
