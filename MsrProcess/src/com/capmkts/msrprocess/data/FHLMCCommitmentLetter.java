package com.capmkts.msrprocess.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[CoIssue_Test].[dbo].[FHLMC Commits]")
public class FHLMCCommitmentLetter implements Serializable {
	
	@Id
	@GeneratedValue
	private int tableID;
	
	@Column(name = "[Allocable Loan Adjustable Period Servicing Fee: Maximum]")
	private String allocableLoanAdjustablePeriodServicingFeeMax;
	
	@Column(name = "[Allocable Loan Adjustable Period Servicing Fee: Minimum]")
	private String allocableLoanAdjustablePeriodServicingFeeMin;

	@Column(name = "[Allocable Loan Fixed Period Servicing Fee: Maximum]")
	private BigDecimal allocableLoanFixedPeriodServicingFeeMax;

	@Column(name = "[Allocable Loan Fixed Period Servicing Fee: Minimum]")
	private BigDecimal allocableLoanFixedPeriodServicingFeeMin;

	@Column(name = "[BUBD Request Type]")
	private String bubdRequestType;

	@Column(name = "[Buydown Amount (bps)]")
	private String buydownAmountBPS;

	@Column(name = "[Buyup Max]")
	private String buyupMax;

	@Column(name = "[Contract Accepted Date]")
	private Date contractAcceptedDate;

	@Column(name = "[Contract Amount]")
	private BigDecimal contractAmount;

	@Column(name = "[Contract Assumability Indicator]")
	private boolean contractAssumabilityIndicator;

	@Column(name = "[Contract Assumability Type]")
	private String contractAssumabilityType;

	@Column(name = "[Contract Expiration Date]")
	private Date contractExpirationDate;

	@Column(name = "[Contract Index Lookback Days]")
	private String contractIndexLookbackDays;

	@Column(name = "[Contract Name]")
	private String contractName;

	@Column(name = "[Contract PPM Indicator]")
	private boolean contractPPMIndicator;

	@Column(name = "[Contract Price 1]")
	private BigDecimal contractPrice1;

	@Column(name = "[Contract Price 2]")
	private BigDecimal contractPrice2;

	@Column(name = "[Contract Price 3]")
	private BigDecimal contractPrice3;

	@Column(name = "[Contract Price 4]")
	private BigDecimal contractPrice4;

	@Column(name = "[Contract Price 5]")
	private BigDecimal contractPrice5;

	@Column(name = "[Contract Remaining Balance]")
	private BigDecimal contractRemainingBalance;

	@Column(name = "[Contract Remaining Balance To Fulfill]")
	private BigDecimal contractRemainingBalanceToFulfill;

	@Column(name = "[Contract Servicing Option]")
	private String contractServicingOption;

	@Column(name = "[Contract Status]")
	private String contractStatus;

	@Column(name = "[Contract Weighted Average Adjustable Period Servicing Fee]")
	private String contractWeightedAverageAdjustablePeriodServicingFee;

	@Column(name = "[Contract Weighted Average Months to Next Rate Adjustment Date]")
	private String contractWeightedAverageMonthsToNextRateAdjustmentDate;

	@Column(name = "[Cusip Number]")
	private String cusipNumber;

	@Column(name = "[Designated Servicer Number]")
	private Integer designatedServicerNumber;

	@Column(name = "[Execution Method Type]")
	private String executionMethodType;

	@Column(name = "[Export Created Date Time]")
	private Date exportCreatedDateTime;

	@Column(name = "[Final Delivery Date]")
	private Date finalDeliveryDate;

	@Column(name = "[FM Approval Status]")
	private String FMApprovalStatus;

	@Column(name = "[Gold Rush Fee Amount]")
	private BigDecimal goldRushFeeAmount;

	@Column(name = "[Gold Rush Fee Rate]")
	private BigDecimal goldRushFeeRate;

	@Column(name = "[Guarantor Settlement Date]")
	private Date guarantorSettlementDate;

	@Column(name = "[Interest Rate Range 1]")
	private BigDecimal interestRateRange1;

	@Column(name = "[Interest Rate Range 2]")
	private BigDecimal interestRateRange2;

	@Column(name = "[Interest Rate Range 3]")
	private BigDecimal interestRateRange3;

	@Column(name = "[Interest Rate Range 4]")
	private BigDecimal interestRateRange4;

	@Column(name = "[Interest Rate Range 5]")
	private BigDecimal interestRateRange5;

	@Column(name = "[Interest Rate Type]")
	private String interestRateType;

