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
@Table(name = "[CoIssue_Test].[dbo].[FHLMC PAs]")
public class FHLMCPurchaseAdvice implements Serializable {
	
	@Id
	@GeneratedValue
	private int tableID;
	
	@Column(name = "[Accrued Interest]")
	private BigDecimal accruedInterest;
	
	@Column(name = "[Acquired Net Yield Rate]")
	private BigDecimal acquiredNetYieldRate;

	@Column(name = "[Actual Settlement Date]")
	private Date actualSettlementDate;

	@Column(name = "[Bank Transfer Routing Number]")
	private String bankTransferRoutingNumber;

	@Column(name = "[Bank Transfer Type]")
	private String bankTransferType;

	@Column(name = "[Beneficiary Account#]")
	private String beneficiaryAccountNumber;

	@Column(name = "[Beneficiary Account# at Transfer Bank]")
	private String beneficiaryAccountNumberAtTransferBank;

	@Column(name = "[Beneficiary Bank's Name]")
	private String beneficiaryBankName;

	@Column(name = "[Beneficiary Name]")
	private String beneficiaryName;

	@Column(name = "[Cash Price/Price]")
	private BigDecimal cashPricePrice;

	@Column(name = "[Certification Batch Identifier]")
	private String certificationBatchIdentifier;

	@Column(name = "[Certification Batch Preparer Name]")
	private String certificationBatchPreparerName;

	@Column(name = "[Certification Due Date]")
	private Date certificationDueDate;

	@Column(name = "[Contract Expiration Date]")
	private Date contractExpirationDate;

	@Column(name = "[Contract Name]")
	private String contractName;

	@Column(name = "[Current Interest Rate Percent - Current]")
	private String currentInterestRatePercentCurrent;

	@Column(name = "[Delivery Fee-ALT 97 or Affordable Gold Alt 97]")
	private String deliveryFeeAlt97OrAffordableGoldAlt97;

	@Column(name = "[Delivery Fee-Alternative Stated Income Fee]")
	private String deliveryFeeAlternativeStatedIncomeFee;

	@Column(name = "[Delivery Fee-ARM Fee]")
	private String deliveryFeeArmFee;

	@Column(name = "[Delivery Fee-Balloon/Reset Mortgages Fee]")
	private String deliveryFeeBalloonResetMortgagesFee;

	@Column(name = "[Delivery Fee-California Condo Fee]")
	private String deliveryFeeCaliforniaCondoFee;

	@Column(name = "[Delivery Fee-Cash Out Refinance Fee]")
	private String deliveryFeeCashOutRefinanceFee;

	@Column(name = "[Delivery Fee-CS/LTV Fee (A-Minus*LP)]")
	private String deliveryFeeCSLTVFeeAMinusLP;

	@Column(name = "[Delivery Fee-CS/LTV Fee (A-Minus*Non-LP)]")
	private String deliveryFeeCSLTVFeeAMinusNonLP;

	@Column(name = "[Delivery Fee-Custom MI Fee]")
	private String deliveryFeeCustomMIFee;

	@Column(name = "[Delivery Fee-FICO Alt Method Fee]")
	private String deliveryFeeFICOAltMethodFee;

	@Column(name = "[Delivery Fee-Freddie Mac 100% LTV Fee]")
	private String deliveryFeeFreddieMac100LTVFee;

	@Column(name = "[Delivery Fee-Home Possible]")
	private String deliveryFeeHomePossible;

	@Column(name = "[Delivery Fee-Initial Interest]")
	private String deliveryFeeInitialInterest;

	@Column(name = "[Delivery Fee-Investment Property Mortgages Fee]")
	private String deliveryFeeInvestmentPropertyMortgagesFee;

	@Column(name = "[Delivery Fee-Manufactured Homes Fee]")
	private String deliveryFeeManufacturedHomesFee;

