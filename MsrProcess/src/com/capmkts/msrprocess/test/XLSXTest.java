package com.capmkts.msrprocess.test;

import java.io.File;

import com.capmkts.msrprocess.util.DataConversionUtil;

public class XLSXTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			File file = new File("C:/Caps/Docs/ServicingFile.xlsx");
			String csvOutput = DataConversionUtil.getExcelToCSVString(file);
			System.out.println("**csvOutput****" + csvOutput);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