	@Column(name = "[Interest/Principal Remittance Type]")
	private String interestPrincipalRemittanceType;

	@Column(name = "[Investor Contract Identifier]")
	private String investorContractIdentifier;

	@Column(name = "[LLPA Buyup Max (A Minus)]")
	private String LLPABuyupMaxAMinus;

	@Column(name = "[Loan Count (Number of mortgages submitted in this deliver)]")
	private String loanCount;

	@Column(name = "[Master Commitment Number]")
	private String masterCommitmentNumber;
	
	@Column(name = "[Maturity Term (Months)]")
	private BigDecimal maturityTerm;
	
	@Column(name = "[Maximum Contract Interest Rate]")
	private Double maximumContractInterestRate;

	@Column(name = "[Minimum Contract Interest Rate]")
	private Double minimumContractInterestRate;
	
	@Column(name = "[Minimum Required Servicing Spread - Coupon]")
	private Double minimumRequiredServicingSpreadCoupon;
	
	@Column(name = "[Minimum Required Servicing Spread - Lifetime Ceiling]")
	private String minimumRequiredServicingSpreadLifetimeCeiling;
	
	@Column(name = "[Minimum Required Servicing Spread - Margin]")
	private String minimumRequiredServicingSpreadMargin;
	
	@Column(name = "[Pairoff Amount]")
	private BigDecimal pairoffAmount;
	
	@Column(name = "[Pool Number]")
	private String poolNumber;
	
	@Column(name = "[Prepayment Remittance Due Days]")
	private String prepaymentRemittanceDueDays;
	
	@Column(name = "[Pricing Product]")
	private String pricingProduct;
	
	@Column(name = "[Remittance Due Day]")
	private String remittanceDueDay;
	
	@Column(name = "[Remittance Option]")
	private String remittanceOption;
	
	@Column(name = "[Required Spread (Gfee)]")
	private String requiredSpreadGfee;
	
	@Column(name = "[Security Amount]")
	private String securityAmount;
	
	@Column(name = "[Security Coupon]")
	private String securityCoupon;
	
	@Column(name = "[Security Product]")
	private String securityProduct;
	
	@Column(name = "[Seller Identifier]")
	private String sellerIdentifier;
	
	@Column(name = "[Servicing Fee]")
	private BigDecimal servicingFee;
	
	@Column(name = "[Servicing Option Type]")
	private String servicingOptionType;
	
	@Column(name = "[Settlement Cycle Days]")
	private String settlementCycleDays;
	
	@Column(name = "[Total UPB]")
	private String totalUPB;
	
	public String getAllocableLoanAdjustablePeriodServicingFeeMax() {
		return allocableLoanAdjustablePeriodServicingFeeMax;
	}

	public void setAllocableLoanAdjustablePeriodServicingFeeMax(String allocableLoanAdjustablePeriodServicingFeeMax) {
		this.allocableLoanAdjustablePeriodServicingFeeMax = allocableLoanAdjustablePeriodServicingFeeMax;
	}

	public String getAllocableLoanAdjustablePeriodServicingFeeMin() {
		return allocableLoanAdjustablePeriodServicingFeeMin;
	}

	public void setAllocableLoanAdjustablePeriodServicingFeeMin(String allocableLoanAdjustablePeriodServicingFeeMin) {
		this.allocableLoanAdjustablePeriodServicingFeeMin = allocableLoanAdjustablePeriodServicingFeeMin;
	}

	public BigDecimal getAllocableLoanFixedPeriodServicingFeeMax() {
		return allocableLoanFixedPeriodServicingFeeMax;
	}

	public void setAllocableLoanFixedPeriodServicingFeeMax(BigDecimal allocableLoanFixedPeriodServicingFeeMax) {
		this.allocableLoanFixedPeriodServicingFeeMax = allocableLoanFixedPeriodServicingFeeMax;
	}

	public BigDecimal getAllocableLoanFixedPeriodServicingFeeMin() {
		return allocableLoanFixedPeriodServicingFeeMin;
	}

	public void setAllocableLoanFixedPeriodServicingFeeMin(BigDecimal allocableLoanFixedPeriodServicingFeeMin) {
		this.allocableLoanFixedPeriodServicingFeeMin = allocableLoanFixedPeriodServicingFeeMin;
	}

	public String getBubdRequestType() {
		return bubdRequestType;
	}

	public void setBubdRequestType(String bubdRequestType) {
		this.bubdRequestType = bubdRequestType;
	}

	public String getBuydownAmountBPS() {
		return buydownAmountBPS;
	}