	@Column(name = "[Delivery Fee-Number of Units Fee]")
	private String deliveryFeeNumberOfUnitsFee;

	@Column(name = "[Delivery Fee-Property Inspect Altv Fee]")
	private String deliveryFeePropertyInspectAltvFee;

	@Column(name = "[Delivery Fee-Seasoned Loan Fee]")
	private String deliveryFeeSeasonedLoanFee;

	@Column(name = "[Delivery Fee-Secondary Financing Fee]")
	private BigDecimal deliveryFeeSecondaryFinancingFee;

	@Column(name = "[Delivery Fee-Streamlined Purchase 400 Fee]")
	private String deliveryFeeStreamlinedPurchase400Fee;

	public String getDeliveryFeeStreamlinedPurchase400Fee() {
		return deliveryFeeStreamlinedPurchase400Fee;
	}

	public void setDeliveryFeeStreamlinedPurchase400Fee(
			String deliveryFeeStreamlinedPurchase400Fee) {
		this.deliveryFeeStreamlinedPurchase400Fee = deliveryFeeStreamlinedPurchase400Fee;
	}

	public String getDeliveryFeeStreamlinedPurchase401Fee() {
		return deliveryFeeStreamlinedPurchase401Fee;
	}

	public void setDeliveryFeeStreamlinedPurchase401Fee(
			String deliveryFeeStreamlinedPurchase401Fee) {
		this.deliveryFeeStreamlinedPurchase401Fee = deliveryFeeStreamlinedPurchase401Fee;
	}

	public BigDecimal getDisbursementAmount() {
		return disbursementAmount;
	}

	public void setDisbursementAmount(BigDecimal disbursementAmount) {
		this.disbursementAmount = disbursementAmount;
	}

	public String getFreddieMacLoanNumber() {
		return freddieMacLoanNumber;
	}

	public void setFreddieMacLoanNumber(String freddieMacLoanNumber) {
		this.freddieMacLoanNumber = freddieMacLoanNumber;
	}

	public BigDecimal getInitialPrincipalAndInterestPaymentAmountFREPurchased() {
		return initialPrincipalAndInterestPaymentAmountFREPurchased;
	}

	public void setInitialPrincipalAndInterestPaymentAmountFREPurchased(
			BigDecimal initialPrincipalAndInterestPaymentAmountFREPurchased) {
		this.initialPrincipalAndInterestPaymentAmountFREPurchased = initialPrincipalAndInterestPaymentAmountFREPurchased;
	}

	public String getInterestAdjustment() {
		return interestAdjustment;
	}

	public void setInterestAdjustment(String interestAdjustment) {
		this.interestAdjustment = interestAdjustment;
	}

	public Date getLastPaidInstallmentDueDateCurrent() {
		return lastPaidInstallmentDueDateCurrent;
	}

	public void setLastPaidInstallmentDueDateCurrent(
			Date lastPaidInstallmentDueDateCurrent) {
		this.lastPaidInstallmentDueDateCurrent = lastPaidInstallmentDueDateCurrent;
	}

	public Date getLastPaymentReceivedDateCurrent() {
		return lastPaymentReceivedDateCurrent;
	}

	public void setLastPaymentReceivedDateCurrent(
			Date lastPaymentReceivedDateCurrent) {
		this.lastPaymentReceivedDateCurrent = lastPaymentReceivedDateCurrent;
	}

	public BigDecimal getLoanAcquisitionScheduledUPBAmountCurrent() {
		return loanAcquisitionScheduledUPBAmountCurrent;
	}

	public void setLoanAcquisitionScheduledUPBAmountCurrent(
			BigDecimal loanAcquisitionScheduledUPBAmountCurrent) {
		this.loanAcquisitionScheduledUPBAmountCurrent = loanAcquisitionScheduledUPBAmountCurrent;
	}

	public String getLoanAmortizationTypeFREPurchased() {
		return loanAmortizationTypeFREPurchased;
	}

