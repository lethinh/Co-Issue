package com.capmkts.msrprocess.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;

import com.capmkts.encompassservice.Client.ExportDocumentsToEncompass;
import com.capmkts.msrprocess.constants.MsrConstants;
import com.capmkts.msrprocess.dao.CMCFileDAO;
import com.capmkts.msrprocess.dao.CommitmentDataDAO;
import com.capmkts.msrprocess.dao.CreditDataDAO;
import com.capmkts.msrprocess.util.DataConversionUtil;
import com.capmkts.msrprocess.validator.DataValidator;

public class ServiceFactory {

	public static DataValidator processFiles(String requestType, File file) throws Exception{

		DataValidator dataValidator = new DataValidator();
		
		dataValidator.setValid(true);
		
		String fileName = file.getName();
		
		System.out.println(" request type: " +requestType);
		System.out.println(" fileName: "+fileName);
		
//		List<ServRateSheets> temp;
//		PricingGridDAO price = new PricingGridDAO();
//		System.out.println("\nGetting Pricing");
//		temp = price.getPricingGrid(30);
//		System.out.println("\nGot Pricing!!!");
//		for (int i=0; i<temp.size(); i++){
//			System.out.println(temp.get(i).toString());
//		}
		
		if (requestType.equalsIgnoreCase(MsrConstants.AGENCY_COMMITMENT_LETTER)) {
			// Agency COMMITMENT LETTER
			if (fileName.contains(" FHLMC") || fileName.contains(" FNMA")){
				dataValidator.addMessage("Please upload a valid Agency Commitment Letter. You're trying to upload a commitment reqest.");
			} 
			else { 
				if (fileName.endsWith(".csv") || fileName.endsWith(".xls")
						|| fileName.endsWith(".xlsx")) { 
					CommitmentLetterCSVFileService commitmentLetterCSVFileService = new CommitmentLetterCSVFileService();
					commitmentLetterCSVFileService.process(file, dataValidator);}
				/*else if (fileName.endsWith(".xlsx")){
					dataValidator.addMessage("XLSX files are not currently supported. Please upload an XLS file.");
				}*/
				else {
					dataValidator.addMessage("Invalid Agency Commitment Letter File Extension!");
				}
			}
		} else if (requestType.equalsIgnoreCase(MsrConstants.COMMIT_REQUEST)){
			// COMMITMENT REQUEST 
				if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) {
					CommitmentDataXLSFileService commitmentDataXLSFileService = new CommitmentDataXLSFileService();
					commitmentDataXLSFileService.process(file,dataValidator);
				}
				/*else if (fileName.endsWith(".xlsx")){
					dataValidator.addMessage("XLSX files are not currently supported. Please upload an XLS file.");
				}*/
				else{
					dataValidator.addMessage("Invalid Agency Commitment Reuqest File(s)!");
				}
		// SERVICING DATA
		} else if (requestType.equalsIgnoreCase(MsrConstants.SERVICING_DATA)) { 
			// .csv
				String agencyType = "FNMA";
				if (fileName.endsWith(".csv") || fileName.endsWith(".xls") || fileName.endsWith(".xlsx")) { 
					if (fileName.endsWith(".xls") || fileName.endsWith(".xlsx")){
						String fileContent = DataConversionUtil.getExcelToCSVString(file);
						agencyType = checkAgencyFile(fileContent);
					}
					else{
						agencyType = checkAgencyFile(file);
					}
					if (agencyType.equals("FHLMCPA")){
						FHLMCPACSVFileService fhlmcPACSVFileService = new FHLMCPACSVFileService();
						fhlmcPACSVFileService.process(file, dataValidator);
					}
					else if (agencyType.equals("SET")){
						dataValidator.addMessage("SET loans are current not supported! Please contact CMC Support.");
					}
					else{
						ServicingDataCSVFileService servicingDataCSVFileService = new ServicingDataCSVFileService();
						servicingDataCSVFileService.process(file, dataValidator);
					}
				}else if (fileName.endsWith(".dat")) { 
					ServicingDataDATFileService servicingDataDATFileService = new ServicingDataDATFileService();
					servicingDataDATFileService.process(file, dataValidator);
				}
				else{
					dataValidator.addMessage("Your request cannot be completed. Invalid file type.  Please contact CMC Support.");
				}
				
				if (dataValidator.getMessageList().size() > 7){
					int errors = dataValidator.getMessageList().size();
					dataValidator.setMessageList(null);
					dataValidator.addMessage(errors + " errors occurred. Please check log file for details");
				}
		//LOAN DOCS PDF and TIFF
		} else if (requestType.equalsIgnoreCase(MsrConstants.LOAN_DOCUMENT_FILE)) { 
			if (fileName.endsWith(".pdf") || fileName.endsWith(".tiff")) { 
				String sellerLoanNumber = "";
				String tempLoanNumber = "";
				String agencyCommitmentID;
//				if (fileName.contains("_")){
//					tempLoanNumber = (fileName.split("_")[1]);
//					sellerLoanNumber = tempLoanNumber.split("\\.")[0];
//				}
//				else if (fileName.contains("-")){
//					tempLoanNumber = (fileName.split("-")[1]);
//					sellerLoanNumber = tempLoanNumber.split("\\.")[0];
//				}
//				else {
//					sellerLoanNumber = fileName.split("\\.")[0];
//				}
				
				sellerLoanNumber = fileName.split("\\.")[0];
		
				System.out.println("\n\nSELLER LOAN NUMBER: " +sellerLoanNumber);
				
				CommitmentDataDAO commitmentDataDAO = new CommitmentDataDAO();
				System.out.println("\n\nAgency Commitment ID: " + commitmentDataDAO.getAgencyCommitmentID(sellerLoanNumber)+"\n\n");
				String tempAgencyCommitmentID = commitmentDataDAO.getAgencyCommitmentID(sellerLoanNumber);
				
				CreditDataDAO creditDataDAO = new CreditDataDAO();
				String GUID = creditDataDAO.getGUID(sellerLoanNumber);
				
				if (tempAgencyCommitmentID != null){
					agencyCommitmentID = tempAgencyCommitmentID;
				
	//				System.out.println("\n\nAgency Commitment ID: " + agencyCommitmentID+ "\n\n");
					CMCFileDAO cmcFileDAO = new CMCFileDAO();
					cmcFileDAO.saveFile(file, MsrConstants.LOAN_DOCUMENT_FILE, true, "", null, agencyCommitmentID);
					
					String fileLoc = MsrConstants.UPLOADED_LOAN_DOCS+file.getName();
					
					FileOutputStream fout = new FileOutputStream(fileLoc);
					OutputStream outputStream = new FileOutputStream (fileLoc); 
	
					ByteArrayOutputStream buffer = new ByteArrayOutputStream();
					InputStream is = new FileInputStream(file);
					byte[] temp = new byte[1024];
					int read;
	
					while((read = is.read(temp)) >= 0){
					   buffer.write(temp, 0, read);
					}
					buffer.writeTo(outputStream);
					outputStream.close();
					is.close();
					fout.close();
					buffer.close();
					
					//SEND TO ENCOMPASS
					ExportDocumentsToEncompass exportDocumentsToEncompass = new ExportDocumentsToEncompass();
					boolean sentSuccess = false;
					try{
						sentSuccess = exportDocumentsToEncompass.exportDocumentsToEncompass(GUID, fileLoc);
					}catch (Exception e) {
						System.out.println(e);
					}
					
					//REMOVE FILE IF SENT SUCCESSFULLY
					if (sentSuccess){
						File tempFile = new File(fileLoc);
						tempFile.delete();
					}
					
					dataValidator.addMessage("Your file(s) has been uploaded successfully.");
				}
				else{
					dataValidator.addMessage("Upload failed. No reference for loan docs found. Filename must be seller loan number.");
				}
			} 
			else{
				dataValidator.addMessage("CMC only accepts Loan Documents in PDF and TIFF format.");
			}
		} 
		
