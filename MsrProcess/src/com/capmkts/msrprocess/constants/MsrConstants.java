package com.capmkts.msrprocess.constants;

public interface MsrConstants {
	
	public static final String	 AGENCY_COMMITMENT_LETTER  	= "agency_commitment_letter";
	public static final String 	COMMIT_REQUEST				= "commitment_request";
	public static final String 	COMMITMENT_REQUEST		  	= "Commitment Request";
	public static final String 	COMMITMENT_LETTER		  	= "Commitment Letter";
	public static final String 	SERVICING_DATA 		   		= "CMC_Servicing_Data_File_Agency_PA";
	public static final String 	LOAN_DOCUMENT_FILE 		   	= "Loan_Document_File";
	public static final String  FHLMC_COMMITMENT_LETTER		= "FHLMC Commitment Letter";
	public static final String  FHLMC_PURCHASE_ADVICE		= "FHLMC Purchase Advice";
	
	public static final int  	BOFI_ORIGINATOR_ID     		= 75;	
	
	public static final String 	CMC_COMMITMENT_OPEN		  	= "OPEN";
	public static final String 	CMC_COMMITMENT_CLOSE		= "CLOSE";
	//servicing
	public static final double  PRINCIPAL_BALANCE_TOLERANCE = 0.025;
	public static final int		EXTENSION_DAYS				= 10;
	
	//Remittance Types
	public static final String	ACTUAL_ACTUAL = "ActualInterestActualPrincipal";
	public static final String	SCHEDULED_ACTUAL = "ScheduledInterestActualPrincipal";
	public static final String	SCHEDULED_SCHEDULED = "ScheduledInterestScheduledPrincipal";
	
	//PDF Email Properties	
//	public static final String SMTP_HOST_NAME = "SRV-MAIL-01.capmkts.org";
//	public static final String SMTP_HOST_NAME = "smtp.capmkts.org";
	public static final String SMTP_HOST_NAME= "smtp.gmail.com";
//	public static final String SMTP_HOST_NAME= "mail.capmkts.org";
	public static final String SMTP_PORT  = "465";
//	public static final String SMTP_PORT  = "25";
//	public static final String SMTP_PORT = "587";
	public static final String[]  TO_EMAIL     		= {"startingpointsoftware@gmail.com"};
	public static final String  FROM_EMAIL     		= "CMReports";
//	public static final String  FROM_EMAIL     		= "CMReports@capmkts.org";
	public static final String  EMAIL_SUBJECT     	= "CMCMsrCommitmentLetter_PDF";
	public static final String  EMAIL_BODY     		= "CMCMsrCommitmentLetter_PDF is attached";
	public static final String SSL_FACTORY 			= "javax.net.ssl.SSLSocketFactory";
//	public static final String EMAIL_PASS			= "cmreP0rt$";
	public static final String EMAIL_PASS			= "cmreP0rt$";
	public static final String ATTACHMENT			= "C:\\CommitRequest_small.xls";
	public static final long DB_CHECK_INTERVAL		= 60000;
	
	//BUYER CONSTANTS IN PDF FILE
    public static final String BUYER                       = "CMC Funding, Inc.";
    public static final String BUYER_CONTACT               = "Kristie Sokolsky";
    public static final String BUYER_EMAIL                 = "ksokolsky@cmcfunding.com";
    public static final String BUYER_PHONE                 = "(904) 543-4081";  
	
	//EncompassService - To Upload documents to Encompass System C# Web Service
//	public static final String ENCOMPASSSERVICE_ENDPOINT		  	= "http://192.168.24.11/EncompassService/EncompassService.asmx";
	public static final String ENCOMPASSSERVICE_ENDPOINT = "https://www.cmcfunding.com/EncompassService/EncompassService.asmx";
	
	//Encompass Production Access
	public static final String sqlServer = "jdbc:sqlserver://10.1.24.4;instanceName=capmkts;databaseName=CoIssue_Test";
	public static final String sqlServerUserID = "coissue";
	public static final String sqlServerPass = "coi$$ue2";
	
	//Encompass Dev Access
//	public static final String sqlServer = "jdbc:sqlserver://localhost;databaseName=master";
//	public static final String sqlServerUserID = "tester";
//	public static final String sqlServerPass = "Passw0rd";
	
	//BulkUpload service locator
//	public static final String SSISERVICESOAP_ADDRESS 	= "https://www.cmcfunding.com/BulkImport/Services/SSIService.asmx";
	//BulkUpload service locator TEST
	public static final String SSISERVICESOAP_ADDRESS 	= "http://localhost/BulkImport/Services/SSIService.asmx";
		
	//BulkUpload Scheduler -- Directory		
	public static final String CSV_DIRECTORY			= "C:\\EncompassUpload\\";
//	public static final String CSV_DIRECTORY			= "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\EncompassUpload\\";
	public static final String CSV_LOG_DIRECTORY		= "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\EncompassUploadLog\\";
	public static final int  CAV_BULKUPLOAD_INTERVAL     		= 1;	//in minutes
	
	//Network Directories
	public static final String UPLOADED_LOAN_DOCS = "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\UploadedLoanDocs\\";
	public static final String SOFT_ERRORS = "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\SoftErrorsDataFiles\\";
	public static final String CMC_COMMIT_LETTERS = "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\CMCCommitmentLettersAutoGen\\";
//	public static final String CMC_COMMIT_LETTERS = "C:\\";
	public static final String LOCALBINFOLDER = "C:\\apache-tomcat-7.0.34\\bin";
	
	//Additional Extension Request Contact Info
	public static final String AdditionalExtReqContact = "tradesupport@cmcfunding.com";
	
	//Dynamic Field Importer (DFI)  file
	public static final String DFIUploadTemplate = "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\DFI\\DFITemplate.csv";
	public static final String DFIUploadFile = "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\DFI\\DFIUpload.csv";
}