	public void setLoanAmortizationTypeFREPurchased(
			String loanAmortizationTypeFREPurchased) {
		this.loanAmortizationTypeFREPurchased = loanAmortizationTypeFREPurchased;
	}

	public String getLoanReferenceProductLabel() {
		return loanReferenceProductLabel;
	}

	public void setLoanReferenceProductLabel(String loanReferenceProductLabel) {
		this.loanReferenceProductLabel = loanReferenceProductLabel;
	}

	public BigDecimal getNetLifeCapRate() {
		return netLifeCapRate;
	}

	public void setNetLifeCapRate(BigDecimal netLifeCapRate) {
		this.netLifeCapRate = netLifeCapRate;
	}

	public String getNonIndividualBorrower1Name() {
		return nonIndividualBorrower1Name;
	}

	public void setNonIndividualBorrower1Name(String nonIndividualBorrower1Name) {
		this.nonIndividualBorrower1Name = nonIndividualBorrower1Name;
	}

	public BigDecimal getNoteRatePercentFREPurchased() {
		return noteRatePercentFREPurchased;
	}

	public void setNoteRatePercentFREPurchased(
			BigDecimal noteRatePercentFREPurchased) {
		this.noteRatePercentFREPurchased = noteRatePercentFREPurchased;
	}

	public BigDecimal getPIConstant() {
		return PIConstant;
	}

	public void setPIConstant(BigDecimal pIConstant) {
		PIConstant = pIConstant;
	}

	public BigDecimal getPartifipationPercentage() {
		return partifipationPercentage;
	}

	public void setPartifipationPercentage(BigDecimal partifipationPercentage) {
		this.partifipationPercentage = partifipationPercentage;
	}

	public BigDecimal getPremiumDiscount() {
		return premiumDiscount;
	}

	public void setPremiumDiscount(BigDecimal premiumDiscount) {
		this.premiumDiscount = premiumDiscount;
	}

	public String getPrimaryBorrowerFirstName() {
		return primaryBorrowerFirstName;
	}

	public void setPrimaryBorrowerFirstName(String primaryBorrowerFirstName) {
		this.primaryBorrowerFirstName = primaryBorrowerFirstName;
	}

	public String getPrimaryBorrowerLastName() {
		return primaryBorrowerLastName;
	}

	public void setPrimaryBorrowerLastName(String primaryBorrowerLastName) {
		this.primaryBorrowerLastName = primaryBorrowerLastName;
	}

	public String getPrimaryBorrowerMiddleName() {
		return primaryBorrowerMiddleName;
	}

	public void setPrimaryBorrowerMiddleName(String primaryBorrowerMiddleName) {
		this.primaryBorrowerMiddleName = primaryBorrowerMiddleName;
	}

	public String getPrimaryBorrowerSuffixName() {
		return primaryBorrowerSuffixName;
	}

	public void setPrimaryBorrowerSuffixName(String primaryBorrowerSuffixName) {
		this.primaryBorrowerSuffixName = primaryBorrowerSuffixName;
	}

	public String getPrimaryBorrowerTaxpayerIdentifierType() {
		return primaryBorrowerTaxpayerIdentifierType;
	}

	public void setPrimaryBorrowerTaxpayerIdentifierType(
			String primaryBorrowerTaxpayerIdentifierType) {
		this.primaryBorrowerTaxpayerIdentifierType = primaryBorrowerTaxpayerIdentifierType;
	}

	public BigDecimal getPrimaryBorrowerTaxpayerIdentifierValue() {
		return primaryBorrowerTaxpayerIdentifierValue;
	}

	public void setPrimaryBorrowerTaxpayerIdentifierValue(
			BigDecimal primaryBorrowerTaxpayerIdentifierValue) {
		this.primaryBorrowerTaxpayerIdentifierValue = primaryBorrowerTaxpayerIdentifierValue;
	}

