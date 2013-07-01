package com.capmkts.msrprocess.test;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.capmkts.msrprocess.util.DataMapper;

public class RaviTest {
	
	public static void main(String[] args) throws Exception{
//		System.out.println(org.hibernate.Version.getVersionString());
//		String URL = "jdbc:sqlserver://localhost:1433;databaseName=master;"; 
//
//		String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
//
//		String ID = "tester"; 
//
//		String PW = "Passw0rd"; 
//
//		// This is where to load the driver 
//		Class.forName (DRIVER); 
//		// This is where to connect 
//		Connection link = DriverManager.getConnection(URL, ID, PW); 
//		// In my case, I'm connecting to the URL, ID and PW where you are connecting the driver.
//		
//		System.out.println(" Got the connection "+link);
		
//		Session session = HibernateUtil.getSession();
//		Query query = session.createQuery("select count(*) from Holiday where holidayDate = :compareDate");
//		List list = query.list();
//		int count = Integer.parseInt(list.get(0).toString());
//		System.out.println("COUNT: " + count);
		File file = new File("C:\\683.csv");
		String fileContent = DataMapper.mapfile(file);
		System.out.println("fileContent: " + fileContent);

		String[] recordArray = fileContent.split("\\n");
		
		//Check Mailing Address & Property Address modifications (Req'd #F11 of Phase IV)
		recordArray = checkMailingAddress(recordArray);
		for(int i=0; i<recordArray.length; i++){
			System.out.println(recordArray[i]);
		}
	}	
	
private static String[] checkMailingAddress(String[] recordArray) {
		
		System.out.println("**** Checking Mailing Address ****");
		String[] dataArray;
		String[] arrayBuilder = new String[recordArray.length];
		
		String propStreetAddress="", propCity="", propState="", propZip = "";
		
		arrayBuilder[0] = recordArray[0];
		for (int i = 1; i < recordArray.length; i++) {
			dataArray = recordArray[i].split("\\,");
			switch (i){
				case 81:
					propStreetAddress = dataArray[i];
					break;
				case 82:
					propCity = dataArray[i];
					break;
				case 83:
					propState = dataArray[i];
					break;
				case 84:
					propZip = dataArray[i];
					break;
				case 86:
					if (dataArray[86].isEmpty()){
						dataArray[86] = propStreetAddress;
						dataArray[87] = propCity;
						dataArray[88] = propState;
						dataArray[89] = propZip;
					}
					break;		
			}
			arrayBuilder[i] = dataArray[i];
		}
		
		System.out.println("**** Checking Mailing Address Complete! ****");
		return arrayBuilder;
	}

	public static Date parseDate(String dateToParse){
		Date date = null;
		try {
			date = new SimpleDateFormat("MM/dd/yyyy HH:mm", Locale.ENGLISH).parse(dateToParse);
		} catch (ParseException e) {
			System.out.println("Invalid Date: " +dateToParse);
		}
		
		return date;
	}
	
	public static String arrayToString(String[] content){
		String tmpStr = "";
		for (int i=0; i<content.length; i++){
			tmpStr += content[i] + " ";
		}
		return tmpStr;
	}

}
