package com.capmkts.msrprocess.test;

import com.capmkts.encompassservice.Client.ExportDocumentsToEncompass;

public class EncompassServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			String loanNumber = "{b670482d-6588-4313-87ac-1048e6b122c1}";
			String filePath = "C:\\CommitmentLetter.pdf";

			System.out.println("Processing Request. Please wait...");
			ExportDocumentsToEncompass exportDocumentsToEncompass = new ExportDocumentsToEncompass();
			boolean result = exportDocumentsToEncompass.exportDocumentsToEncompass(loanNumber, filePath);
			
			System.out.println("*********** result is ******* " + result);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