	public BigDecimal getPrincipalAndInterestPaymentAmountCurrent() {
		return principalAndInterestPaymentAmountCurrent;
	}

	public void setPrincipalAndInterestPaymentAmountCurrent(
			BigDecimal principalAndInterestPaymentAmountCurrent) {
		this.principalAndInterestPaymentAmountCurrent = principalAndInterestPaymentAmountCurrent;
	}

	public BigDecimal getPrincipalPurchased() {
		return principalPurchased;
	}

	public void setPrincipalPurchased(BigDecimal principalPurchased) {
		this.principalPurchased = principalPurchased;
	}

	public BigDecimal getRemainingMaturityPeriod() {
		return remainingMaturityPeriod;
	}

	public void setRemainingMaturityPeriod(BigDecimal remainingMaturityPeriod) {
		this.remainingMaturityPeriod = remainingMaturityPeriod;
	}

	public String getSellerAddress() {
		return sellerAddress;
	}

	public void setSellerAddress(String sellerAddress) {
		this.sellerAddress = sellerAddress;
	}

	public String getSellerLoanIdentifier() {
		return sellerLoanIdentifier;
	}

	public void setSellerLoanIdentifier(String sellerLoanIdentifier) {
		this.sellerLoanIdentifier = sellerLoanIdentifier;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getServicerAddress() {
		return servicerAddress;
	}

	public void setServicerAddress(String servicerAddress) {
		this.servicerAddress = servicerAddress;
	}

	public String getServicerIdentifier() {
		return servicerIdentifier;
	}

	public void setServicerIdentifier(String servicerIdentifier) {
		this.servicerIdentifier = servicerIdentifier;
	}

	public String getServicerName() {
		return servicerName;
	}

	public void setServicerName(String servicerName) {
		this.servicerName = servicerName;
	}

	public String getServicingSpreadAdjustment() {
		return servicingSpreadAdjustment;
	}

	public void setServicingSpreadAdjustment(String servicingSpreadAdjustment) {
		this.servicingSpreadAdjustment = servicingSpreadAdjustment;
	}

	public BigDecimal getTotalDeliveryFee() {
		return totalDeliveryFee;
	}

	public void setTotalDeliveryFee(BigDecimal totalDeliveryFee) {
		this.totalDeliveryFee = totalDeliveryFee;
	}

	public String getTransferBankABANumber() {
		return transferBankABANumber;
	}

	public void setTransferBankABANumber(String transferBankABANumber) {
		this.transferBankABANumber = transferBankABANumber;
	}

	public String getTransferBankName() {
		return transferBankName;
	}

	public void setTransferBankName(String transferBankName) {
		this.transferBankName = transferBankName;
	}

	public String getUPBAmountCurrent() {
		return UPBAmountCurrent;
	}

	public void setUPBAmountCurrent(String uPBAmountCurrent) {
		UPBAmountCurrent = uPBAmountCurrent;
	}

	public String getWeightedAverageMinCouponServicingSpread() {
		return weightedAverageMinCouponServicingSpread;
	}

	public void setWeightedAverageMinCouponServicingSpread(
			String weightedAverageMinCouponServicingSpread) {
		this.weightedAverageMinCouponServicingSpread = weightedAverageMinCouponServicingSpread;
	}

	public String getWeightedAverageRemainingMaturity() {
		return weightedAverageRemainingMaturity;
	}

	public void setWeightedAverageRemainingMaturity(
			String weightedAverageRemainingMaturity) {
		this.weightedAverageRemainingMaturity = weightedAverageRemainingMaturity;
	}

	@Column(name = "[Delivery Fee-Streamlined Purchase 401 Fee]")
	private String deliveryFeeStreamlinedPurchase401Fee;

	@Column(name = "[Disbursement Amount]")
	private BigDecimal disbursementAmount;

	@Column(name = "[Export Created Date Time]")
	private Date exportCreatedDateTime;

	@Column(name = "[Freddie Mac Loan Number]")
	private String freddieMacLoanNumber;

	@Column(name = "[Initial Principal And Interest Payment Amount - FRE Purchased]")
	private BigDecimal initialPrincipalAndInterestPaymentAmountFREPurchased;

	@Column(name = "[Interest Adjustment]")
	private String interestAdjustment;

	@Column(name = "[Investor Contract Identifier]")
	private String investorContractIdentifier;

	@Column(name = "[Last Paid Installment Due Date - Current]")
	private Date lastPaidInstallmentDueDateCurrent;

	@Column(name = "[Last Payment Received Date - Current]")
	private Date lastPaymentReceivedDateCurrent;

	@Column(name = "[Loan Acquisition Scheduled UPB Amount - Current]")
	private BigDecimal loanAcquisitionScheduledUPBAmountCurrent;
	
	@Column(name = "[Loan Amortization Type - FRE Purchased]")
	private String loanAmortizationTypeFREPurchased;
	
	@Column(name = "[Loan Reference Product Label]")
	private String loanReferenceProductLabel;

	@Column(name = "[Net Life Cap Rate]")
	private BigDecimal netLifeCapRate;
	
	@Column(name = "[Non-Individual Borrower 1 Name]")
	private String nonIndividualBorrower1Name;
	
	@Column(name = "[Note Rate Percent - FRE Purchased]")
	private BigDecimal noteRatePercentFREPurchased;
	
	@Column(name = "[P&I Constant]")
	private BigDecimal PIConstant;
	
	@Column(name = "[Participation Percentage]")
	private BigDecimal partifipationPercentage;
	
	@Column(name = "[Premium (Discount)]")
	private BigDecimal premiumDiscount;
	
	@Column(name = "[Prepayment Remittance Due Days]")
	private String prepaymentRemittanceDueDays;
	
	@Column(name = "[Pricing Product]")
	private String pricingProduct;
	
	@Column(name = "[Primary Borrower First Name]")
	private String primaryBorrowerFirstName;
	
	@Column(name = "[Primary Borrower Last Name]")
	private String primaryBorrowerLastName;
	
	@Column(name = "[Primary Borrower Middle Name]")
	private String primaryBorrowerMiddleName;
	
	@Column(name = "[Primary Borrower Suffix Name]")
	private String primaryBorrowerSuffixName;
	
	@Column(name = "[Primary Borrower Taxpayer Identifier Type]")
	private String primaryBorrowerTaxpayerIdentifierType;
	
	@Column(name = "[Primary Borrower Taxpayer Identifier Value]")
	private BigDecimal primaryBorrowerTaxpayerIdentifierValue;
	
	@Column(name = "[Principal And Interest Payment Amount - Current]")
	private BigDecimal principalAndInterestPaymentAmountCurrent;
	
	@Column(name = "[Principal Purchased]")
	private BigDecimal principalPurchased;
	
	@Column(name = "[Remaining Maturity Period]")
	private BigDecimal remainingMaturityPeriod;
	
	@Column(name = "[Remittance Option]")
	private String remittanceOption;
	
	@Column(name = "[Seller Address]")
	private String sellerAddress;
	
	@Column(name = "[Seller Identifier]")
	private String sellerIdentifier;
	
	@Column(name = "[Seller Loan Identifier]")
	private String sellerLoanIdentifier;
	
	@Column(name = "[Seller Name]")
	private String sellerName;
	
	@Column(name = "[Servicer Address]")
	private String servicerAddress;
	
	@Column(name = "[Servicer Identifier]")
	private String servicerIdentifier;
	
	@Column(name = "[Servicer Name]")
	private String servicerName;
	
	@Column(name = "[Servicing Fee]")
	private BigDecimal servicingFee;
	
	@Column(name = "[Servicing Option Type]")
	private String servicingOptionType;
	
	@Column(name = "[Servicing Spread Adjustment]")
	private String servicingSpreadAdjustment;
	
	@Column(name = "[Settlement Cycle Days]")
	private String settlementCycleDays;
	
	@Column(name = "[Total Delivery Fee]")
	private BigDecimal totalDeliveryFee;
	
	@Column(name = "[Transfer Bank's ABA Number]")
	private String transferBankABANumber;
	
	@Column(name = "[Transfer Bank's Name]")
	private String transferBankName;
	
	@Column(name = "[UPB Amount - Current]")
	private String UPBAmountCurrent;
	
	@Column(name = "[Weighted Average Minimum Coupon Servicing Spread]")
	private String weightedAverageMinCouponServicingSpread;
	
	@Column(name = "[Weighted Average Remaining Maturity]")
	private String weightedAverageRemainingMaturity;
	
	public BigDecimal getAccruedInterest() {
		return accruedInterest;
	}

	public void setAccruedInterest(BigDecimal accruedInterest) {
		this.accruedInterest = accruedInterest;
	}

	public BigDecimal getAcquiredNetYieldRate() {
		return acquiredNetYieldRate;
	}

	public void setAcquiredNetYieldRate(BigDecimal acquiredNetYieldRate) {
		this.acquiredNetYieldRate = acquiredNetYieldRate;
	}

	public Date getActualSettlementDate() {
		return actualSettlementDate;
	}

	public void setActualSettlementDate(Date actualSettlementDate) {
		this.actualSettlementDate = actualSettlementDate;
	}

	public String getBankTransferRoutingNumber() {
		return bankTransferRoutingNumber;
	}

	public void setBankTransferRoutingNumber(String bankTransferRoutingNumber) {
		this.bankTransferRoutingNumber = bankTransferRoutingNumber;
	}

	public String getBankTransferType() {
		return bankTransferType;
	}

	public void setBankTransferType(String bankTransferType) {
		this.bankTransferType = bankTransferType;
	}

	public String getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public String getBeneficiaryAccountNumberAtTransferBank() {
		return beneficiaryAccountNumberAtTransferBank;
	}

	public void setBeneficiaryAccountNumberAtTransferBank(String beneficiaryAccountNumberAtTransferBank) {
		this.beneficiaryAccountNumberAtTransferBank = beneficiaryAccountNumberAtTransferBank;
	}

	public String getBeneficiaryBankName() {
		return beneficiaryBankName;
	}

	public void setBeneficiaryBankName(String beneficiaryBankName) {
		this.beneficiaryBankName = beneficiaryBankName;
	}

	public String getBeneficiaryName() {
		return beneficiaryName;
	}

	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}

