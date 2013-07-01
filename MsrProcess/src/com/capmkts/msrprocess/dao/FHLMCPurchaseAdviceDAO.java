package com.capmkts.msrprocess.dao;

import java.io.File;
import java.util.Date;

import com.capmkts.msrprocess.data.CMCFile;
import com.capmkts.msrprocess.data.FHLMCPurchaseAdvice;
import com.capmkts.msrprocess.util.FileUtil;
import com.capmkts.msrprocess.util.HibernateUtil;

public class FHLMCPurchaseAdviceDAO {
	public void save(FHLMCPurchaseAdvice csvFile) {

		HibernateUtil.save(csvFile);
	}
	
	public void saveFile(File csvFile, String uploadType, boolean valid,
			String inValidMessage, Integer cmcCommitmentNumber,int sellerNumber) {

		CMCFile cmcFile = new CMCFile();
		cmcFile.setFileData(FileUtil.getBytes(csvFile));
		cmcFile.setFileName(csvFile.getName());
		cmcFile.setFileType(uploadType);
		cmcFile.setValid(valid);
		
		if(cmcCommitmentNumber != null){
			cmcFile.setCmcCommitmentNumber(cmcCommitmentNumber);
		}
		
	
		if (!cmcFile.getValid()) {
			cmcFile.setInvalidMessage(inValidMessage);
		}
		cmcFile.setCreatedDate(new Date());

		HibernateUtil.save(cmcFile);
	}
}
