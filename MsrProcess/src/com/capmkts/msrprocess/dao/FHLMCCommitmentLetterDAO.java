package com.capmkts.msrprocess.dao;

import org.hibernate.Session;

import com.capmkts.msrprocess.data.FHLMCCommitmentLetter;
import com.capmkts.msrprocess.util.HibernateUtil;

public class FHLMCCommitmentLetterDAO {

	public void save(FHLMCCommitmentLetter fhlmcCommitmentLetter) {

		HibernateUtil.save(fhlmcCommitmentLetter);
	}
	
	public boolean moveToAgencyCommitLetterTbl(){
		boolean success = false;
		Session session = HibernateUtil.getSession();
		
		String moveData = 
				"INSERT INTO AgencyCommitmentLetter (origCommitmentAmt, " +
				"expirationDate, commitmentDate, lenderNum, passThroughRateHigh, " +
				"minPassThroughRate, agencyCommitmentID, totalServicingFee, remittanceType ) " +
				"SELECT contractAmount, contractExpirationDate, contractAcceptedDate, " +
				"designatedServicerNumber, " +
				"(maximumContractInterestRate-minimumRequiredServicingSpreadCoupon)*100 AS PassThroughRateHigh, " +
				"(minimumContractInterestRate-minimumRequiredServicingSpreadCoupon)*100 AS MinPassThroughRate, " +
				"investorContractIdentifier, " +
				"minimumRequiredServicingSpreadCoupon*100 AS TotalServicingFee, " +
				"interestPrincipalRemittanceType " +
				"FROM FHLMCCommitmentLetter";
		System.out.println("\n\nSQL: " +moveData+ "\n\n");
		int rowsAffected = session.createQuery( moveData ).executeUpdate();
		if (rowsAffected > 0){
			success = true;
		}
		session.close();
		return success;
	}
}