	public BigDecimal getCashPricePrice() {
		return cashPricePrice;
	}

	public void setCashPricePrice(BigDecimal cashPricePrice) {
		this.cashPricePrice = cashPricePrice;
	}

	public String getCertificationBatchIdentifier() {
		return certificationBatchIdentifier;
	}

	public void setCertificationBatchIdentifier(String certificationBatchIdentifier) {
		this.certificationBatchIdentifier = certificationBatchIdentifier;
	}

	public String getCertificationBatchPreparerName() {
		return certificationBatchPreparerName;
	}

	public void setCertificationBatchPreparerName(String certificationBatchPreparerName) {
		this.certificationBatchPreparerName = certificationBatchPreparerName;
	}

	public Date getCertificationDueDate() {
		return certificationDueDate;
	}

	public void setCertificationDueDate(Date certificationDueDate) {
		this.certificationDueDate = certificationDueDate;
	}

	public Date getContractExpirationDate() {
		return contractExpirationDate;
	}

	public void setContractExpirationDate(Date contractExpirationDate) {
		this.contractExpirationDate = contractExpirationDate;
	}
	
	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getCurrentInterestRatePercentCurrent() {
		return currentInterestRatePercentCurrent;
	}

	public void setCurrentInterestRatePercentCurrent(String currentInterestRatePercentCurrent) {
		this.currentInterestRatePercentCurrent = currentInterestRatePercentCurrent;
	}

