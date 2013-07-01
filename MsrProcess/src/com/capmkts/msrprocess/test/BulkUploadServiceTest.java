package com.capmkts.msrprocess.test;

import com.capmkts.bulkupload.client.BulkUploadServiceClientJob;

public class BulkUploadServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
//			String filePath = MsrConstants.CSV_DIRECTORY + "434223_107-01588.csv";
//			String filePath = "\\\\srv-file-01.capmkts.local\\ServicingAcquisition\\ServicingAcquisition\\FNMACoIssue\\EncompassUpload\\333740.csv";
			
			BulkUploadServiceClientJob bulkUploadClient = new BulkUploadServiceClientJob();
			
			bulkUploadClient.schedulerJobTest();
//			bulkUploadClient.schedulerJobTest();
			
			System.out.println("*********** complete ******* " );

		} catch (Exception ex) {
			ex.printStackTrace();
		}


	}

}