		// Code to save files to Database -- File Type, File, Messages, UploadedDate
		
		return dataValidator;
		
	}
	
	public static String checkAgencyFile(File file) throws IOException{
		String agencyType;
		// Read file to string
		String fileContent1 = FileUtils.readFileToString(file);

		// Split string into records
		String[] recordArray = fileContent1.split("\\n");

		// Read header
		String[] headerArray = recordArray[0].split("\\,");
		
		//FANNIE LOANS
		if (headerArray[0].contains("Accrued")){
			agencyType = "FHLMCPA";
		}
		//SET LOANS
		else if (headerArray[0].contains("Due Date")){
			agencyType = "SET";
		}
		//FREDDIE LOANS
		else{
			agencyType = "FNMA";
		}
		return agencyType;
	}
	
	public static String checkAgencyFile(String fileContent1) throws IOException{
		String agencyType;

		// Split string into records
		String[] recordArray = fileContent1.split("\\n");

		// Read header
		String[] headerArray = recordArray[0].split("\\,");
		
		//FANNIE LOANS
		if (headerArray[0].contains("Accrued")){
			agencyType = "FHLMCPA";
		}
		//SET LOANS
		else if (headerArray[0].contains("Due Date")){
			agencyType = "SET";
		}
		//FREDDIE LOANS
		else{
			agencyType = "FNMA";
		}
		return agencyType;
	}

}