	public String getDeliveryFeeAlt97OrAffordableGoldAlt97() {
		return deliveryFeeAlt97OrAffordableGoldAlt97;
	}

	public void setDeliveryFeeAlt97OrAffordableGoldAlt97(String deliveryFeeAlt97OrAffordableGoldAlt97) {
		this.deliveryFeeAlt97OrAffordableGoldAlt97 = deliveryFeeAlt97OrAffordableGoldAlt97;
	}
	
	public String getDeliveryFeeAlternativeStatedIncomeFee() {
		return deliveryFeeAlternativeStatedIncomeFee;
	}

	public void setDeliveryFeeAlternativeStatedIncomeFee(String deliveryFeeAlternativeStatedIncomeFee) {
		this.deliveryFeeAlternativeStatedIncomeFee = deliveryFeeAlternativeStatedIncomeFee;
	}
	
	public String getDeliveryFeeArmFee() {
		return deliveryFeeArmFee;
	}

	public void setDeliveryFeeArmFee(String deliveryFeeArmFee) {
		this.deliveryFeeArmFee = deliveryFeeArmFee;
	}
	
	public String getDeliveryFeeBalloonResetMortgagesFee() {
		return deliveryFeeBalloonResetMortgagesFee;
	}

	public void setDeliveryFeeBalloonResetMortgagesFee(String deliveryFeeBalloonResetMortgagesFee) {
		this.deliveryFeeBalloonResetMortgagesFee = deliveryFeeBalloonResetMortgagesFee;
	}
	
