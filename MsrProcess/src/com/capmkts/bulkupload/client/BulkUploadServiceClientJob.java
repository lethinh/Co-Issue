package com.capmkts.bulkupload.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.capmkts.msrprocess.constants.MsrConstants;
import com.capmkts.msrprocess.util.EmailUtil;
import com.capmkts.msrprocess.util.FileUtil;

public class BulkUploadServiceClientJob implements Job {

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {

		System.out.println("CSV BulkUpload Process Started!" + new Date());
		try {
			//Format filename for logfile
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			String currentDateTime = dateFormat.format(cal.getTime()).replaceAll("\\s", "T");
			String logFileName = MsrConstants.CSV_LOG_DIRECTORY+currentDateTime.replaceAll(":","_")+".csv";
			
			List<String> fileNames = getCSVFilenames();
			for (String fileName : fileNames) {
				System.out.println("FILENAME: " +fileName);
				boolean isUpload = uploadCSVToBulkUploadService(fileName, logFileName);
				// if csv file is uploaded successfully, rename the file to
				// avoid re-upload.
				if (isUpload) {
					File renameFile = new File(fileName);
					String fileNameOnly = renameFile.getName()
							+ "BULKUPLOADCOMPLETE";

					String absolutePath = renameFile.getAbsolutePath();
					String filePath = absolutePath.substring(0,
							absolutePath.lastIndexOf(File.separator));

					boolean isFileNameChanged = renameFile.renameTo(new File(MsrConstants.CSV_DIRECTORY + "\\" + fileNameOnly));
					
					System.out.println("CSV BulkUpload Process Ended! Is File changed? " + isFileNameChanged);
				}
			}
			System.out.println("CSV BulkUpload Process Ended!" + new Date());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	public void schedulerJobTest() {
		System.out.println("CSV BulkUpload Process Started!" + new Date());
		try {
			
			//Format filename for logfile
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			String currentDateTime = dateFormat.format(cal.getTime()).replaceAll("\\s", "T");
			String logFileName = MsrConstants.CSV_LOG_DIRECTORY+currentDateTime.replaceAll(":","_")+".csv";
			
			EmailUtil emailUtil = new EmailUtil();
			
			List<String> fileNames = getCSVFilenames();
			int failedUploadCount = 0;
			
			for (String fileName : fileNames) {
				System.out.println("FILENAME: " + fileName);
				//Generate unique id so that filewriter only log the following filenames
				if(!fileName.contains("BULKUPLOADCOMPLETE")){
					boolean isUpload = uploadCSVToBulkUploadService(fileName, logFileName);
					// if csv file is uploaded successfully, rename the file to
					// avoid re-upload.
					System.out.println("Is Upload After: " + isUpload);
					if (isUpload) {
						File renameFile = new File(fileName);
						String fileNameOnly = renameFile.getName()
								+ "BULKUPLOADCOMPLETE";
	
						String absolutePath = renameFile.getAbsolutePath();
						String filePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));
	
						boolean isFileNameChanged = renameFile.renameTo(new File(MsrConstants.CSV_DIRECTORY + "\\" + fileNameOnly));
						
						System.out.println("CSV BulkUpload Process Ended!" + isFileNameChanged);
					}
					else{
						failedUploadCount++;
					}
				}
			}
			
			//Send email notification about Encompass upload errors
			if (failedUploadCount > 0){
				emailUtil.sendEWSEmail("Co-Issue Notification", "There are errors in files uploaded to encompass." +
				"Please see error log in folder K:\\ServicingAcquisition\\FNMACoIssue\\EncompassUploadLog");
			}
			else{
				//Create DFI Upload file
				FileUtils fileUtils = new FileUtils();
				File f = new File(MsrConstants.DFIUploadFile);
				byte[] fileContent = fileUtils.readFileToByteArray(f);
				
				//Send the file
				emailUtil.sendDFIFile(fileContent, "DFIUpload.csv");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static List<String> getCSVFilenames() {

		File dir = new File(MsrConstants.CSV_DIRECTORY);
		//String[] fileNames = new String[0];
		List<String> fileNames = new ArrayList<String>();

		File[] files = dir.listFiles();
		

		for (File file : files) {
			if (!file.isDirectory()) {
				if (!file.getPath().contains("BULKUPLOADCOMPLETE")) {

					if (file.getAbsolutePath().endsWith("CSV")
							|| file.getAbsolutePath().endsWith("csv")) {
						fileNames.add(file.getPath());

						System.out.println("*********** fileNames is ******* "
								+ file.getPath());
						
						break;
					}
				}
			}
		}

		return fileNames;
	}

	public boolean uploadCSVToBulkUploadService(String filePath, String fileName) {
		int originatorID;
		String loanNumber;
		String GUID;
		String CMCLoanNumber;
		boolean isUpload = false;
		FileInputStream fisTargetFile = null;
		
		try {

			fisTargetFile = new FileInputStream(new File(
					filePath));

			String targetFileStr = IOUtils.toString(fisTargetFile, "UTF-8");
			ArrayList<String[]> origIDAndLoanNum = getOrigIDAndLoanNumber(targetFileStr);	
			String[] x = origIDAndLoanNum.get(0);
			System.out.println(x[1]);
			
			SSIServiceSoapProxy proxy = new SSIServiceSoapProxy();

			System.out.println("Processing File. Please wait....");
			String[] resultArray = proxy.processImport(targetFileStr,Channel.Delegated, "Co_Issue");
			
			System.out.println("\nOriginatorID : LoanNumber : GUID -- " +resultArray.length);
			
			for (int i=0; i<resultArray.length; i++){
				System.out.println(resultArray[i]);
			}
			
			Connection m_Connection = null;
			Statement m_Statement = null;
			ResultSet m_ResultSet = null;
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    		
			//Database connection to insert CMC LOAN NUMBERS (GUIDs)
		    m_Connection = DriverManager.getConnection(
		    		MsrConstants.sqlServer, MsrConstants.sqlServerUserID, MsrConstants.sqlServerPass);
//		    		"jdbc:sqlserver://10.1.24.4;instanceName=capmkts;databaseName=CoIssue_Test", "coissue", "coi$$ue2");
//		    		"jdbc:sqlserver://localhost;databaseName=master", "tester", "Passw0rd");
		     
		    m_Statement = m_Connection.createStatement();
		    
			
			if (resultArray != null && resultArray.length > 0) {
				
				//Write error to log if result contains errors
				System.out.println("*** RESULT ARRAY LENGTH: " +resultArray.length);
				String resultArrayString = arrayToString(resultArray);
				if (resultArrayString.contains("Error")){
					FileUtil.writeCSV(fileName, resultArrayString, true);
				}
				else{
					//for (int i=0; i<resultArray.length; i++){
						String[] tempStr = origIDAndLoanNum.get(0);
						originatorID = Integer.parseInt(tempStr[0]);
						loanNumber = tempStr[1];
						
						GUID = resultArray[0];
						CMCLoanNumber = resultArray[1].split("\\s")[0];
						
						System.out.println("-->"+ originatorID +" : "+ loanNumber +" : "+ GUID +" : "+ CMCLoanNumber);
						isUpload = true;
						if (GUID.contains("{")){
							// Update CreditData Table Field with Encompass Loan GUID value
							String query = "UPDATE [CoIssue_Test].[dbo].[CreditData] " +
									"SET GUID = ('" +GUID+ "')" +
									"WHERE ORIGINATORID = '" +originatorID+ "'" +
									"AND LOANNUMBER = '" +loanNumber+ "'";
							PreparedStatement pstmt = m_Connection.prepareStatement(query);
							int rowsAffected = pstmt.executeUpdate();
							System.out.println("ROWS AFFECTED: " + rowsAffected);
							//Testing
	//						CreditDataDAO creditDataDAO = new CreditDataDAO();
	//						creditDataDAO.insertEncompassGUID(originatorID, loanNumber, GUID);
							
							buildDFIFile(CMCLoanNumber, loanNumber);
						}
					//}
					
					
				}
				// int result =
				// pricingDAO.updateEncompassLoanGUID(resultArray[0]);
				// if(result > 0)
				// {
				//	isUpload = true;
				// }
//				m_Connection.close();
//				m_Statement.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if(fisTargetFile != null){
				try {
					fisTargetFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return isUpload;
	}
	
	private void buildDFIFile(String CMCLoanNumber, String loanNumber) {
		File f = new File(MsrConstants.DFIUploadTemplate);
		String header = "";
		try {
			header = FileUtils.readFileToString(f) + "\n";
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] headerItems = header.split("\\,");
		String finalContent = CMCLoanNumber;
		for (int i=1; i<headerItems.length; i++){
			finalContent += ",";
			
			//Purchase Advice date
			if (i == 5){
				finalContent += getPADate(loanNumber);
			}
			
			//Remittance Type
			if (i == 6){
				finalContent += getRemittanceType(loanNumber);
			}
		}		
		FileUtil.writeCSV(MsrConstants.DFIUploadFile, finalContent+"\n", true);		
	}

	private String getRemittanceType(String loanNumber) {
		Connection m_Connection = null;
		Statement m_Statement = null;
		ResultSet m_ResultSet = null;
		String remittanceType = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//Database connection to insert CMC LOAN NUMBERS (GUIDs)
		    m_Connection = DriverManager.getConnection(
		    		MsrConstants.sqlServer, MsrConstants.sqlServerUserID, MsrConstants.sqlServerPass);
		    m_Statement = m_Connection.createStatement();
		    
			ResultSet m_RemitTypeResult = null;
	
			String queryGetPADate = "SELECT RemittanceType "+
					"FROM [CoIssue_Test].[dbo].[AgencyCommitmentLetter_Staging] "+
					"WHERE AgencyCommitmentID = (SELECT AGENCYCOMMITMENTID "+
					"FROM [CoIssue_Test].[dbo].[CreditData] "+
					"WHERE LOANNUMBER like '%" +loanNumber+ "')";
			m_RemitTypeResult = m_Statement.executeQuery(queryGetPADate);
			while (m_RemitTypeResult.next()){
		    	remittanceType = m_RemitTypeResult.getString("RemittanceType");
		    	
		    }
		    if (remittanceType.equalsIgnoreCase("actual/actual")){
		    	remittanceType = MsrConstants.ACTUAL_ACTUAL;
		    }
		    if (remittanceType.equalsIgnoreCase("scheduled/scheduled")){
		    	remittanceType = MsrConstants.SCHEDULED_SCHEDULED;
		    }
		    if (remittanceType.equalsIgnoreCase("scheduled/actual")){
		    	remittanceType = MsrConstants.SCHEDULED_ACTUAL;
		    }
		    System.out.println("\nRemittance Type: " + remittanceType);
		    
		    m_Connection.close();
			m_Statement.close();
			m_RemitTypeResult.close();
		}catch(Exception e){
			
		}
		return remittanceType;
	}

	private String getPADate(String loanNumber) {
		Connection m_Connection = null;
		Statement m_Statement = null;
		ResultSet m_ResultSet = null;
		String purchaseDate = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//Database connection to insert CMC LOAN NUMBERS (GUIDs)
		    m_Connection = DriverManager.getConnection(
		    		MsrConstants.sqlServer, MsrConstants.sqlServerUserID, MsrConstants.sqlServerPass);
		    m_Statement = m_Connection.createStatement();
		    
			ResultSet m_PADateResult = null;
	
			String queryGetPADate = "SELECT PURCHASE_DATE FROM [CoIssue_Test].[dbo].[AgencyPurchAdvices] WHERE LENDER_LOAN_NO like '%3336177'";
			m_PADateResult = m_Statement.executeQuery(queryGetPADate);
		    while (m_PADateResult.next()){
		    	purchaseDate = m_PADateResult.getString("PURCHASE_DATE");
		    	Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S").parse(purchaseDate);
		    	String newFormat = new SimpleDateFormat("MM/dd/yyyy").format(date);
		    	System.out.println("\nPURCHASE DATE: " + newFormat);
		    }
		m_Connection.close();
		m_Statement.close();
		m_PADateResult.close();
		}catch(Exception e){
			
		}
		return purchaseDate;
	}

	public ArrayList<String[]> getOrigIDAndLoanNumber(String fileContent){
		String[] valueArray;
		ArrayList<String[]> result = new ArrayList<String[]>();
		
		String[] contentArray = fileContent.split("\\n");
		for (int i = 1; i < contentArray.length; i++) {
			String[] temp = new String[2];
			valueArray = contentArray[i].split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
			temp[0] = valueArray[0];	//Get OriginatorID
			temp[1] = valueArray[3];	//Get Loan Number
			result.add(temp);
		}
		
		return result;
	}
	
	public String arrayToString(String[] content){
		String tmpStr = "";
		for (int i=0; i<content.length; i++){
			tmpStr += content[i] + " ";
		}
		return tmpStr;
	}

}
