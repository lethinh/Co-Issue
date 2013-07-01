package com.capmkts.msrprocess.service;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.commons.io.FileUtils;

import com.capmkts.msrprocess.constants.MsrConstants;
import com.capmkts.msrprocess.dao.FHLMCPurchaseAdviceDAO;
import com.capmkts.msrprocess.data.FHLMCPurchaseAdvice;
import com.capmkts.msrprocess.validator.DataValidator;

public class FHLMCPACSVFileService implements FileService {

	@Override
	public void process(File file, DataValidator dataValidator)
			throws Exception {

		try {
			String fileContent = FileUtils.readFileToString(file);
//			System.out.println("fileContent: " + fileContent);

			String[] recordArray = fileContent.split("\\n");

			boolean isFileCorrect = true;
			
			if (recordArray.length > 1) {

				List<FHLMCPurchaseAdvice> FHLMCPurchaseAdviceFileBeanList = new ArrayList<FHLMCPurchaseAdvice>();
				
				for (int i = 1; i < recordArray.length; i++) {
					dataValidator.setValid(true);
//					System.out.println("Record: " + i + " **** "
//							+ recordArray[i].trim());

					// Split each value in a record which are separated by pipe.
					
					String[] valueArray = recordArray[i].split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

					if (isFileCorrect) {
						FHLMCPurchaseAdvice FHLMCFileBean = new FHLMCPurchaseAdvice();
						boolean recordValid = false;

						// Prepare Bean
							setDatFileBeanValue(FHLMCFileBean,valueArray);
							FHLMCPurchaseAdviceFileBeanList.add(FHLMCFileBean);

						// DB Operations
							FHLMCPurchaseAdviceDAO fhlmcPurchaseAdviceDAO = new FHLMCPurchaseAdviceDAO();
							fhlmcPurchaseAdviceDAO.save(FHLMCFileBean);
					}
				}
				
			} else {
				String validationMessage = "FHLMC Purchase Advice File Has No Data! ";
				dataValidator.addMessage(validationMessage);
				System.out.println(validationMessage);
			}

			System.out.println(" FHLMC Purchase Advice - dataValidator.getMessageList() "
							+ dataValidator.getMessageList());

			if (dataValidator.getMessageList().size() > 0) {
				dataValidator.setValid(false);
			}

			// Insert File to "CMCFile" table irrespective of validation result
			// for auditing purposes.
			FHLMCPurchaseAdviceDAO fhlmcPurchaseAdviceDAO = new FHLMCPurchaseAdviceDAO();
			String dataValidationList = "";
			if (dataValidator.getMessageList() != null) {
				dataValidationList = dataValidator.getMessageList().toString();
			}
			fhlmcPurchaseAdviceDAO.saveFile(file, MsrConstants.FHLMC_PURCHASE_ADVICE,
					dataValidator.isValid(), dataValidationList, null, 0);

			if (dataValidator.getMessageList().isEmpty()){
				dataValidator.addMessage("FHLMC Purchase Advise has been accepted.");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void setDatFileBeanValue(FHLMCPurchaseAdvice fHLMCFileBean, String[] valueArray) {

			fHLMCFileBean.setAccruedInterest(parseBigDecimal(valueArray[0]));
			fHLMCFileBean.setAcquiredNetYieldRate(parseBigDecimal(valueArray[1]));
			fHLMCFileBean.setActualSettlementDate(parseDate(valueArray[2]));
			fHLMCFileBean.setBankTransferRoutingNumber(valueArray[3]);
			fHLMCFileBean.setBankTransferType(valueArray[4]);
			fHLMCFileBean.setBeneficiaryAccountNumber(valueArray[5]);
			fHLMCFileBean.setBeneficiaryAccountNumberAtTransferBank(valueArray[6]);
			fHLMCFileBean.setBeneficiaryBankName(valueArray[7]);
			fHLMCFileBean.setBeneficiaryName(valueArray[8]);
			fHLMCFileBean.setCashPricePrice(parseBigDecimal(valueArray[9]));
			fHLMCFileBean.setCertificationBatchIdentifier(valueArray[10]);
			fHLMCFileBean.setCertificationBatchPreparerName(valueArray[11]);
			fHLMCFileBean.setCertificationDueDate(parseDate(valueArray[12]));
			fHLMCFileBean.setContractExpirationDate(parseDate(valueArray[13]));
			fHLMCFileBean.setContractName(valueArray[14]);
			fHLMCFileBean.setCurrentInterestRatePercentCurrent(valueArray[15]);
			fHLMCFileBean.setDeliveryFeeAlt97OrAffordableGoldAlt97(valueArray[16]);
			fHLMCFileBean.setDeliveryFeeAlternativeStatedIncomeFee(valueArray[17]);
			fHLMCFileBean.setDeliveryFeeArmFee(valueArray[18]);
			fHLMCFileBean.setDeliveryFeeBalloonResetMortgagesFee(valueArray[19]);
			fHLMCFileBean.setDeliveryFeeCaliforniaCondoFee(valueArray[20]);
			fHLMCFileBean.setDeliveryFeeCashOutRefinanceFee(valueArray[21]);
			fHLMCFileBean.setDeliveryFeeCSLTVFeeAMinusLP(valueArray[22]);
			fHLMCFileBean.setDeliveryFeeCSLTVFeeAMinusNonLP(valueArray[23]);
			fHLMCFileBean.setDeliveryFeeCustomMIFee(valueArray[24]);
			fHLMCFileBean.setDeliveryFeeFICOAltMethodFee(valueArray[25]);
			fHLMCFileBean.setDeliveryFeeFreddieMac100LTVFee(valueArray[26]);
			fHLMCFileBean.setDeliveryFeeHomePossible(valueArray[27]);
			fHLMCFileBean.setDeliveryFeeInitialInterest(valueArray[28]);
			fHLMCFileBean.setDeliveryFeeInvestmentPropertyMortgagesFee(valueArray[29]);
			fHLMCFileBean.setDeliveryFeeManufacturedHomesFee(valueArray[30]);
			fHLMCFileBean.setDeliveryFeeNumberOfUnitsFee(valueArray[31]);
			fHLMCFileBean.setDeliveryFeePropertyInspectAltvFee(valueArray[32]);
			fHLMCFileBean.setDeliveryFeeSeasonedLoanFee(valueArray[33]);
			fHLMCFileBean.setDeliveryFeeSecondaryFinancingFee(parseBigDecimal(valueArray[34]));
			fHLMCFileBean.setDeliveryFeeStreamlinedPurchase400Fee(valueArray[35]);
			fHLMCFileBean.setDeliveryFeeStreamlinedPurchase401Fee(valueArray[36]);
			fHLMCFileBean.setDisbursementAmount(parseBigDecimal(valueArray[37]));
			fHLMCFileBean.setExportCreatedDateTime(parseDate(valueArray[38]));
			fHLMCFileBean.setFreddieMacLoanNumber(valueArray[39]);
			fHLMCFileBean.setInitialPrincipalAndInterestPaymentAmountFREPurchased(parseBigDecimal(valueArray[40]));
			fHLMCFileBean.setInterestAdjustment(valueArray[41]);
			fHLMCFileBean.setInvestorContractIdentifier(valueArray[42]);
			fHLMCFileBean.setLastPaidInstallmentDueDateCurrent(parseDate(valueArray[43]));
			fHLMCFileBean.setLastPaymentReceivedDateCurrent(parseDate(valueArray[44]));
			fHLMCFileBean.setLoanAcquisitionScheduledUPBAmountCurrent(parseBigDecimal(valueArray[45]));
			fHLMCFileBean.setLoanAmortizationTypeFREPurchased(valueArray[46]);
			fHLMCFileBean.setLoanReferenceProductLabel(valueArray[47]);
			fHLMCFileBean.setNetLifeCapRate(parseBigDecimal(valueArray[48]));
			fHLMCFileBean.setNonIndividualBorrower1Name(valueArray[49]);
			fHLMCFileBean.setNoteRatePercentFREPurchased(parseBigDecimal(valueArray[50]));
			fHLMCFileBean.setPIConstant(parseBigDecimal(valueArray[51]));
			fHLMCFileBean.setPartifipationPercentage(parseBigDecimal(valueArray[52]));
			fHLMCFileBean.setPremiumDiscount(parseBigDecimal(valueArray[53]));
			fHLMCFileBean.setPrepaymentRemittanceDueDays(valueArray[54]);
			fHLMCFileBean.setPricingProduct(valueArray[55]);
			fHLMCFileBean.setPrimaryBorrowerFirstName(valueArray[56]);
			fHLMCFileBean.setPrimaryBorrowerLastName(valueArray[57]);
			fHLMCFileBean.setPrimaryBorrowerMiddleName(valueArray[58]);
			fHLMCFileBean.setPrimaryBorrowerSuffixName(valueArray[59]);
			fHLMCFileBean.setPrimaryBorrowerTaxpayerIdentifierType(valueArray[60]);
			fHLMCFileBean.setPrimaryBorrowerTaxpayerIdentifierValue(parseBigDecimal(valueArray[61]));
			fHLMCFileBean.setPrincipalAndInterestPaymentAmountCurrent(parseBigDecimal(valueArray[62]));
			fHLMCFileBean.setPrincipalPurchased(parseBigDecimal(valueArray[63]));
			fHLMCFileBean.setRemainingMaturityPeriod(parseBigDecimal(valueArray[64]));
			fHLMCFileBean.setRemittanceOption(valueArray[65]);
			fHLMCFileBean.setSellerAddress(valueArray[66]);
			fHLMCFileBean.setSellerIdentifier(valueArray[67]);
			fHLMCFileBean.setSellerLoanIdentifier(valueArray[68]);
			fHLMCFileBean.setSellerName(valueArray[69]);
			fHLMCFileBean.setServicerAddress(valueArray[70]);
			fHLMCFileBean.setServicerIdentifier(valueArray[71]);
			fHLMCFileBean.setServicerName(valueArray[72]);
			fHLMCFileBean.setServicingFee(parseBigDecimal(valueArray[73]));
			fHLMCFileBean.setServicingOptionType(valueArray[74]);
			fHLMCFileBean.setServicingSpreadAdjustment(valueArray[75]);
			fHLMCFileBean.setSettlementCycleDays(valueArray[76]);
			fHLMCFileBean.setTotalDeliveryFee(parseBigDecimal(valueArray[77]));
			fHLMCFileBean.setTransferBankABANumber(valueArray[78]);
			fHLMCFileBean.setTransferBankName(valueArray[79]);
			fHLMCFileBean.setUPBAmountCurrent(valueArray[80]);
			fHLMCFileBean.setWeightedAverageMinCouponServicingSpread(valueArray[81]);
			fHLMCFileBean.setWeightedAverageRemainingMaturity(valueArray[82]);
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