	public String getDeliveryFeeCaliforniaCondoFee() {
		return deliveryFeeCaliforniaCondoFee;
	}

	public void setDeliveryFeeCaliforniaCondoFee(String deliveryFeeCaliforniaCondoFee) {
		this.deliveryFeeCaliforniaCondoFee = deliveryFeeCaliforniaCondoFee;
	}

	public String getDeliveryFeeCashOutRefinanceFee() {
		return deliveryFeeCashOutRefinanceFee;
	}

	public void setDeliveryFeeCashOutRefinanceFee(String deliveryFeeCashOutRefinanceFee) {
		this.deliveryFeeCashOutRefinanceFee = deliveryFeeCashOutRefinanceFee;
	}

	public String getDeliveryFeeCSLTVFeeAMinusLP() {
		return deliveryFeeCSLTVFeeAMinusLP;
	}

	public void setDeliveryFeeCSLTVFeeAMinusLP(String deliveryFeeCSLTVFeeAMinusLP) {
		this.deliveryFeeCSLTVFeeAMinusLP = deliveryFeeCSLTVFeeAMinusLP;
	}

	public String getDeliveryFeeCSLTVFeeAMinusNonLP() {
		return deliveryFeeCSLTVFeeAMinusNonLP;
	}

	public void setDeliveryFeeCSLTVFeeAMinusNonLP(String deliveryFeeCSLTVFeeAMinusNonLP) {
		this.deliveryFeeCSLTVFeeAMinusNonLP = deliveryFeeCSLTVFeeAMinusNonLP;
	}

	public String getDeliveryFeeCustomMIFee() {
		return deliveryFeeCustomMIFee;
	}

	public void setDeliveryFeeCustomMIFee(String deliveryFeeCustomMIFee) {
		this.deliveryFeeCustomMIFee = deliveryFeeCustomMIFee;
	}

	public String getDeliveryFeeFICOAltMethodFee() {
		return deliveryFeeFICOAltMethodFee;
	}

	public void setDeliveryFeeFICOAltMethodFee(String deliveryFeeFICOAltMethodFee) {
		this.deliveryFeeFICOAltMethodFee = deliveryFeeFICOAltMethodFee;
	}