	public void setBuydownAmountBPS(String buydownAmountBPS) {
		this.buydownAmountBPS = buydownAmountBPS;
	}

	public String getBuyupMax() {
		return buyupMax;
	}

	public void setBuyupMax(String buyupMax) {
		this.buyupMax = buyupMax;
	}

	public Date getContractAcceptedDate() {
		return contractAcceptedDate;
	}

	public void setContractAcceptedDate(Date contractAcceptedDate) {
		this.contractAcceptedDate = contractAcceptedDate;
	}

	public BigDecimal getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(BigDecimal contractAmount) {
		this.contractAmount = contractAmount;
	}

	public boolean getContractAssumabilityIndicator() {
		return contractAssumabilityIndicator;
	}

	public void setContractAssumabilityIndicator(boolean contractAssumabilityIndicator) {
		this.contractAssumabilityIndicator = contractAssumabilityIndicator;
	}

	public String getContractAssumabilityType() {
		return contractAssumabilityType;
	}

	public void setContractAssumabilityType(String contractAssumabilityType) {
		this.contractAssumabilityType = contractAssumabilityType;
	}

	public Date getContractExpirationDate() {
		return contractExpirationDate;
	}

	public void setContractExpirationDate(Date contractExpirationDate) {
		this.contractExpirationDate = contractExpirationDate;
	}

	public String getContractIndexLookbackDays() {
		return contractIndexLookbackDays;
	}