	public String getDeliveryFeeFreddieMac100LTVFee() {
		return deliveryFeeFreddieMac100LTVFee;
	}

	public void setDeliveryFeeFreddieMac100LTVFee(String deliveryFeeFreddieMac100LTVFee) {
		this.deliveryFeeFreddieMac100LTVFee = deliveryFeeFreddieMac100LTVFee;
	}

	public String getDeliveryFeeHomePossible() {
		return deliveryFeeHomePossible;
	}

	public void setDeliveryFeeHomePossible(String deliveryFeeHomePossible) {
		this.deliveryFeeHomePossible = deliveryFeeHomePossible;
	}

	public String getDeliveryFeeInitialInterest() {
		return deliveryFeeInitialInterest;
	}

	public void setDeliveryFeeInitialInterest(String deliveryFeeInitialInterest) {
		this.deliveryFeeInitialInterest = deliveryFeeInitialInterest;
	}

	public String getDeliveryFeeInvestmentPropertyMortgagesFee() {
		return deliveryFeeInvestmentPropertyMortgagesFee;
	}

	public void setDeliveryFeeInvestmentPropertyMortgagesFee(String deliveryFeeInvestmentPropertyMortgagesFee) {
		this.deliveryFeeInvestmentPropertyMortgagesFee = deliveryFeeInvestmentPropertyMortgagesFee;
	}

	public Date getExportCreatedDateTime() {
		return exportCreatedDateTime;
	}

	public void setExportCreatedDateTime(Date exportCreatedDateTime) {
		this.exportCreatedDateTime = exportCreatedDateTime;
	}

	public String getDeliveryFeeManufacturedHomesFee() {
		return deliveryFeeManufacturedHomesFee;
	}

	public void setDeliveryFeeManufacturedHomesFee(String deliveryFeeManufacturedHomesFee) {
		this.deliveryFeeManufacturedHomesFee = deliveryFeeManufacturedHomesFee;
	}

	public String getDeliveryFeeNumberOfUnitsFee() {
		return deliveryFeeNumberOfUnitsFee;
	}

	public void setDeliveryFeeNumberOfUnitsFee(String deliveryFeeNumberOfUnitsFee) {
		this.deliveryFeeNumberOfUnitsFee = deliveryFeeNumberOfUnitsFee;
	}

	public String getDeliveryFeePropertyInspectAltvFee() {
		return deliveryFeePropertyInspectAltvFee;
	}

	public void setDeliveryFeePropertyInspectAltvFee(String deliveryFeePropertyInspectAltvFee) {
		this.deliveryFeePropertyInspectAltvFee = deliveryFeePropertyInspectAltvFee;
	}

	public String getDeliveryFeeSeasonedLoanFee() {
		return deliveryFeeSeasonedLoanFee;
	}

	public void setDeliveryFeeSeasonedLoanFee(String deliveryFeeSeasonedLoanFee) {
		this.deliveryFeeSeasonedLoanFee = deliveryFeeSeasonedLoanFee;
	}

	public BigDecimal getDeliveryFeeSecondaryFinancingFee() {
		return deliveryFeeSecondaryFinancingFee;
	}

	public void setDeliveryFeeSecondaryFinancingFee(BigDecimal deliveryFeeSecondaryFinancingFee) {
		this.deliveryFeeSecondaryFinancingFee = deliveryFeeSecondaryFinancingFee;
	}

	public String getInvestorContractIdentifier() {
		return investorContractIdentifier;
	}

	public void setInvestorContractIdentifier(String investorContractIdentifier) {
		this.investorContractIdentifier = investorContractIdentifier;
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
	
	public String getRemittanceOption() {
		return remittanceOption;
	}

	public void setRemittanceOption(String remittanceOption) {
		this.remittanceOption = remittanceOption;
	}
	
	public String getRequiredSpreadGfee() {
		return remittanceOption;
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
}