	public void setContractIndexLookbackDays(String contractIndexLookbackDays) {
		this.contractIndexLookbackDays = contractIndexLookbackDays;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public boolean getContractPPMIndicator() {
		return contractPPMIndicator;
	}

	public void setContractPPMIndicator(boolean contractPPMIndicator) {
		this.contractPPMIndicator = contractPPMIndicator;
	}

	public BigDecimal getContractPrice1() {
		return contractPrice1;
	}

	public void setContractPrice1(BigDecimal contractPrice1) {
		this.contractPrice1 = contractPrice1;
	}
	
	public BigDecimal getContractPrice2() {
		return contractPrice2;
	}

	public void setContractPrice2(BigDecimal contractPrice2) {
		this.contractPrice2 = contractPrice2;
	}
	
	public BigDecimal getContractPrice3() {
		return contractPrice3;
	}

	public void setContractPrice3(BigDecimal contractPrice3) {
		this.contractPrice3 = contractPrice3;
	}
	
	public BigDecimal getContractPrice4() {
		return contractPrice4;
	}

	public void setContractPrice4(BigDecimal contractPrice4) {
		this.contractPrice4 = contractPrice4;
	}
	
	public BigDecimal getContractPrice5() {
		return contractPrice5;
	}

	public void setContractPrice5(BigDecimal contractPrice5) {
		this.contractPrice5 = contractPrice5;
	}

	public BigDecimal getContractRemainingBalance() {
		return contractRemainingBalance;
	}

	public void setContractRemainingBalance(BigDecimal contractRemainingBalance) {
		this.contractRemainingBalance = contractRemainingBalance;
	}

	public BigDecimal getContractRemainingBalanceToFulfill() {
		return contractRemainingBalanceToFulfill;
	}

	public void setContractRemainingBalanceToFulfill(BigDecimal contractRemainingBalanceToFulfill) {
		this.contractRemainingBalanceToFulfill = contractRemainingBalanceToFulfill;
	}

	public String getContractServicingOption() {
		return contractServicingOption;
	}

	public void setContractServicingOption(String contractServicingOption) {
		this.contractServicingOption = contractServicingOption;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getContractWeightedAverageAdjustablePeriodServicingFee() {
		return contractWeightedAverageAdjustablePeriodServicingFee;
	}

	public void setContractWeightedAverageAdjustablePeriodServicingFee(String contractWeightedAverageAdjustablePeriodServicingFee) {
		this.contractWeightedAverageAdjustablePeriodServicingFee = contractWeightedAverageAdjustablePeriodServicingFee;
	}

	public String getContractWeightedAverageMonthsToNextRateAdjustmentDate() {
		return contractWeightedAverageMonthsToNextRateAdjustmentDate;
	}

	public void setContractWeightedAverageMonthsToNextRateAdjustmentDate(String contractWeightedAverageMonthsToNextRateAdjustmentDate) {
		this.contractWeightedAverageMonthsToNextRateAdjustmentDate = contractWeightedAverageMonthsToNextRateAdjustmentDate;
	}

	public String getCusipNumber() {
		return cusipNumber;
	}

	public void setCusipNumber(String cusipNumber) {
		this.cusipNumber = cusipNumber;
	}

	public Integer getDesignatedServicerNumber() {
		return designatedServicerNumber;
	}

	public void setDesignatedServicerNumber(Integer designatedServicerNumber) {
		this.designatedServicerNumber = designatedServicerNumber;
	}

	public String getExecutionMethodType() {
		return executionMethodType;
	}

	public void setExecutionMethodType(String executionMethodType) {
		this.executionMethodType = executionMethodType;
	}

	public Date getExportCreatedDateTime() {
		return exportCreatedDateTime;
	}

	public void setExportCreatedDateTime(Date exportCreatedDateTime) {
		this.exportCreatedDateTime = exportCreatedDateTime;
	}

	public Date getFinalDeliveryDate() {
		return finalDeliveryDate;
	}

	public void setFinalDeliveryDate(Date finalDeliveryDate) {
		this.finalDeliveryDate = finalDeliveryDate;
	}

	public String getFMApprovalStatus() {
		return FMApprovalStatus;
	}

	public void setFMApprovalStatus(String FMApprovalStatus) {
		this.FMApprovalStatus = FMApprovalStatus;
	}

	public BigDecimal getGoldRushFeeAmount() {
		return goldRushFeeAmount;
	}

	public void setGoldRushFeeAmount(BigDecimal goldRushFeeAmount) {
		this.goldRushFeeAmount = goldRushFeeAmount;
	}

	public BigDecimal getGoldRushFeeRate() {
		return goldRushFeeRate;
	}

	public void setGoldRushFeeRate(BigDecimal goldRushFeeRate) {
		this.goldRushFeeRate = goldRushFeeRate;
	}

	public Date getGuarantorSettlementDate() {
		return guarantorSettlementDate;
	}

	public void setGuarantorSettlementDate(Date guarantorSettlementDate) {
		this.guarantorSettlementDate = guarantorSettlementDate;
	}

	public BigDecimal getInterestRateRange1() {
		return interestRateRange1;
	}

	public void setInterestRateRange1(BigDecimal interestRateRange1) {
		this.interestRateRange1 = interestRateRange1;
	}
	
	public BigDecimal getInterestRateRange2() {
		return interestRateRange2;
	}

	public void setInterestRateRange2(BigDecimal interestRateRange2) {
		this.interestRateRange2 = interestRateRange2;
	}
	
	public BigDecimal getInterestRateRange3() {
		return interestRateRange3;
	}

	public void setInterestRateRange3(BigDecimal interestRateRange3) {
		this.interestRateRange3 = interestRateRange3;
	}
	
	public BigDecimal getInterestRateRange4() {
		return interestRateRange4;
	}

	public void setInterestRateRange4(BigDecimal interestRateRange4) {
		this.interestRateRange4 = interestRateRange4;
	}
	
	public BigDecimal getInterestRateRange5() {
		return interestRateRange5;
	}

	public void setInterestRateRange5(BigDecimal interestRateRange5) {
		this.interestRateRange5 = interestRateRange5;
	}

	public String getInterestRateType() {
		return interestRateType;
	}

	public void setInterestRateType(String interestRateType) {
		this.interestRateType = interestRateType;
	}

	public String getInterestPrincipalRemittanceType() {
		return interestPrincipalRemittanceType;
	}

	public void setInterestPrincipalRemittanceType(String interestPrincipalRemittanceType) {
		this.interestPrincipalRemittanceType = interestPrincipalRemittanceType;
	}

	public String getInvestorContractIdentifier() {
		return investorContractIdentifier;
	}

	public void setInvestorContractIdentifier(String investorContractIdentifier) {
		this.investorContractIdentifier = investorContractIdentifier;
	}

	public String getLLPABuyupMaxAMinus() {
		return LLPABuyupMaxAMinus;
	}

	public void setLLPABuyupMaxAMinus(String LLPABuyupMaxAMinus) {
		this.LLPABuyupMaxAMinus = LLPABuyupMaxAMinus;
	}

	public String getLoanCount() {
		return loanCount;
	}

	public void setLoanCount(String loanCount) {
		this.loanCount = loanCount;
	}

	public String getMasterCommitmentNumber() {
		return masterCommitmentNumber;
	}

	public void setMasterCommitmentNumber(String masterCommitmentNumber) {
		this.masterCommitmentNumber = masterCommitmentNumber;
	}

	public BigDecimal getMaturityTerm() {
		return maturityTerm;
	}

	public void setMaturityTerm(BigDecimal maturityTerm) {
		this.maturityTerm = maturityTerm;
	}

	public Double getMaximumContractInterestRate() {
		return maximumContractInterestRate;
	}

	public void setMaximumContractInterestRate(Double maximumContractInterestRate) {
		this.maximumContractInterestRate = maximumContractInterestRate;
	}

	public Double getMinimumContractInterestRate() {
		return minimumContractInterestRate;
	}

	public void setMinimumContractInterestRate(Double minimumContractInterestRate) {
		this.minimumContractInterestRate = minimumContractInterestRate;
	}

	public Double getMinimumRequiredServicingSpreadCoupon() {
		return minimumRequiredServicingSpreadCoupon;
	}

	public void setMinimumRequiredServicingSpreadCoupon(Double minimumRequiredServicingSpreadCoupon) {
		this.minimumRequiredServicingSpreadCoupon = minimumRequiredServicingSpreadCoupon;
	}

	public String getMinimumRequiredServicingSpreadLifetimeCeiling() {
		return minimumRequiredServicingSpreadLifetimeCeiling;
	}

	public void setMinimumRequiredServicingSpreadLifetimeCeiling(String minimumRequiredServicingSpreadLifetimeCeiling) {
		this.minimumRequiredServicingSpreadLifetimeCeiling = minimumRequiredServicingSpreadLifetimeCeiling;
	}

	public String getMinimumRequiredServicingSpreadMargin() {
		return minimumRequiredServicingSpreadMargin;
	}

	public void setMinimumRequiredServicingSpreadMargin(String minimumRequiredServicingSpreadMargin) {
		this.minimumRequiredServicingSpreadMargin = minimumRequiredServicingSpreadMargin;
	}

	public BigDecimal getPairoffAmount() {
		return pairoffAmount;
	}

	public void setPairoffAmount(BigDecimal pairoffAmount) {
		this.pairoffAmount = pairoffAmount;
	}

	public String getPoolNumber() {
		return poolNumber;
	}

	public void setPoolNumber(String poolNumber) {
		this.poolNumber = poolNumber;
	}

	public String getPrepaymentRemittanceDueDays() {
		return prepaymentRemittanceDueDays;
	}

	public void setPrepaymentRemittanceDueDays(String prepaymentRemittanceDueDays) {
		this.prepaymentRemittanceDueDays = prepaymentRemittanceDueDays;
	}
	
	public String getPricingProduct() {
		return pricingProduct;
	}

	public void setPricingProduct(String pricingProduct) {
		this.pricingProduct = pricingProduct;
	}
	
	public String getRemittanceDueDay() {
		return remittanceDueDay;
	}

	public void setRemittanceDueDay(String remittanceDueDay) {
		this.remittanceDueDay = remittanceDueDay;
	}
	
	public String getRemittanceOption() {
		return remittanceOption;
	}

	public void setRemittanceOption(String remittanceOption) {
		this.remittanceOption = remittanceOption;
	}
	
	public String getRequiredSpreadGfee() {
		return remittanceOption;
	}

	public void setRequiredSpreadGfee(String requiredSpreadGfee) {
		this.requiredSpreadGfee = requiredSpreadGfee;
	}
	
	public String getSecurityAmount() {
		return securityAmount;
	}

	public void setSecurityAmount(String securityAmount) {
		this.securityAmount = securityAmount;
	}
	
	public String getSecurityCoupon() {
		return securityCoupon;
	}

	public void setSecurityCoupon(String securityCoupon) {
		this.securityCoupon = securityCoupon;
	}
	
	public String getSecurityProduct() {
		return securityProduct;
	}

	public void setSecurityProduct(String securityProduct) {
		this.securityProduct = securityProduct;
	}
	
	public String getSellerIdentifier() {
		return sellerIdentifier;
	}

	public void setSellerIdentifier(String sellerIdentifier) {
		this.sellerIdentifier = sellerIdentifier;
	}
	
	public BigDecimal getServicingFee() {
		return servicingFee;
	}

	public void setServicingFee(BigDecimal servicingFee) {
		this.servicingFee = servicingFee;
	}
	
	public String getServicingOptionType() {
		return servicingOptionType;
	}

	public void setServicingOptionType(String servicingOptionType) {
		this.servicingOptionType = servicingOptionType;
	}
	
	public String getSettlementCycleDays() {
		return settlementCycleDays;
	}

	public void setSettlementCycleDays(String settlementCycleDays) {
		this.settlementCycleDays = settlementCycleDays;
	}
	
	public String getTotalUPB() {
		return totalUPB;
	}

	public void setTotalUPB(String totalUPB) {
		this.totalUPB = totalUPB;
	}
}
