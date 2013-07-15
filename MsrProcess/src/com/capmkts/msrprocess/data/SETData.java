package com.capmkts.msrprocess.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "[CoIssue_Test].[dbo].[SETdata]")
public class SETData implements Serializable {
	
	@Id
	@GeneratedValue
	private int tableID;
	
	@Column(name = "[1st Due Date]")
	private Date   First_Due_Date;
	
	@Column(name = "[Amortization Term]")
	private String   Amortization_Term;
	
	@Column(name = "[Appraisal Amount]")
	private BigDecimal   Appraisal_Amount;
	
	@Column(name = "[Borrower Age]")
	private int   Borrower_Age;
	
	@Column(name = "[Borrower Credit Score]")
	private int   Borrower_Credit_Score;
	
	@Column(name = "[Borrower_Credit_Score_Type]")
	private String   Borrower_Credit_Score_Type;
	
	@Column(name = "[Borrower First Name]")
	private String   Borrower_First_Name;
	
	@Column(name = "[Borrower Gender]")
	private String   Borrower_Gender;
	
	@Column(name = "[Borrower Last Name]")
	private String   Borrower_Last_Name;
	
	@Column(name = "[Borrower Middle Initial]")
	private String   Borrower_Middle_Initial;
	
	@Column(name = "[Borrower Race]")
	private String   Borrower_Race;
	
	@Column(name = "[Borrower Social Security Number]")
	private int   Borrower_Social_Security_Number;
	
	@Column(name = "[Borrower Suffix Name]")
	private String   Borrower_Suffix_Name;
	
	@Column(name = "[Closing Date]")
	private Date   Closing_Date;
	
	@Column(name = "[Co-Borrower Age]")
	private int   Co_Borrower_Age;
	
	@Column(name = "[Co-Borrower Credit Score]")
	private int   Co_Borrower_Credit_Score;
	
	@Column(name = "[Co-Borrower Credit Score Type]")
	private String   Co_Borrower_Credit_Score_Type;
	
	@Column(name = "[Co-Borrower First Name]")
	private String   Co_Borrower_First_Name;
	
	@Column(name = "[Co-Borrower Gender]")
	private String   Co_Borrower_Gender;
	
	@Column(name = "[Co-Borrower Last Name]")
	private String   Co_Borrower_Last_Name;
	
	@Column(name = "[Co-Borrower Middle Initial]")
	private String   Co_Borrower_Middle_Initial;
	
	@Column(name = "[Co-Borrower Race]")
	private String   Co_Borrower_Race;
	
	@Column(name = "[Co-Borrower Social Security Number]")
	private int   Co_Borrower_Social_Security_Number;
	
	@Column(name = "[Co-Borrower Suffix Name]")
	private String   Co_Borrower_Suffix_Name;
	
	@Column(name = "[Commitment Effective Date]")
	private Date   Commitment_Effective_Date;
	
	@Column(name = "Constant PI]")
	private String   Constant_PI;
	
	@Column(name = "[Cross Sell Indicator]")
	private String   Cross_Sell_Indicator;
	
	@Column(name = "[Current Commitment Expiration Date]")
	private Date   Current_Commitment_Expiration_Date;
	
	@Column(name = "[Date of Mortgage Note]")
	private Date   Date_of_Mortgage_Note;
	
	@Column(name = "[Delivery Status]")
	private String   Delivery_Status;
	
	@Column(name = "[Casefile ID]")
	private String   Casefile_ID;
	
	@Column(name = "[EA Level]")
	private String   EA_Level;
	
	@Column(name = "[Escrow Collected Indicator]")
	private String   Escrow_Collected_Indicator;
	
	@Column(name = "[Fall Out Date]")
	private Date   Fall_Out_Date;
	
	@Column(name = "Fannie Mae Loan Number]")
	private String   Fannie_Mae_Loan_Number;
	
	@Column(name = "[First Lien Note Rate]")
	private BigDecimal   First_Lien_Note_Rate;
	
	@Column(name = "[First Time Homebuyer Indicator]")
	private String   First_Time_Homebuyer_Indicator;
	
	@Column(name = "[Funding Date]")
	private Date   Funding_Date;
	
	@Column(name = "[Interest Accrual Method]")
	private String   Interest_Accrual_Method;
	
	@Column(name = "[Investor Code]")
	private String   Investor_Code;
	
	@Column(name = "[Last Paid Installment Date]")
	private Date   Last_Paid_Installment_Date;
	
	@Column(name = "[Lender ID Seller Number]")
	private String   Lender_ID_Seller_Number;
	
	@Column(name = "[Lender Loan Number]")
	private String   Lender_Loan_Number;
	
	@Column(name = "[Lender Name]")
	private String   Lender_Name;
	
	@Column(name = "[Loan Amount]")
	private BigDecimal   Loan_Amount;
	
	@Column(name = "[Loan Type]")
	private String   Loan_Type;
	
	@Column(name = "[LTV Ratio]")
	private String   LTV_Ratio;
	
	@Column(name = "[MERS Mortgage ID Number]")
	private String   MERS_Mortgage_ID_Number;
	
	@Column(name = "[MI Certificate Number]")
	private String   MI_Certificate_Number;
	
	@Column(name = "[MI Code]")
	private String   MI_Code;
	
	@Column(name = "[Monthly Debt Expense]")
	private BigDecimal   Monthly_Debt_Expense;
	
	@Column(name = "[Monthly Housing Expense]")
	private BigDecimal   Monthly_Housing_Expense;
	
	@Column(name = "[Monthly Income Combined]")
	private BigDecimal   Monthly_Income_Combined;
	
	@Column(name = "[Number of bedrooms unit 1]")
	private int   Number_of_bedrooms_unit_1;
	
	@Column(name = "[Number of bedrooms unit 2]")
	private int   Number_of_bedrooms_unit_2;
	
	@Column(name = "[Number of bedrooms unit 3]")
	private int   Number_of_bedrooms_unit_3;
	
	@Column(name = "[Number of bedrooms unit 4]")
	private int   Number_of_bedrooms_unit_4;
	
	@Column(name = "[Number of Borrowers]")
	private int   Number_of_Borrowers;
	
	@Column(name = "[Occupancy Code]")
	private String   Occupancy_Code;
	
	@Column(name = "[Original Loan Amount]")
	private BigDecimal   Original_Loan_Amount;
	
	@Column(name = "[Original Term]")
	private String   Original_Term;
	
	@Column(name = "[Payment Effective Date]")
	private Date   Payment_Effective_Date;
	
	@Column(name = "[Payment Frequency]")
	private String   Payment_Frequency;
	
	@Column(name = "[Percent of MI Coverage]")
	private String   Percent_of_MI_Coverage;
	
	@Column(name = "[Product Name]")
	private String   Product_Name;
	
	@Column(name = "[Project Type]")
	private String   Project_Type;
	
	@Column(name = "[Property Address]")
	private String   Property_Address;
	
	@Column(name = "[Property Address City]")
	private String   Property_Address_City;
	
	@Column(name = "[Property Address State]")
	private String   Property_Address_State;
	
	@Column(name = "[Property Address Zip]")
	private String   Property_Address_Zip;
	
	@Column(name = "[Purchase Price]")
	private BigDecimal   Purchase_Price;
	
	@Column(name = "[Self Employed Indicator]")
	private String   Self_Employed_Indicator;
	
	@Column(name = "[Remittance Type]")
	private String   Remittance_Type;
	
	@Column(name = "[SET Loan Status]")
	private String   SET_Loan_Status;
	
	@Column(name = "[SET Pricing Date]")
	private Date   SET_Pricing_Date;
	
	@Column(name = "[Servicer Name]")
	private String   Servicer_Name;
	
	@Column(name = "[Servicer Number]")
	private String   Servicer_Number;
	
	@Column(name = "[Servicer Loan Number]")
	private String   Servicer_Loan_Number;
	
	@Column(name = "[Servicing Fee Percent]")
	private String   Servicing_Fee_Percent;
	
	@Column(name = "[Special Feature Code 1]")
	private String   Special_Feature_Code_1;
	
	@Column(name = "[Special Feature Code 2]")
	private String   Special_Feature_Code_2;
	
	@Column(name = "[Special Feature Code 3]")
	private String   Special_Feature_Code_3;
	
	@Column(name = "[Special Feature Code 4]")
	private String   Special_Feature_Code_4;
	
	@Column(name = "[Special Feature Code 5]")
	private String   Special_Feature_Code_5;
	
	@Column(name = "[Special Feature Code 6]")
	private String   Special_Feature_Code_6;
	
	@Column(name = "[SRP Base in points]")
	private BigDecimal   SRP_Base_in_points;
	
	@Column(name = "[SRP Gross in points]")
	private BigDecimal   SRP_Gross_in_points;
	
	@Column(name = "[SRP Net Funding in dollars]")
	private BigDecimal   SRP_Net_Funding_in_dollars;
	
	@Column(name = "[SRP Net in points]")
	private BigDecimal   SRP_Net_in_points;
	
	@Column(name = "[SRP Fee Amount 1]")
	private BigDecimal   SRP_Fee_Amount_1;
	
	@Column(name = "[SRP Fee Amount 2]")
	private BigDecimal   SRP_Fee_Amount_2;
	
	@Column(name = "[SRP Fee Amount 3]")
	private BigDecimal   SRP_Fee_Amount_3;
	
	@Column(name = "[SRP Fee Amount 4]")
	private BigDecimal   SRP_Fee_Amount_4;
	
	@Column(name = "[SRP Fee Amount 5]")
	private BigDecimal   SRP_Fee_Amount_5;
	
	@Column(name = "[SRP Fee Amount 6]")
	private BigDecimal   SRP_Fee_Amount_6;
	
	@Column(name = "[SRP Fee Amount 7]")
	private BigDecimal   SRP_Fee_Amount_7;
	
	@Column(name = "[SRP Fee Amount 8]")
	private BigDecimal   SRP_Fee_Amount_8;
	
	@Column(name = "[SRP Fee Amount 9]")
	private BigDecimal   SRP_Fee_Amount_9;
	
	@Column(name = "[SRP Fee Amount 10]")
	private BigDecimal   SRP_Fee_Amount_10;
	
	@Column(name = "[SRP Fee Description 1]")
	private String   SRP_Fee_Description_1;
	
	@Column(name = "[SRP Fee Description 2]")
	private String   SRP_Fee_Description_2;
	
	@Column(name = "[SRP Fee Description 3]")
	private String   SRP_Fee_Description_3;
	
	@Column(name = "[SRP Fee Description 4]")
	private String   SRP_Fee_Description_4;
	
	@Column(name = "[SRP Fee Description 5]")
	private String   SRP_Fee_Description_5;

	@Column(name = "[SRP Fee Description 6]")
	private String   SRP_Fee_Description_6;
	
	@Column(name = "[SRP Fee Description 7]")
	private String   SRP_Fee_Description_7;
	
	@Column(name = "[SRP Fee Description 8]")
	private String   SRP_Fee_Description_8;
	
	@Column(name = "[SRP Fee Description 9]")
	private String   SRP_Fee_Description_9;
	
	@Column(name = "[SRP Fee Description 10]")
	private String   SRP_Fee_Description_10;
	
	@Column(name = "[SRP Schedule Date]")
	private Date   SRP_Schedule_Date;
	
	@Column(name = "[Subject Property Number of Units]")
	private String   Subject_Property_Number_of_Units;
	
	@Column(name = "[Total Escrow in dollars]")
	private BigDecimal   Total_Escrow_in_dollars;
	
	@Column(name = "[Total Fees in dollars]")
	private BigDecimal   Total_Fees_in_dollars;
	
	@Column(name = "[Year Built]")
	private String   Year_Built;
	
	@Column(name = "[Property Appraisal Effective Date]")
	private Date   Property_Appraisal_Effective_Date;
	
	@Column(name = "[Property Appraisal Form Number]")
	private String   Property_Appraisal_Form_Number;
	
	@Column(name = "[Loan Interest Rate Adjustment Subsequent Cap Percent]")
	private BigDecimal   Loan_Interest_Rate_Adjustment_Subsequent_Cap_Percent;
	
	@Column(name = "[Loan Interest Rate Adjustment Change Effective Due Date]")
	private Date   Loan_Interest_Rate_Adjustment_Change_Effective_Due_Date;
	
	@Column(name = "[Loan Interest Rate Lifetime Adjustment Ceiling Factor]")
	private BigDecimal   Loan_Interest_Rate_Lifetime_Adjustment_Ceiling_Factor;
	
	@Column(name = "[Loan Margin Rate]")
	private BigDecimal   Loan_Margin_Rate;
	
	@Column(name = "[Loan Interest Rate Next Adjustment Date]")
	private Date   Loan_Interest_Rate_Next_Adjustment_Date;
	
	@Column(name = "[Loan Interest Rate Lifetime Adjustment Floor Factor]")
	private BigDecimal   Loan_Interest_Rate_Lifetime_Adjustment_Floor_Factor;
	
	@Column(name = "[Borrower Phone Number]")
	private String   Borrower_Phone_Number;
	
	@Column(name = "[Address County Code]")
	private String   Address_County_Code;
	
	@Column(name = "[Property Legal Description Block]")
	private String   Property_Legal_Description_Block;
	
	@Column(name = "[Property Legal Description Lot]")
	private String   Property_Legal_Description_Lot;
	
	@Column(name = "[Property Legal Description Section]")
	private String   Property_Legal_Description_Section;
	
	@Column(name = "[Property Legal Description Subdivision]")
	private String   Property_Legal_Description_Subdivision;
	
	@Column(name = "[Mailing Address Same As Property Address Indicator]")
	private String   Mailing_Address_Same_As_Property_Address_Indicator;
	
	@Column(name = "[Mailing Address City Name")
	private String   Mailing_Address_City_Name;
	
	@Column(name = "[Mailing Address State Code]")
	private String   Mailing_Address_State_Code;
	
	@Column(name = "[Mailing Address Street Line 1 Address]")
	private String   Mailing_Address_Street_Line_1_Address;
	
	@Column(name = "[Mailing Address Street Line 2 Address]")
	private String   Mailing_Address_Street_Line_2_Address;
	
	@Column(name = "[Mailing Address Street Line 3 Address]")
	private String   Mailing_Address_Street_Line_3_Address;
	
	@Column(name = "[Mailing Address Postal Code]")
	private String   Mailing_Address_Postal_Code;
	
	@Column(name = "[Loan Maturity Date]")
	private Date   Loan_Maturity_Date;
	
	@Column(name = "[Loan MERS As Original Mortgage Indicator]")
	private String   Loan_MERS_As_Original_Mortgage_Indicator;
	
	@Column(name = "[Loan Annual Percentage Rate]")
	private BigDecimal   Loan_Annual_Percentage_Rate;
	
	@Column(name = "[Borrower Social Security Number Certification Indicator]")
	private String   Borrower_Social_Security_Number_Certification_Indicator;
	
	@Column(name = "[Co-Borrower Social Security Number Certification Indicator]")
	private String   Co_Borrower_Social_Security_Number_Certification_Indicator;
	
	@Column(name = "[GSE Property Type Code]")
	private String   GSE_Property_Type_Code;
	
	@Column(name = "[Property Flood Area Indicator]")
	private String   Property_Flood_Area_Indicator;
	
	@Column(name = "[Property Flood Zone Letter Code]")
	private String   Property_Flood_Zone_Letter_Code;
	
	@Column(name = "[Property Flood Determination Company Name]")
	private String   Property_Flood_Determination_Company_Name;
	
	@Column(name = "[Property Flood Determination Date]")
	private Date   Property_Flood_Determination_Date;
	
	@Column(name = "[Property Flood Determination Last Revised Date]")
	private Date   Property_Flood_Determination_Last_Revised_Date;
	
	@Column(name = "[Property Flood Determination Letter Of Map Revision Date]")
	private Date   Property_Flood_Determination_Letter_Of_Map_Revision_Date;
	
	@Column(name = "[Property Flood Certification Identifier]")
	private String   Property_Flood_Certification_Identifier;
	
	@Column(name = "[Property Flood Map Panel Identifier]")
	private String   Property_Flood_Map_Panel_Identifier;
	
	@Column(name = "[Property Flood Certification Community Status Indicator]")
	private String   Property_Flood_Certification_Community_Status_Indicator;
	
	@Column(name = "[Property Flood Insurance Payee Name]")
	private String   Property_Flood_Insurance_Payee_Name;
	
	@Column(name = "[Property Flood Insurance Policy Coverage Amount]")
	private BigDecimal   Property_Flood_Insurance_Policy_Coverage_Amount;
	
	@Column(name = "[Property Flood Insurance Policy Expiration Date]")
	private Date   Property_Flood_Insurance_Policy_Expiration_Date;
	
	@Column(name = "[Property Flood Insurance Policy Number]")
	private String   Property_Flood_Insurance_Policy_Number;
	
	@Column(name = "[Property Flood Insurance Policy Premium Amount]")
	private BigDecimal   Property_Flood_Insurance_Policy_Premium_Amount;
	
	@Column(name = "[Property Flood Insurance Policy Escrow Status Indicator]")
	private String   Property_Flood_Insurance_Policy_Escrow_Status_Indicator;
	
	@Column(name = "[Property Hazard Area Insurance Payee Name]")
	private String   Property_Hazard_Area_Insurance_Payee_Name;
	
	@Column(name = "[Property Hazard Area Insurance Policy Coverage Amount")
	private BigDecimal   Property_Hazard_Area_Insurance_Policy_Coverage_Amount;
	
	@Column(name = "[Property Hazard Area Insurance Policy Expiration Date]")
	private Date   Property_Hazard_Area_Insurance_Policy_Expiration_Date;
	
	@Column(name = "[Property Hazard Area Insurance Policy Number]")
	private String   Property_Hazard_Area_Insurance_Policy_Number;
	
	@Column(name = "[Property Hazard Area Insurance Policy Premium Amount]")
	private BigDecimal   Property_Hazard_Area_Insurance_Policy_Premium_Amount;
	
	@Column(name = "[Property Hazard Insurance Policy Escrow Status Indicator]")
	private String   Property_Hazard_Insurance_Policy_Escrow_Status_Indicator;
	
	@Column(name = "[Property Hazard Area Insurance Coverage Indicator]")
	private String   Property_Hazard_Area_Insurance_Coverage_Indicator;
	
	@Column(name = "[Property Wind Insurance Payee Name]")
	private String   Property_Wind_Insurance_Payee_Name;
	
	@Column(name = "[Property Wind Insurance Policy Coverage Amount]")
	private BigDecimal   Property_Wind_Insurance_Policy_Coverage_Amount;
	
	@Column(name = "[Property Wind Insurance Policy Expiration Date]")
	private Date   Property_Wind_Insurance_Policy_Expiration_Date;
	
	@Column(name = "[Property Wind Insurance Policy Number]")
	private String   Property_Wind_Insurance_Policy_Number;
	
	@Column(name = "[Property Wind Insurance Policy Premium Amount]")
	private BigDecimal   Property_Wind_Insurance_Policy_Premium_Amount;
	
	@Column(name = "[Property Wind Insurance Policy Escrow Status Indicator]")
	private String   Property_Wind_Insurance_Policy_Escrow_Status_Indicator;
	
	@Column(name = "[Property Wind Insurance Coverage Indicator]")
	private String   Property_Wind_Insurance_Coverage_Indicator;
	
	@Column(name = "[Property Earthquake Insurance Payee Name]")
	private String   Property_Earthquake_Insurance_Payee_Name;
	
	@Column(name = "[Property Earthquake Insurance Policy Coverage Amount]")
	private BigDecimal   Property_Earthquake_Insurance_Policy_Coverage_Amount;
	
	@Column(name = "[Property Earthquake Insurance Policy Expiration Date]")
	private Date   Property_Earthquake_Insurance_Policy_Expiration_Date;
	
	@Column(name = "[Property Earthquake Insurance Policy Number]")
	private String   Property_Earthquake_Insurance_Policy_Number;
	
	@Column(name = "[Property Earthquake Insurance Policy Premium Amount]")
	private BigDecimal   Property_Earthquake_Insurance_Policy_Premium_Amount;
	
	@Column(name = "[Property Earthquake Insurance Policy Escrow Status Indicator]")
	private String   Property_Earthquake_Insurance_Policy_Escrow_Status_Indicator;
	
	@Column(name = "[Property Earthquake Insurance Coverage Indicator]")
	private String   Property_Earthquake_Insurance_Coverage_Indicator;
	
	@Column(name = "[Property Condo Contents Insurance Payee Name]")
	private String   Property_Condo_Contents_Insurance_Payee_Name;
	
	@Column(name = "[Property Condo Contents Insurance Policy Coverage Amount]")
	private BigDecimal   Property_Condo_Contents_Insurance_Policy_Coverage_Amount;
	
	@Column(name = "[Property Condo Contents Insurance Policy Expiration Date]")
	private Date   Property_Condo_Contents_Insurance_Policy_Expiration_Date;
	
	@Column(name = "[Property Condo Contents Insurance Policy Number]")
	private String   Property_Condo_Contents_Insurance_Policy_Number;
	
	@Column(name = "[Property Condo Contents Insurance Policy Premium Amount]")
	private BigDecimal   Property_Condo_Contents_Insurance_Policy_Premium_Amount;
	
	@Column(name = "[Property Condo Contents Insurance Policy Escrow Status Indicator]")
	private String   Property_Condo_Contents_Insurance_Policy_Escrow_Status_Indicator;
	
	@Column(name = "[Property Condo Contents Insurance Coverage Indicator]")
	private String   Property_Condo_Contents_Insurance_Coverage_Indicator;
	
	@Column(name = "[Property Condo Flood Insurance Payee Name]")
	private String   Property_Condo_Flood_Insurance_Payee_Name;
	
	@Column(name = "[Property Condo Flood Insurance Policy Coverage Amount]")
	private BigDecimal   Property_Condo_Flood_Insurance_Policy_Coverage_Amount;
	
	@Column(name = "[Property Condo Flood Insurance Policy Expiration Date]")
	private Date   Property_Condo_Flood_Insurance_Policy_Expiration_Date;
	
	@Column(name = "[Property Condo Flood Insurance Policy Number]")
	private String   Property_Condo_Flood_Insurance_Policy_Number;
	
	@Column(name = "[Property Condo Flood Insurance Policy Premium Amount")
	private BigDecimal   Property_Condo_Flood_Insurance_Policy_Premium_Amount;
	
	@Column(name = "[Property Condo Flood Insurance Policy Escrow Status Indicator]")
	private String   Property_Condo_Flood_Insurance_Policy_Escrow_Status_Indicator;
	
	@Column(name = "[Property Condo Flood Insurance Coverage Indicator]")
	private String   Property_Condo_Flood_Insurance_Coverage_Indicator;
	
	@Column(name = "[Mortgage Insurance Next Premium Due Date]")
	private Date   Mortgage_Insurance_Next_Premium_Due_Date;
	
	@Column(name = "[Mortgage Insurance Payment Frequency Code Description]")
	private String   Mortgage_Insurance_Payment_Frequency_Code_Description;
	
	@Column(name = "[Mortgage Insurance Premium Amount]")
	private BigDecimal   Mortgage_Insurance_Premium_Amount;
	
	@Column(name = "[Mortgage Insurance Rate]")
	private BigDecimal   Mortgage_Insurance_Rate;
	
	@Column(name = "[Property County Tax Indicator]")
	private String   Property_County_Tax_Indicator;
	
	@Column(name= "[Property County Tax Disbursement Amount]")
	private BigDecimal   Property_County_Tax_Disbursement_Amount;
	
	@Column(name = "[Property County Tax Disbursement Due Date]")
	private Date   Property_County_Tax_Disbursement_Due_Date;
	
	@Column(name = "[Property County Tax Parcel Number]")
	private String   Property_County_Tax_Parcel_Number;
	
	@Column(name = "[Property County Tax Payment Frequency Code Description]")
	private String   Property_County_Tax_Payment_Frequency_Code_Description;
	
	@Column(name = "[Property County Tax Escrow Status Indicator]")
	private String   Property_County_Tax_Escrow_Status_Indicator;
	
	@Column(name = "[Property County Tax Authority Name]")
	private String   Property_County_Tax_Authority_Name;
	
	@Column(name = "[Property City Tax Indicator]")
	private String   Property_City_Tax_Indicator;
	
	@Column(name = "[Property City Tax Disbursement Amount]")
	private BigDecimal   Property_City_Tax_Disbursement_Amount;
	
	@Column(name = "[Property City Tax Disbursement Due Date]")
	private Date   Property_City_Tax_Disbursement_Due_Date;
	
	@Column(name = "[Property City Tax Parcel Number]")
	private String   Property_City_Tax_Parcel_Number;
	
	@Column(name = "[Property City Tax Payment Frequency Code Description]")
	private String   Property_City_Tax_Payment_Frequency_Code_Description;
	
	@Column(name = "[Property City Tax Escrow Status Indicator]")
	private String   Property_City_Tax_Escrow_Status_Indicator;
	
	@Column(name = "[Property City Tax Authority Name]")
	private String   Property_City_Tax_Authority_Name;
	
	@Column(name = "[Property School Tax Indicator]")
	private String   Property_School_Tax_Indicator;
	
	@Column(name = "[Property School Tax Disbursement Amount]")
	private BigDecimal   Property_School_Tax_Disbursement_Amount;
	
	@Column(name = "[Property School Tax Disbursement Due Date]")
	private Date   Property_School_Tax_Disbursement_Due_Date;
	
	@Column(name = "[Property School Tax Parcel Number")
	private String   Property_School_Tax_Parcel_Number;
	
	@Column(name = "[Property School Tax Payment Frequency Code Description]")
	private String   Property_School_Tax_Payment_Frequency_Code_Description;
	
	@Column(name = "[Property School Tax Escrow Status Indicator]")
	private String   Property_School_Tax_Escrow_Status_Indicator;
	
	@Column(name = "[Property School Tax Authority Name]")
	private String   Property_School_Tax_Authority_Name;
	
	@Column(name = "[Property Town Tax Indicator]")
	private String   Property_Town_Tax_Indicator;
	
	@Column(name = "[Property Town Tax Disbursement Amount]")
	private BigDecimal   Property_Town_Tax_Disbursement_Amount;
	
	@Column(name = "[Property Town Tax Disbursement Due Date")
	private Date   Property_Town_Tax_Disbursement_Due_Date;
	
	@Column(name = "[Property Town Tax Parcel Number]")
	private String   Property_Town_Tax_Parcel_Number;
	
	@Column(name = "[Property Town Tax Payment Frequency Code Description]")
	private String   Property_Town_Tax_Payment_Frequency_Code_Description;
	
	@Column(name = "[Property Town Tax Escrow Status Indicator]")
	private String   Property_Town_Tax_Escrow_Status_Indicator;
	
	@Column(name = "[Property Town Tax Authority Name]")
	private String   Property_Town_Tax_Authority_Name;
	
	@Column(name = "[Property Other Tax Indicator]")
	private String   Property_Other_Tax_Indicator;
	
	@Column(name = "[Property Other Tax Type Description]")
	private String   Property_Other_Tax_Type_Description;
	
	@Column(name = "[Property Other Tax Disbursement Amount]")
	private BigDecimal   Property_Other_Tax_Disbursement_Amount;
	
	@Column(name = "Property Other Tax Disbursement Due Date")
	private Date   Property_Other_Tax_Disbursement_Due_Date;
	
	@Column(name = "[Property Other Tax Parcel Number]")
	private String   Property_Other_Tax_Parcel_Number;
	
	@Column(name = "[Property Other Tax Payment Frequency Code Description]")
	private String   Property_Other_Tax_Payment_Frequency_Code_Description;
	
	@Column(name = "[Property Other Tax Escrow Status Indicator]")
	private String   Property_Other_Tax_Escrow_Status_Indicator;
	
	@Column(name = "[Property Other Tax Authority Name]")
	private String   Property_Other_Tax_Authority_Name;
	
	@Column(name = "[Loan Escrow Cushion Collected Term]")
	private String   Loan_Escrow_Cushion_Collected_Term;
	
	@Column(name = "[Borrower Work Telephone Number]")
	private String   Borrower_Work_Telephone_Number;
	
	@Column(name = "[Loan Purpose Type Code]")
	private String   Loan_Purpose_Type_Code;
	
	@Column(name = "[Loan Prepayment Penalty Indicator]")
	private String   Loan_Prepayment_Penalty_Indicator;
	
	@Column(name = "[Loan Note Late Fee Grace Period]")
	private String   Loan_Note_Late_Fee_Grace_Period;
	
	@Column(name = "[Loan Note Late Fee Percent]")
	private BigDecimal   Loan_Note_Late_Fee_Percent;
	
	@Column(name = "[Loan Note Late Fee Option Type Code]")
	private String   Loan_Note_Late_Fee_Option_Type_Code;
	
	@Column(name = "[Loan Interest Rate Buydown Balance Purchased Amount]")
	private BigDecimal   Loan_Interest_Rate_Buydown_Balance_Purchased_Amount;
	
	@Column(name = "[Loan Interest Rate Original Buydown Balance Amount]")
	private BigDecimal   Loan_Interest_Rate_Original_Buydown_Balance_Amount;
	
	@Column(name = "[Loan Interest Rate Original Buydown Term]")
	private BigDecimal   Loan_Interest_Rate_Original_Buydown_Term;
	
	@Column(name = "[Loan Interest Rate Buydown Term]")
	private BigDecimal   Loan_Interest_Rate_Buydown_Term;
	
	@Column(name = "[Loan Interest Rate Buydown First Payment Amount]")
	private BigDecimal   Loan_Interest_Rate_Buydown_First_Payment_Amount;
	
	@Column(name = "[Loan Interest Rate Buydown Second Payment Amount]")
	private BigDecimal   Loan_Interest_Rate_Buydown_Second_Payment_Amount;
	
	@Column(name = "[Loan Monthly Tax And Insurance Payment Amount]")
	private BigDecimal   Loan_Monthly_Tax_And_Insurance_Payment_Amount;
	
	@Column(name = "[Last Successful Data Import]")
	private String   Last_Successful_Data_Import;
	
	public int getTableId() {
		return tableID;
	}
	public void setTableID(int tableID) {
		this.tableID = tableID;
	}
	public Date getFirst_Due_Date() {
		return First_Due_Date;
	}
	public void setFirst_Due_Date(Date first_Due_Date) {
		First_Due_Date = first_Due_Date;
	}
	public String getAmortization_Term() {
		return Amortization_Term;
	}
	public void setAmortization_Term(String amortization_Term) {
		Amortization_Term = amortization_Term;
	}
	public BigDecimal getAppraisal_Amount() {
		return Appraisal_Amount;
	}
	public void setAppraisal_Amount(BigDecimal appraisal_Amount) {
		Appraisal_Amount = appraisal_Amount;
	}
	public int getBorrower_Age() {
		return Borrower_Age;
	}
	public void setBorrower_Age(int borrower_Age) {
		Borrower_Age = borrower_Age;
	}
	public int getBorrower_Credit_Score() {
		return Borrower_Credit_Score;
	}
	public void setBorrower_Credit_Score(int borrower_Credit_Score) {
		Borrower_Credit_Score = borrower_Credit_Score;
	}
	public String getBorrower_Credit_Score_Type() {
		return Borrower_Credit_Score_Type;
	}
	public void setBorrower_Credit_Score_Type(String borrower_Credit_Score_Type) {
		Borrower_Credit_Score_Type = borrower_Credit_Score_Type;
	}
	public String getBorrower_First_Name() {
		return Borrower_First_Name;
	}
	public void setBorrower_First_Name(String borrower_First_Name) {
		Borrower_First_Name = borrower_First_Name;
	}
	public String getBorrower_Gender() {
		return Borrower_Gender;
	}
	public void setBorrower_Gender(String borrower_Gender) {
		Borrower_Gender = borrower_Gender;
	}
	public String getBorrower_Last_Name() {
		return Borrower_Last_Name;
	}
	public void setBorrower_Last_Name(String borrower_Last_Name) {
		Borrower_Last_Name = borrower_Last_Name;
	}
	public String getBorrower_Middle_Initial() {
		return Borrower_Middle_Initial;
	}
	public void setBorrower_Middle_Initial(String borrower_Middle_Initial) {
		Borrower_Middle_Initial = borrower_Middle_Initial;
	}
	public String getBorrower_Race() {
		return Borrower_Race;
	}
	public void setBorrower_Race(String borrower_Race) {
		Borrower_Race = borrower_Race;
	}
	public int getBorrower_Social_Security_Number() {
		return Borrower_Social_Security_Number;
	}
	public void setBorrower_Social_Security_Number(
			int borrower_Social_Security_Number) {
		Borrower_Social_Security_Number = borrower_Social_Security_Number;
	}
	public String getBorrower_Suffix_Name() {
		return Borrower_Suffix_Name;
	}
	public void setBorrower_Suffix_Name(String borrower_Suffix_Name) {
		Borrower_Suffix_Name = borrower_Suffix_Name;
	}
	public Date getClosing_Date() {
		return Closing_Date;
	}
	public void setClosing_Date(Date closing_Date) {
		Closing_Date = closing_Date;
	}
	public int getCo_Borrower_Age() {
		return Co_Borrower_Age;
	}
	public void setCo_Borrower_Age(int co_Borrower_Age) {
		Co_Borrower_Age = co_Borrower_Age;
	}
	public int getCo_Borrower_Credit_Score() {
		return Co_Borrower_Credit_Score;
	}
	public void setCo_Borrower_Credit_Score(int co_Borrower_Credit_Score) {
		Co_Borrower_Credit_Score = co_Borrower_Credit_Score;
	}
	public String getCo_Borrower_Credit_Score_Type() {
		return Co_Borrower_Credit_Score_Type;
	}
	public void setCo_Borrower_Credit_Score_Type(
			String co_Borrower_Credit_Score_Type) {
		Co_Borrower_Credit_Score_Type = co_Borrower_Credit_Score_Type;
	}
	public String getCo_Borrower_First_Name() {
		return Co_Borrower_First_Name;
	}
	public void setCo_Borrower_First_Name(String co_Borrower_First_Name) {
		Co_Borrower_First_Name = co_Borrower_First_Name;
	}
	public String getCo_Borrower_Gender() {
		return Co_Borrower_Gender;
	}
	public void setCo_Borrower_Gender(String co_Borrower_Gender) {
		Co_Borrower_Gender = co_Borrower_Gender;
	}
	public String getCo_Borrower_Last_Name() {
		return Co_Borrower_Last_Name;
	}
	public void setCo_Borrower_Last_Name(String co_Borrower_Last_Name) {
		Co_Borrower_Last_Name = co_Borrower_Last_Name;
	}
	public String getCo_Borrower_Middle_Initial() {
		return Co_Borrower_Middle_Initial;
	}
	public void setCo_Borrower_Middle_Initial(String co_Borrower_Middle_Initial) {
		Co_Borrower_Middle_Initial = co_Borrower_Middle_Initial;
	}
	public String getCo_Borrower_Race() {
		return Co_Borrower_Race;
	}
	public void setCo_Borrower_Race(String co_Borrower_Race) {
		Co_Borrower_Race = co_Borrower_Race;
	}
	public int getCo_Borrower_Social_Security_Number() {
		return Co_Borrower_Social_Security_Number;
	}
	public void setCo_Borrower_Social_Security_Number(
			int co_Borrower_Social_Security_Number) {
		Co_Borrower_Social_Security_Number = co_Borrower_Social_Security_Number;
	}
	public String getCo_Borrower_Suffix_Name() {
		return Co_Borrower_Suffix_Name;
	}
	public void setCo_Borrower_Suffix_Name(String co_Borrower_Suffix_Name) {
		Co_Borrower_Suffix_Name = co_Borrower_Suffix_Name;
	}
	public Date getCommitment_Effective_Date() {
		return Commitment_Effective_Date;
	}
	public void setCommitment_Effective_Date(Date commitment_Effective_Date) {
		Commitment_Effective_Date = commitment_Effective_Date;
	}
	public String getConstant_PI() {
		return Constant_PI;
	}
	public void setConstant_PI(String constant_PI) {
		Constant_PI = constant_PI;
	}
	public String getCross_Sell_Indicator() {
		return Cross_Sell_Indicator;
	}
	public void setCross_Sell_Indicator(String cross_Sell_Indicator) {
		Cross_Sell_Indicator = cross_Sell_Indicator;
	}
	public Date getCurrent_Commitment_Expiration_Date() {
		return Current_Commitment_Expiration_Date;
	}
	public void setCurrent_Commitment_Expiration_Date(
			Date current_Commitment_Expiration_Date) {
		Current_Commitment_Expiration_Date = current_Commitment_Expiration_Date;
	}
	public Date getDate_of_Mortgage_Note() {
		return Date_of_Mortgage_Note;
	}
	public void setDate_of_Mortgage_Note(Date date_of_Mortgage_Note) {
		Date_of_Mortgage_Note = date_of_Mortgage_Note;
	}
	public String getDelivery_Status() {
		return Delivery_Status;
	}
	public void setDelivery_Status(String delivery_Status) {
		Delivery_Status = delivery_Status;
	}
	public String getCasefile_ID() {
		return Casefile_ID;
	}
	public void setCasefile_ID(String casefile_ID) {
		Casefile_ID = casefile_ID;
	}
	public String getEA_Level() {
		return EA_Level;
	}
	public void setEA_Level(String eA_Level) {
		EA_Level = eA_Level;
	}
	public String getEscrow_Collected_Indicator() {
		return Escrow_Collected_Indicator;
	}
	public void setEscrow_Collected_Indicator(String escrow_Collected_Indicator) {
		Escrow_Collected_Indicator = escrow_Collected_Indicator;
	}
	public Date getFall_Out_Date() {
		return Fall_Out_Date;
	}
	public void setFall_Out_Date(Date fall_Out_Date) {
		Fall_Out_Date = fall_Out_Date;
	}
	public String getFannie_Mae_Loan_Number() {
		return Fannie_Mae_Loan_Number;
	}
	public void setFannie_Mae_Loan_Number(String fannie_Mae_Loan_Number) {
		Fannie_Mae_Loan_Number = fannie_Mae_Loan_Number;
	}
	public BigDecimal getFirst_Lien_Note_Rate() {
		return First_Lien_Note_Rate;
	}
	public void setFirst_Lien_Note_Rate(BigDecimal first_Lien_Note_Rate) {
		First_Lien_Note_Rate = first_Lien_Note_Rate;
	}
	public String getFirst_Time_Homebuyer_Indicator() {
		return First_Time_Homebuyer_Indicator;
	}
	public void setFirst_Time_Homebuyer_Indicator(
			String first_Time_Homebuyer_Indicator) {
		First_Time_Homebuyer_Indicator = first_Time_Homebuyer_Indicator;
	}
	public Date getFunding_Date() {
		return Funding_Date;
	}
	public void setFunding_Date(Date funding_Date) {
		Funding_Date = funding_Date;
	}
	public String getInterest_Accrual_Method() {
		return Interest_Accrual_Method;
	}
	public void setInterest_Accrual_Method(String interest_Accrual_Method) {
		Interest_Accrual_Method = interest_Accrual_Method;
	}
	public String getInvestor_Code() {
		return Investor_Code;
	}
	public void setInvestor_Code(String investor_Code) {
		Investor_Code = investor_Code;
	}
	public Date getLast_Paid_Installment_Date() {
		return Last_Paid_Installment_Date;
	}
	public void setLast_Paid_Installment_Date(Date last_Paid_Installment_Date) {
		Last_Paid_Installment_Date = last_Paid_Installment_Date;
	}
	public String getLender_ID_Seller_Number() {
		return Lender_ID_Seller_Number;
	}
	public void setLender_ID_Seller_Number(String lender_ID_Seller_Number) {
		Lender_ID_Seller_Number = lender_ID_Seller_Number;
	}
	public String getLender_Loan_Number() {
		return Lender_Loan_Number;
	}
	public void setLender_Loan_Number(String lender_Loan_Number) {
		Lender_Loan_Number = lender_Loan_Number;
	}
	public String getLender_Name() {
		return Lender_Name;
	}
	public void setLender_Name(String lender_Name) {
		Lender_Name = lender_Name;
	}
	public BigDecimal getLoan_Amount() {
		return Loan_Amount;
	}
	public void setLoan_Amount(BigDecimal loan_Amount) {
		Loan_Amount = loan_Amount;
	}
	public String getLoan_Type() {
		return Loan_Type;
	}
	public void setLoan_Type(String loan_Type) {
		Loan_Type = loan_Type;
	}
	public String getLTV_Ratio() {
		return LTV_Ratio;
	}
	public void setLTV_Ratio(String lTV_Ratio) {
		LTV_Ratio = lTV_Ratio;
	}
	public String getMERS_Mortgage_ID_Number() {
		return MERS_Mortgage_ID_Number;
	}
	public void setMERS_Mortgage_ID_Number(String mERS_Mortgage_ID_Number) {
		MERS_Mortgage_ID_Number = mERS_Mortgage_ID_Number;
	}
	public String getMI_Certificate_Number() {
		return MI_Certificate_Number;
	}
	public void setMI_Certificate_Number(String mI_Certificate_Number) {
		MI_Certificate_Number = mI_Certificate_Number;
	}
	public String getMI_Code() {
		return MI_Code;
	}
	public void setMI_Code(String mI_Code) {
		MI_Code = mI_Code;
	}
	public BigDecimal getMonthly_Debt_Expense() {
		return Monthly_Debt_Expense;
	}
	public void setMonthly_Debt_Expense(BigDecimal monthly_Debt_Expense) {
		Monthly_Debt_Expense = monthly_Debt_Expense;
	}
	public BigDecimal getMonthly_Housing_Expense() {
		return Monthly_Housing_Expense;
	}
	public void setMonthly_Housing_Expense(BigDecimal monthly_Housing_Expense) {
		Monthly_Housing_Expense = monthly_Housing_Expense;
	}
	public BigDecimal getMonthly_Income_Combined() {
		return Monthly_Income_Combined;
	}
	public void setMonthly_Income_Combined(BigDecimal monthly_Income_Combined) {
		Monthly_Income_Combined = monthly_Income_Combined;
	}
	public int getNumber_of_bedrooms_unit_1() {
		return Number_of_bedrooms_unit_1;
	}
	public void setNumber_of_bedrooms_unit_1(int number_of_bedrooms_unit_1) {
		Number_of_bedrooms_unit_1 = number_of_bedrooms_unit_1;
	}
	public int getNumber_of_bedrooms_unit_2() {
		return Number_of_bedrooms_unit_2;
	}
	public void setNumber_of_bedrooms_unit_2(int number_of_bedrooms_unit_2) {
		Number_of_bedrooms_unit_2 = number_of_bedrooms_unit_2;
	}
	public int getNumber_of_bedrooms_unit_3() {
		return Number_of_bedrooms_unit_3;
	}
	public void setNumber_of_bedrooms_unit_3(int number_of_bedrooms_unit_3) {
		Number_of_bedrooms_unit_3 = number_of_bedrooms_unit_3;
	}
	public int getNumber_of_bedrooms_unit_4() {
		return Number_of_bedrooms_unit_4;
	}
	public void setNumber_of_bedrooms_unit_4(int number_of_bedrooms_unit_4) {
		Number_of_bedrooms_unit_4 = number_of_bedrooms_unit_4;
	}
	public int getNumber_of_Borrowers() {
		return Number_of_Borrowers;
	}
	public void setNumber_of_Borrowers(int number_of_Borrowers) {
		Number_of_Borrowers = number_of_Borrowers;
	}
	public String getOccupancy_Code() {
		return Occupancy_Code;
	}
	public void setOccupancy_Code(String occupancy_Code) {
		Occupancy_Code = occupancy_Code;
	}
	public BigDecimal getOriginal_Loan_Amount() {
		return Original_Loan_Amount;
	}
	public void setOriginal_Loan_Amount(BigDecimal original_Loan_Amount) {
		Original_Loan_Amount = original_Loan_Amount;
	}
	public String getOriginal_Term() {
		return Original_Term;
	}
	public void setOriginal_Term(String original_Term) {
		Original_Term = original_Term;
	}
	public Date getPayment_Effective_Date() {
		return Payment_Effective_Date;
	}
	public void setPayment_Effective_Date(Date payment_Effective_Date) {
		Payment_Effective_Date = payment_Effective_Date;
	}
	public String getPayment_Frequency() {
		return Payment_Frequency;
	}
	public void setPayment_Frequency(String payment_Frequency) {
		Payment_Frequency = payment_Frequency;
	}
	public String getPercent_of_MI_Coverage() {
		return Percent_of_MI_Coverage;
	}
	public void setPercent_of_MI_Coverage(String percent_of_MI_Coverage) {
		Percent_of_MI_Coverage = percent_of_MI_Coverage;
	}
	public String getProduct_Name() {
		return Product_Name;
	}
	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}
	public String getProject_Type() {
		return Project_Type;
	}
	public void setProject_Type(String project_Type) {
		Project_Type = project_Type;
	}
	public String getProperty_Address() {
		return Property_Address;
	}
	public void setProperty_Address(String property_Address) {
		Property_Address = property_Address;
	}
	public String getProperty_Address_City() {
		return Property_Address_City;
	}
	public void setProperty_Address_City(String property_Address_City) {
		Property_Address_City = property_Address_City;
	}
	public String getProperty_Address_State() {
		return Property_Address_State;
	}
	public void setProperty_Address_State(String property_Address_State) {
		Property_Address_State = property_Address_State;
	}
	public String getProperty_Address_Zip() {
		return Property_Address_Zip;
	}
	public void setProperty_Address_Zip(String property_Address_Zip) {
		Property_Address_Zip = property_Address_Zip;
	}
	public BigDecimal getPurchase_Price() {
		return Purchase_Price;
	}
	public void setPurchase_Price(BigDecimal purchase_Price) {
		Purchase_Price = purchase_Price;
	}
	public String getSelf_Employed_Indicator() {
		return Self_Employed_Indicator;
	}
	public void setSelf_Employed_Indicator(String self_Employed_Indicator) {
		Self_Employed_Indicator = self_Employed_Indicator;
	}
	public String getRemittance_Type() {
		return Remittance_Type;
	}
	public void setRemittance_Type(String remittance_Type) {
		Remittance_Type = remittance_Type;
	}
	public String getSET_Loan_Status() {
		return SET_Loan_Status;
	}
	public void setSET_Loan_Status(String sET_Loan_Status) {
		SET_Loan_Status = sET_Loan_Status;
	}
	public Date getSET_Pricing_Date() {
		return SET_Pricing_Date;
	}
	public void setSET_Pricing_Date(Date sET_Pricing_Date) {
		SET_Pricing_Date = sET_Pricing_Date;
	}
	public String getServicer_Name() {
		return Servicer_Name;
	}
	public void setServicer_Name(String servicer_Name) {
		Servicer_Name = servicer_Name;
	}
	public String getServicer_Number() {
		return Servicer_Number;
	}
	public void setServicer_Number(String servicer_Number) {
		Servicer_Number = servicer_Number;
	}
	public String getServicer_Loan_Number() {
		return Servicer_Loan_Number;
	}
	public void setServicer_Loan_Number(String servicer_Loan_Number) {
		Servicer_Loan_Number = servicer_Loan_Number;
	}
	public String getServicing_Fee_Percent() {
		return Servicing_Fee_Percent;
	}
	public void setServicing_Fee_Percent(String servicing_Fee_Percent) {
		Servicing_Fee_Percent = servicing_Fee_Percent;
	}
	public String getSpecial_Feature_Code_1() {
		return Special_Feature_Code_1;
	}
	public void setSpecial_Feature_Code_1(String special_Feature_Code_1) {
		Special_Feature_Code_1 = special_Feature_Code_1;
	}
	public String getSpecial_Feature_Code_2() {
		return Special_Feature_Code_2;
	}
	public void setSpecial_Feature_Code_2(String special_Feature_Code_2) {
		Special_Feature_Code_2 = special_Feature_Code_2;
	}
	public String getSpecial_Feature_Code_3() {
		return Special_Feature_Code_3;
	}
	public void setSpecial_Feature_Code_3(String special_Feature_Code_3) {
		Special_Feature_Code_3 = special_Feature_Code_3;
	}
	public String getSpecial_Feature_Code_4() {
		return Special_Feature_Code_4;
	}
	public void setSpecial_Feature_Code_4(String special_Feature_Code_4) {
		Special_Feature_Code_4 = special_Feature_Code_4;
	}
	public String getSpecial_Feature_Code_5() {
		return Special_Feature_Code_5;
	}
	public void setSpecial_Feature_Code_5(String special_Feature_Code_5) {
		Special_Feature_Code_5 = special_Feature_Code_5;
	}
	public String getSpecial_Feature_Code_6() {
		return Special_Feature_Code_6;
	}
	public void setSpecial_Feature_Code_6(String special_Feature_Code_6) {
		Special_Feature_Code_6 = special_Feature_Code_6;
	}
	public BigDecimal getSRP_Base_in_points() {
		return SRP_Base_in_points;
	}
	public void setSRP_Base_in_points(BigDecimal sRP_Base_in_points) {
		SRP_Base_in_points = sRP_Base_in_points;
	}
	public BigDecimal getSRP_Gross_in_points() {
		return SRP_Gross_in_points;
	}
	public void setSRP_Gross_in_points(BigDecimal sRP_Gross_in_points) {
		SRP_Gross_in_points = sRP_Gross_in_points;
	}
	public BigDecimal getSRP_Net_Funding_in_dollars() {
		return SRP_Net_Funding_in_dollars;
	}
	public void setSRP_Net_Funding_in_dollars(BigDecimal sRP_Net_Funding_in_dollars) {
		SRP_Net_Funding_in_dollars = sRP_Net_Funding_in_dollars;
	}
	public BigDecimal getSRP_Net_in_points() {
		return SRP_Net_in_points;
	}
	public void setSRP_Net_in_points(BigDecimal sRP_Net_in_points) {
		SRP_Net_in_points = sRP_Net_in_points;
	}
	public BigDecimal getSRP_Fee_Amount_1() {
		return SRP_Fee_Amount_1;
	}
	public void setSRP_Fee_Amount_1(BigDecimal sRP_Fee_Amount_1) {
		SRP_Fee_Amount_1 = sRP_Fee_Amount_1;
	}
	public BigDecimal getSRP_Fee_Amount_2() {
		return SRP_Fee_Amount_2;
	}
	public void setSRP_Fee_Amount_2(BigDecimal sRP_Fee_Amount_2) {
		SRP_Fee_Amount_2 = sRP_Fee_Amount_2;
	}
	public BigDecimal getSRP_Fee_Amount_3() {
		return SRP_Fee_Amount_3;
	}
	public void setSRP_Fee_Amount_3(BigDecimal sRP_Fee_Amount_3) {
		SRP_Fee_Amount_3 = sRP_Fee_Amount_3;
	}
	public BigDecimal getSRP_Fee_Amount_4() {
		return SRP_Fee_Amount_4;
	}
	public void setSRP_Fee_Amount_4(BigDecimal sRP_Fee_Amount_4) {
		SRP_Fee_Amount_4 = sRP_Fee_Amount_4;
	}
	public BigDecimal getSRP_Fee_Amount_5() {
		return SRP_Fee_Amount_5;
	}
	public void setSRP_Fee_Amount_5(BigDecimal sRP_Fee_Amount_5) {
		SRP_Fee_Amount_5 = sRP_Fee_Amount_5;
	}
	public BigDecimal getSRP_Fee_Amount_6() {
		return SRP_Fee_Amount_6;
	}
	public void setSRP_Fee_Amount_6(BigDecimal sRP_Fee_Amount_6) {
		SRP_Fee_Amount_6 = sRP_Fee_Amount_6;
	}
	public BigDecimal getSRP_Fee_Amount_7() {
		return SRP_Fee_Amount_7;
	}
	public void setSRP_Fee_Amount_7(BigDecimal sRP_Fee_Amount_7) {
		SRP_Fee_Amount_7 = sRP_Fee_Amount_7;
	}
	public BigDecimal getSRP_Fee_Amount_8() {
		return SRP_Fee_Amount_8;
	}
	public void setSRP_Fee_Amount_8(BigDecimal sRP_Fee_Amount_8) {
		SRP_Fee_Amount_8 = sRP_Fee_Amount_8;
	}
	public BigDecimal getSRP_Fee_Amount_9() {
		return SRP_Fee_Amount_9;
	}
	public void setSRP_Fee_Amount_9(BigDecimal sRP_Fee_Amount_9) {
		SRP_Fee_Amount_9 = sRP_Fee_Amount_9;
	}
	public BigDecimal getSRP_Fee_Amount_10() {
		return SRP_Fee_Amount_10;
	}
	public void setSRP_Fee_Amount_10(BigDecimal sRP_Fee_Amount_10) {
		SRP_Fee_Amount_10 = sRP_Fee_Amount_10;
	}
	public String getSRP_Fee_Description_1() {
		return SRP_Fee_Description_1;
	}
	public void setSRP_Fee_Description_1(String sRP_Fee_Description_1) {
		SRP_Fee_Description_1 = sRP_Fee_Description_1;
	}
	public String getSRP_Fee_Description_2() {
		return SRP_Fee_Description_2;
	}
	public void setSRP_Fee_Description_2(String sRP_Fee_Description_2) {
		SRP_Fee_Description_2 = sRP_Fee_Description_2;
	}
	public String getSRP_Fee_Description_3() {
		return SRP_Fee_Description_3;
	}
	public void setSRP_Fee_Description_3(String sRP_Fee_Description_3) {
		SRP_Fee_Description_3 = sRP_Fee_Description_3;
	}
	public String getSRP_Fee_Description_4() {
		return SRP_Fee_Description_4;
	}
	public void setSRP_Fee_Description_4(String sRP_Fee_Description_4) {
		SRP_Fee_Description_4 = sRP_Fee_Description_4;
	}
	public String getSRP_Fee_Description_5() {
		return SRP_Fee_Description_5;
	}
	public void setSRP_Fee_Description_5(String sRP_Fee_Description_5) {
		SRP_Fee_Description_5 = sRP_Fee_Description_5;
	}
	public String getSRP_Fee_Description_6() {
		return SRP_Fee_Description_6;
	}
	public void setSRP_Fee_Description_6(String sRP_Fee_Description_6) {
		SRP_Fee_Description_6 = sRP_Fee_Description_6;
	}
	public String getSRP_Fee_Description_7() {
		return SRP_Fee_Description_7;
	}
	public void setSRP_Fee_Description_7(String sRP_Fee_Description_7) {
		SRP_Fee_Description_7 = sRP_Fee_Description_7;
	}
	public String getSRP_Fee_Description_8() {
		return SRP_Fee_Description_8;
	}
	public void setSRP_Fee_Description_8(String sRP_Fee_Description_8) {
		SRP_Fee_Description_8 = sRP_Fee_Description_8;
	}
	public String getSRP_Fee_Description_9() {
		return SRP_Fee_Description_9;
	}
	public void setSRP_Fee_Description_9(String sRP_Fee_Description_9) {
		SRP_Fee_Description_9 = sRP_Fee_Description_9;
	}
	public String getSRP_Fee_Description_10() {
		return SRP_Fee_Description_10;
	}
	public void setSRP_Fee_Description_10(String sRP_Fee_Description_10) {
		SRP_Fee_Description_10 = sRP_Fee_Description_10;
	}
	public Date getSRP_Schedule_Date() {
		return SRP_Schedule_Date;
	}
	public void setSRP_Schedule_Date(Date sRP_Schedule_Date) {
		SRP_Schedule_Date = sRP_Schedule_Date;
	}
	public String getSubject_Property_Number_of_Units() {
		return Subject_Property_Number_of_Units;
	}
	public void setSubject_Property_Number_of_Units(
			String subject_Property_Number_of_Units) {
		Subject_Property_Number_of_Units = subject_Property_Number_of_Units;
	}
	public BigDecimal getTotal_Escrow_in_dollars() {
		return Total_Escrow_in_dollars;
	}
	public void setTotal_Escrow_in_dollars(BigDecimal total_Escrow_in_dollars) {
		Total_Escrow_in_dollars = total_Escrow_in_dollars;
	}
	public BigDecimal getTotal_Fees_in_dollars() {
		return Total_Fees_in_dollars;
	}
	public void setTotal_Fees_in_dollars(BigDecimal total_Fees_in_dollars) {
		Total_Fees_in_dollars = total_Fees_in_dollars;
	}
	public String getYear_Built() {
		return Year_Built;
	}
	public void setYear_Built(String year_Built) {
		Year_Built = year_Built;
	}
	public Date getProperty_Appraisal_Effective_Date() {
		return Property_Appraisal_Effective_Date;
	}
	public void setProperty_Appraisal_Effective_Date(
			Date property_Appraisal_Effective_Date) {
		Property_Appraisal_Effective_Date = property_Appraisal_Effective_Date;
	}
	public String getProperty_Appraisal_Form_Number() {
		return Property_Appraisal_Form_Number;
	}
	public void setProperty_Appraisal_Form_Number(
			String property_Appraisal_Form_Number) {
		Property_Appraisal_Form_Number = property_Appraisal_Form_Number;
	}
	public BigDecimal getLoan_Interest_Rate_Adjustment_Subsequent_Cap_Percent() {
		return Loan_Interest_Rate_Adjustment_Subsequent_Cap_Percent;
	}
	public void setLoan_Interest_Rate_Adjustment_Subsequent_Cap_Percent(
			BigDecimal loan_Interest_Rate_Adjustment_Subsequent_Cap_Percent) {
		Loan_Interest_Rate_Adjustment_Subsequent_Cap_Percent = loan_Interest_Rate_Adjustment_Subsequent_Cap_Percent;
	}
	public Date getLoan_Interest_Rate_Adjustment_Change_Effective_Due_Date() {
		return Loan_Interest_Rate_Adjustment_Change_Effective_Due_Date;
	}
	public void setLoan_Interest_Rate_Adjustment_Change_Effective_Due_Date(
			Date loan_Interest_Rate_Adjustment_Change_Effective_Due_Date) {
		Loan_Interest_Rate_Adjustment_Change_Effective_Due_Date = loan_Interest_Rate_Adjustment_Change_Effective_Due_Date;
	}
	public BigDecimal getLoan_Interest_Rate_Lifetime_Adjustment_Ceiling_Factor() {
		return Loan_Interest_Rate_Lifetime_Adjustment_Ceiling_Factor;
	}
	public void setLoan_Interest_Rate_Lifetime_Adjustment_Ceiling_Factor(
			BigDecimal loan_Interest_Rate_Lifetime_Adjustment_Ceiling_Factor) {
		Loan_Interest_Rate_Lifetime_Adjustment_Ceiling_Factor = loan_Interest_Rate_Lifetime_Adjustment_Ceiling_Factor;
	}
	public BigDecimal getLoan_Margin_Rate() {
		return Loan_Margin_Rate;
	}
	public void setLoan_Margin_Rate(BigDecimal loan_Margin_Rate) {
		Loan_Margin_Rate = loan_Margin_Rate;
	}
	public Date getLoan_Interest_Rate_Next_Adjustment_Date() {
		return Loan_Interest_Rate_Next_Adjustment_Date;
	}
	public void setLoan_Interest_Rate_Next_Adjustment_Date(
			Date loan_Interest_Rate_Next_Adjustment_Date) {
		Loan_Interest_Rate_Next_Adjustment_Date = loan_Interest_Rate_Next_Adjustment_Date;
	}
	public BigDecimal getLoan_Interest_Rate_Lifetime_Adjustment_Floor_Factor() {
		return Loan_Interest_Rate_Lifetime_Adjustment_Floor_Factor;
	}
	public void setLoan_Interest_Rate_Lifetime_Adjustment_Floor_Factor(
			BigDecimal loan_Interest_Rate_Lifetime_Adjustment_Floor_Factor) {
		Loan_Interest_Rate_Lifetime_Adjustment_Floor_Factor = loan_Interest_Rate_Lifetime_Adjustment_Floor_Factor;
	}
	public String getBorrower_Phone_Number() {
		return Borrower_Phone_Number;
	}
	public void setBorrower_Phone_Number(String borrower_Phone_Number) {
		Borrower_Phone_Number = borrower_Phone_Number;
	}
	public String getAddress_County_Code() {
		return Address_County_Code;
	}
	public void setAddress_County_Code(String address_County_Code) {
		Address_County_Code = address_County_Code;
	}
	public String getProperty_Legal_Description_Block() {
		return Property_Legal_Description_Block;
	}
	public void setProperty_Legal_Description_Block(
			String property_Legal_Description_Block) {
		Property_Legal_Description_Block = property_Legal_Description_Block;
	}
	public String getProperty_Legal_Description_Lot() {
		return Property_Legal_Description_Lot;
	}
	public void setProperty_Legal_Description_Lot(
			String property_Legal_Description_Lot) {
		Property_Legal_Description_Lot = property_Legal_Description_Lot;
	}
	public String getProperty_Legal_Description_Section() {
		return Property_Legal_Description_Section;
	}
	public void setProperty_Legal_Description_Section(
			String property_Legal_Description_Section) {
		Property_Legal_Description_Section = property_Legal_Description_Section;
	}
	public String getProperty_Legal_Description_Subdivision() {
		return Property_Legal_Description_Subdivision;
	}
	public void setProperty_Legal_Description_Subdivision(
			String property_Legal_Description_Subdivision) {
		Property_Legal_Description_Subdivision = property_Legal_Description_Subdivision;
	}
	public String getMailing_Address_Same_As_Property_Address_Indicator() {
		return Mailing_Address_Same_As_Property_Address_Indicator;
	}
	public void setMailing_Address_Same_As_Property_Address_Indicator(
			String mailing_Address_Same_As_Property_Address_Indicator) {
		Mailing_Address_Same_As_Property_Address_Indicator = mailing_Address_Same_As_Property_Address_Indicator;
	}
	public String getMailing_Address_City_Name() {
		return Mailing_Address_City_Name;
	}
	public void setMailing_Address_City_Name(String mailing_Address_City_Name) {
		Mailing_Address_City_Name = mailing_Address_City_Name;
	}
	public String getMailing_Address_State_Code() {
		return Mailing_Address_State_Code;
	}
	public void setMailing_Address_State_Code(String mailing_Address_State_Code) {
		Mailing_Address_State_Code = mailing_Address_State_Code;
	}
	public String getMailing_Address_Street_Line_1_Address() {
		return Mailing_Address_Street_Line_1_Address;
	}
	public void setMailing_Address_Street_Line_1_Address(
			String mailing_Address_Street_Line_1_Address) {
		Mailing_Address_Street_Line_1_Address = mailing_Address_Street_Line_1_Address;
	}
	public String getMailing_Address_Street_Line_2_Address() {
		return Mailing_Address_Street_Line_2_Address;
	}
	public void setMailing_Address_Street_Line_2_Address(
			String mailing_Address_Street_Line_2_Address) {
		Mailing_Address_Street_Line_2_Address = mailing_Address_Street_Line_2_Address;
	}
	public String getMailing_Address_Street_Line_3_Address() {
		return Mailing_Address_Street_Line_3_Address;
	}
	public void setMailing_Address_Street_Line_3_Address(
			String mailing_Address_Street_Line_3_Address) {
		Mailing_Address_Street_Line_3_Address = mailing_Address_Street_Line_3_Address;
	}
	public String getMailing_Address_Postal_Code() {
		return Mailing_Address_Postal_Code;
	}
	public void setMailing_Address_Postal_Code(String mailing_Address_Postal_Code) {
		Mailing_Address_Postal_Code = mailing_Address_Postal_Code;
	}
	public Date getLoan_Maturity_Date() {
		return Loan_Maturity_Date;
	}
	public void setLoan_Maturity_Date(Date loan_Maturity_Date) {
		Loan_Maturity_Date = loan_Maturity_Date;
	}
	public String getLoan_MERS_As_Original_Mortgage_Indicator() {
		return Loan_MERS_As_Original_Mortgage_Indicator;
	}
	public void setLoan_MERS_As_Original_Mortgage_Indicator(
			String loan_MERS_As_Original_Mortgage_Indicator) {
		Loan_MERS_As_Original_Mortgage_Indicator = loan_MERS_As_Original_Mortgage_Indicator;
	}
	public BigDecimal getLoan_Annual_Percentage_Rate() {
		return Loan_Annual_Percentage_Rate;
	}
	public void setLoan_Annual_Percentage_Rate(
			BigDecimal loan_Annual_Percentage_Rate) {
		Loan_Annual_Percentage_Rate = loan_Annual_Percentage_Rate;
	}
	public String getBorrower_Social_Security_Number_Certification_Indicator() {
		return Borrower_Social_Security_Number_Certification_Indicator;
	}
	public void setBorrower_Social_Security_Number_Certification_Indicator(
			String borrower_Social_Security_Number_Certification_Indicator) {
		Borrower_Social_Security_Number_Certification_Indicator = borrower_Social_Security_Number_Certification_Indicator;
	}
	public String getCo_Borrower_Social_Security_Number_Certification_Indicator() {
		return Co_Borrower_Social_Security_Number_Certification_Indicator;
	}
	public void setCo_Borrower_Social_Security_Number_Certification_Indicator(
			String co_Borrower_Social_Security_Number_Certification_Indicator) {
		Co_Borrower_Social_Security_Number_Certification_Indicator = co_Borrower_Social_Security_Number_Certification_Indicator;
	}
	public String getGSE_Property_Type_Code() {
		return GSE_Property_Type_Code;
	}
	public void setGSE_Property_Type_Code(String gSE_Property_Type_Code) {
		GSE_Property_Type_Code = gSE_Property_Type_Code;
	}
	public String getProperty_Flood_Area_Indicator() {
		return Property_Flood_Area_Indicator;
	}
	public void setProperty_Flood_Area_Indicator(
			String property_Flood_Area_Indicator) {
		Property_Flood_Area_Indicator = property_Flood_Area_Indicator;
	}
	public String getProperty_Flood_Zone_Letter_Code() {
		return Property_Flood_Zone_Letter_Code;
	}
	public void setProperty_Flood_Zone_Letter_Code(
			String property_Flood_Zone_Letter_Code) {
		Property_Flood_Zone_Letter_Code = property_Flood_Zone_Letter_Code;
	}
	public String getProperty_Flood_Determination_Company_Name() {
		return Property_Flood_Determination_Company_Name;
	}
	public void setProperty_Flood_Determination_Company_Name(
			String property_Flood_Determination_Company_Name) {
		Property_Flood_Determination_Company_Name = property_Flood_Determination_Company_Name;
	}
	public Date getProperty_Flood_Determination_Date() {
		return Property_Flood_Determination_Date;
	}
	public void setProperty_Flood_Determination_Date(
			Date property_Flood_Determination_Date) {
		Property_Flood_Determination_Date = property_Flood_Determination_Date;
	}
	public Date getProperty_Flood_Determination_Last_Revised_Date() {
		return Property_Flood_Determination_Last_Revised_Date;
	}
	public void setProperty_Flood_Determination_Last_Revised_Date(
			Date property_Flood_Determination_Last_Revised_Date) {
		Property_Flood_Determination_Last_Revised_Date = property_Flood_Determination_Last_Revised_Date;
	}
	public Date getProperty_Flood_Determination_Letter_Of_Map_Revision_Date() {
		return Property_Flood_Determination_Letter_Of_Map_Revision_Date;
	}
	public void setProperty_Flood_Determination_Letter_Of_Map_Revision_Date(
			Date property_Flood_Determination_Letter_Of_Map_Revision_Date) {
		Property_Flood_Determination_Letter_Of_Map_Revision_Date = property_Flood_Determination_Letter_Of_Map_Revision_Date;
	}
	public String getProperty_Flood_Certification_Identifier() {
		return Property_Flood_Certification_Identifier;
	}
	public void setProperty_Flood_Certification_Identifier(
			String property_Flood_Certification_Identifier) {
		Property_Flood_Certification_Identifier = property_Flood_Certification_Identifier;
	}
	public String getProperty_Flood_Map_Panel_Identifier() {
		return Property_Flood_Map_Panel_Identifier;
	}
	public void setProperty_Flood_Map_Panel_Identifier(
			String property_Flood_Map_Panel_Identifier) {
		Property_Flood_Map_Panel_Identifier = property_Flood_Map_Panel_Identifier;
	}
	public String getProperty_Flood_Certification_Community_Status_Indicator() {
		return Property_Flood_Certification_Community_Status_Indicator;
	}
	public void setProperty_Flood_Certification_Community_Status_Indicator(
			String property_Flood_Certification_Community_Status_Indicator) {
		Property_Flood_Certification_Community_Status_Indicator = property_Flood_Certification_Community_Status_Indicator;
	}
	public String getProperty_Flood_Insurance_Payee_Name() {
		return Property_Flood_Insurance_Payee_Name;
	}
	public void setProperty_Flood_Insurance_Payee_Name(
			String property_Flood_Insurance_Payee_Name) {
		Property_Flood_Insurance_Payee_Name = property_Flood_Insurance_Payee_Name;
	}
	public BigDecimal getProperty_Flood_Insurance_Policy_Coverage_Amount() {
		return Property_Flood_Insurance_Policy_Coverage_Amount;
	}
	public void setProperty_Flood_Insurance_Policy_Coverage_Amount(
			BigDecimal property_Flood_Insurance_Policy_Coverage_Amount) {
		Property_Flood_Insurance_Policy_Coverage_Amount = property_Flood_Insurance_Policy_Coverage_Amount;
	}
	public Date getProperty_Flood_Insurance_Policy_Expiration_Date() {
		return Property_Flood_Insurance_Policy_Expiration_Date;
	}
	public void setProperty_Flood_Insurance_Policy_Expiration_Date(
			Date property_Flood_Insurance_Policy_Expiration_Date) {
		Property_Flood_Insurance_Policy_Expiration_Date = property_Flood_Insurance_Policy_Expiration_Date;
	}
	public String getProperty_Flood_Insurance_Policy_Number() {
		return Property_Flood_Insurance_Policy_Number;
	}
	public void setProperty_Flood_Insurance_Policy_Number(
			String property_Flood_Insurance_Policy_Number) {
		Property_Flood_Insurance_Policy_Number = property_Flood_Insurance_Policy_Number;
	}
	public BigDecimal getProperty_Flood_Insurance_Policy_Premium_Amount() {
		return Property_Flood_Insurance_Policy_Premium_Amount;
	}
	public void setProperty_Flood_Insurance_Policy_Premium_Amount(
			BigDecimal property_Flood_Insurance_Policy_Premium_Amount) {
		Property_Flood_Insurance_Policy_Premium_Amount = property_Flood_Insurance_Policy_Premium_Amount;
	}
	public String getProperty_Flood_Insurance_Policy_Escrow_Status_Indicator() {
		return Property_Flood_Insurance_Policy_Escrow_Status_Indicator;
	}
	public void setProperty_Flood_Insurance_Policy_Escrow_Status_Indicator(
			String property_Flood_Insurance_Policy_Escrow_Status_Indicator) {
		Property_Flood_Insurance_Policy_Escrow_Status_Indicator = property_Flood_Insurance_Policy_Escrow_Status_Indicator;
	}
	public String getProperty_Hazard_Area_Insurance_Payee_Name() {
		return Property_Hazard_Area_Insurance_Payee_Name;
	}
	public void setProperty_Hazard_Area_Insurance_Payee_Name(
			String property_Hazard_Area_Insurance_Payee_Name) {
		Property_Hazard_Area_Insurance_Payee_Name = property_Hazard_Area_Insurance_Payee_Name;
	}
	public BigDecimal getProperty_Hazard_Area_Insurance_Policy_Coverage_Amount() {
		return Property_Hazard_Area_Insurance_Policy_Coverage_Amount;
	}
	public void setProperty_Hazard_Area_Insurance_Policy_Coverage_Amount(
			BigDecimal property_Hazard_Area_Insurance_Policy_Coverage_Amount) {
		Property_Hazard_Area_Insurance_Policy_Coverage_Amount = property_Hazard_Area_Insurance_Policy_Coverage_Amount;
	}
	public Date getProperty_Hazard_Area_Insurance_Policy_Expiration_Date() {
		return Property_Hazard_Area_Insurance_Policy_Expiration_Date;
	}
	public void setProperty_Hazard_Area_Insurance_Policy_Expiration_Date(
			Date property_Hazard_Area_Insurance_Policy_Expiration_Date) {
		Property_Hazard_Area_Insurance_Policy_Expiration_Date = property_Hazard_Area_Insurance_Policy_Expiration_Date;
	}
	public String getProperty_Hazard_Area_Insurance_Policy_Number() {
		return Property_Hazard_Area_Insurance_Policy_Number;
	}
	public void setProperty_Hazard_Area_Insurance_Policy_Number(
			String property_Hazard_Area_Insurance_Policy_Number) {
		Property_Hazard_Area_Insurance_Policy_Number = property_Hazard_Area_Insurance_Policy_Number;
	}
	public BigDecimal getProperty_Hazard_Area_Insurance_Policy_Premium_Amount() {
		return Property_Hazard_Area_Insurance_Policy_Premium_Amount;
	}
	public void setProperty_Hazard_Area_Insurance_Policy_Premium_Amount(
			BigDecimal property_Hazard_Area_Insurance_Policy_Premium_Amount) {
		Property_Hazard_Area_Insurance_Policy_Premium_Amount = property_Hazard_Area_Insurance_Policy_Premium_Amount;
	}
	public String getProperty_Hazard_Insurance_Policy_Escrow_Status_Indicator() {
		return Property_Hazard_Insurance_Policy_Escrow_Status_Indicator;
	}
	public void setProperty_Hazard_Insurance_Policy_Escrow_Status_Indicator(
			String property_Hazard_Insurance_Policy_Escrow_Status_Indicator) {
		Property_Hazard_Insurance_Policy_Escrow_Status_Indicator = property_Hazard_Insurance_Policy_Escrow_Status_Indicator;
	}
	public String getProperty_Hazard_Area_Insurance_Coverage_Indicator() {
		return Property_Hazard_Area_Insurance_Coverage_Indicator;
	}
	public void setProperty_Hazard_Area_Insurance_Coverage_Indicator(
			String property_Hazard_Area_Insurance_Coverage_Indicator) {
		Property_Hazard_Area_Insurance_Coverage_Indicator = property_Hazard_Area_Insurance_Coverage_Indicator;
	}
	public String getProperty_Wind_Insurance_Payee_Name() {
		return Property_Wind_Insurance_Payee_Name;
	}
	public void setProperty_Wind_Insurance_Payee_Name(
			String property_Wind_Insurance_Payee_Name) {
		Property_Wind_Insurance_Payee_Name = property_Wind_Insurance_Payee_Name;
	}
	public BigDecimal getProperty_Wind_Insurance_Policy_Coverage_Amount() {
		return Property_Wind_Insurance_Policy_Coverage_Amount;
	}
	public void setProperty_Wind_Insurance_Policy_Coverage_Amount(
			BigDecimal property_Wind_Insurance_Policy_Coverage_Amount) {
		Property_Wind_Insurance_Policy_Coverage_Amount = property_Wind_Insurance_Policy_Coverage_Amount;
	}
	public Date getProperty_Wind_Insurance_Policy_Expiration_Date() {
		return Property_Wind_Insurance_Policy_Expiration_Date;
	}
	public void setProperty_Wind_Insurance_Policy_Expiration_Date(
			Date property_Wind_Insurance_Policy_Expiration_Date) {
		Property_Wind_Insurance_Policy_Expiration_Date = property_Wind_Insurance_Policy_Expiration_Date;
	}
	public String getProperty_Wind_Insurance_Policy_Number() {
		return Property_Wind_Insurance_Policy_Number;
	}
	public void setProperty_Wind_Insurance_Policy_Number(
			String property_Wind_Insurance_Policy_Number) {
		Property_Wind_Insurance_Policy_Number = property_Wind_Insurance_Policy_Number;
	}
	public BigDecimal getProperty_Wind_Insurance_Policy_Premium_Amount() {
		return Property_Wind_Insurance_Policy_Premium_Amount;
	}
	public void setProperty_Wind_Insurance_Policy_Premium_Amount(
			BigDecimal property_Wind_Insurance_Policy_Premium_Amount) {
		Property_Wind_Insurance_Policy_Premium_Amount = property_Wind_Insurance_Policy_Premium_Amount;
	}
	public String getProperty_Wind_Insurance_Policy_Escrow_Status_Indicator() {
		return Property_Wind_Insurance_Policy_Escrow_Status_Indicator;
	}
	public void setProperty_Wind_Insurance_Policy_Escrow_Status_Indicator(
			String property_Wind_Insurance_Policy_Escrow_Status_Indicator) {
		Property_Wind_Insurance_Policy_Escrow_Status_Indicator = property_Wind_Insurance_Policy_Escrow_Status_Indicator;
	}
	public String getProperty_Wind_Insurance_Coverage_Indicator() {
		return Property_Wind_Insurance_Coverage_Indicator;
	}
	public void setProperty_Wind_Insurance_Coverage_Indicator(
			String property_Wind_Insurance_Coverage_Indicator) {
		Property_Wind_Insurance_Coverage_Indicator = property_Wind_Insurance_Coverage_Indicator;
	}
	public String getProperty_Earthquake_Insurance_Payee_Name() {
		return Property_Earthquake_Insurance_Payee_Name;
	}
	public void setProperty_Earthquake_Insurance_Payee_Name(
			String property_Earthquake_Insurance_Payee_Name) {
		Property_Earthquake_Insurance_Payee_Name = property_Earthquake_Insurance_Payee_Name;
	}
	public BigDecimal getProperty_Earthquake_Insurance_Policy_Coverage_Amount() {
		return Property_Earthquake_Insurance_Policy_Coverage_Amount;
	}
	public void setProperty_Earthquake_Insurance_Policy_Coverage_Amount(
			BigDecimal property_Earthquake_Insurance_Policy_Coverage_Amount) {
		Property_Earthquake_Insurance_Policy_Coverage_Amount = property_Earthquake_Insurance_Policy_Coverage_Amount;
	}
	public Date getProperty_Earthquake_Insurance_Policy_Expiration_Date() {
		return Property_Earthquake_Insurance_Policy_Expiration_Date;
	}
	public void setProperty_Earthquake_Insurance_Policy_Expiration_Date(
			Date property_Earthquake_Insurance_Policy_Expiration_Date) {
		Property_Earthquake_Insurance_Policy_Expiration_Date = property_Earthquake_Insurance_Policy_Expiration_Date;
	}
	public String getProperty_Earthquake_Insurance_Policy_Number() {
		return Property_Earthquake_Insurance_Policy_Number;
	}
	public void setProperty_Earthquake_Insurance_Policy_Number(
			String property_Earthquake_Insurance_Policy_Number) {
		Property_Earthquake_Insurance_Policy_Number = property_Earthquake_Insurance_Policy_Number;
	}
	public BigDecimal getProperty_Earthquake_Insurance_Policy_Premium_Amount() {
		return Property_Earthquake_Insurance_Policy_Premium_Amount;
	}
	public void setProperty_Earthquake_Insurance_Policy_Premium_Amount(
			BigDecimal property_Earthquake_Insurance_Policy_Premium_Amount) {
		Property_Earthquake_Insurance_Policy_Premium_Amount = property_Earthquake_Insurance_Policy_Premium_Amount;
	}
	public String getProperty_Earthquake_Insurance_Policy_Escrow_Status_Indicator() {
		return Property_Earthquake_Insurance_Policy_Escrow_Status_Indicator;
	}
	public void setProperty_Earthquake_Insurance_Policy_Escrow_Status_Indicator(
			String property_Earthquake_Insurance_Policy_Escrow_Status_Indicator) {
		Property_Earthquake_Insurance_Policy_Escrow_Status_Indicator = property_Earthquake_Insurance_Policy_Escrow_Status_Indicator;
	}
	public String getProperty_Earthquake_Insurance_Coverage_Indicator() {
		return Property_Earthquake_Insurance_Coverage_Indicator;
	}
	public void setProperty_Earthquake_Insurance_Coverage_Indicator(
			String property_Earthquake_Insurance_Coverage_Indicator) {
		Property_Earthquake_Insurance_Coverage_Indicator = property_Earthquake_Insurance_Coverage_Indicator;
	}
	public String getProperty_Condo_Contents_Insurance_Payee_Name() {
		return Property_Condo_Contents_Insurance_Payee_Name;
	}
	public void setProperty_Condo_Contents_Insurance_Payee_Name(
			String property_Condo_Contents_Insurance_Payee_Name) {
		Property_Condo_Contents_Insurance_Payee_Name = property_Condo_Contents_Insurance_Payee_Name;
	}
	public BigDecimal getProperty_Condo_Contents_Insurance_Policy_Coverage_Amount() {
		return Property_Condo_Contents_Insurance_Policy_Coverage_Amount;
	}
	public void setProperty_Condo_Contents_Insurance_Policy_Coverage_Amount(
			BigDecimal property_Condo_Contents_Insurance_Policy_Coverage_Amount) {
		Property_Condo_Contents_Insurance_Policy_Coverage_Amount = property_Condo_Contents_Insurance_Policy_Coverage_Amount;
	}
	public Date getProperty_Condo_Contents_Insurance_Policy_Expiration_Date() {
		return Property_Condo_Contents_Insurance_Policy_Expiration_Date;
	}
	public void setProperty_Condo_Contents_Insurance_Policy_Expiration_Date(
			Date property_Condo_Contents_Insurance_Policy_Expiration_Date) {
		Property_Condo_Contents_Insurance_Policy_Expiration_Date = property_Condo_Contents_Insurance_Policy_Expiration_Date;
	}
	public String getProperty_Condo_Contents_Insurance_Policy_Number() {
		return Property_Condo_Contents_Insurance_Policy_Number;
	}
	public void setProperty_Condo_Contents_Insurance_Policy_Number(
			String property_Condo_Contents_Insurance_Policy_Number) {
		Property_Condo_Contents_Insurance_Policy_Number = property_Condo_Contents_Insurance_Policy_Number;
	}
	public BigDecimal getProperty_Condo_Contents_Insurance_Policy_Premium_Amount() {
		return Property_Condo_Contents_Insurance_Policy_Premium_Amount;
	}
	public void setProperty_Condo_Contents_Insurance_Policy_Premium_Amount(
			BigDecimal property_Condo_Contents_Insurance_Policy_Premium_Amount) {
		Property_Condo_Contents_Insurance_Policy_Premium_Amount = property_Condo_Contents_Insurance_Policy_Premium_Amount;
	}
	public String getProperty_Condo_Contents_Insurance_Policy_Escrow_Status_Indicator() {
		return Property_Condo_Contents_Insurance_Policy_Escrow_Status_Indicator;
	}
	public void setProperty_Condo_Contents_Insurance_Policy_Escrow_Status_Indicator(
			String property_Condo_Contents_Insurance_Policy_Escrow_Status_Indicator) {
		Property_Condo_Contents_Insurance_Policy_Escrow_Status_Indicator = property_Condo_Contents_Insurance_Policy_Escrow_Status_Indicator;
	}
	public String getProperty_Condo_Contents_Insurance_Coverage_Indicator() {
		return Property_Condo_Contents_Insurance_Coverage_Indicator;
	}
	public void setProperty_Condo_Contents_Insurance_Coverage_Indicator(
			String property_Condo_Contents_Insurance_Coverage_Indicator) {
		Property_Condo_Contents_Insurance_Coverage_Indicator = property_Condo_Contents_Insurance_Coverage_Indicator;
	}
	public String getProperty_Condo_Flood_Insurance_Payee_Name() {
		return Property_Condo_Flood_Insurance_Payee_Name;
	}
	public void setProperty_Condo_Flood_Insurance_Payee_Name(
			String property_Condo_Flood_Insurance_Payee_Name) {
		Property_Condo_Flood_Insurance_Payee_Name = property_Condo_Flood_Insurance_Payee_Name;
	}
	public BigDecimal getProperty_Condo_Flood_Insurance_Policy_Coverage_Amount() {
		return Property_Condo_Flood_Insurance_Policy_Coverage_Amount;
	}
	public void setProperty_Condo_Flood_Insurance_Policy_Coverage_Amount(
			BigDecimal property_Condo_Flood_Insurance_Policy_Coverage_Amount) {
		Property_Condo_Flood_Insurance_Policy_Coverage_Amount = property_Condo_Flood_Insurance_Policy_Coverage_Amount;
	}
	public Date getProperty_Condo_Flood_Insurance_Policy_Expiration_Date() {
		return Property_Condo_Flood_Insurance_Policy_Expiration_Date;
	}
	public void setProperty_Condo_Flood_Insurance_Policy_Expiration_Date(
			Date property_Condo_Flood_Insurance_Policy_Expiration_Date) {
		Property_Condo_Flood_Insurance_Policy_Expiration_Date = property_Condo_Flood_Insurance_Policy_Expiration_Date;
	}
	public String getProperty_Condo_Flood_Insurance_Policy_Number() {
		return Property_Condo_Flood_Insurance_Policy_Number;
	}
	public void setProperty_Condo_Flood_Insurance_Policy_Number(
			String property_Condo_Flood_Insurance_Policy_Number) {
		Property_Condo_Flood_Insurance_Policy_Number = property_Condo_Flood_Insurance_Policy_Number;
	}
	public BigDecimal getProperty_Condo_Flood_Insurance_Policy_Premium_Amount() {
		return Property_Condo_Flood_Insurance_Policy_Premium_Amount;
	}
	public void setProperty_Condo_Flood_Insurance_Policy_Premium_Amount(
			BigDecimal property_Condo_Flood_Insurance_Policy_Premium_Amount) {
		Property_Condo_Flood_Insurance_Policy_Premium_Amount = property_Condo_Flood_Insurance_Policy_Premium_Amount;
	}
	public String getProperty_Condo_Flood_Insurance_Policy_Escrow_Status_Indicator() {
		return Property_Condo_Flood_Insurance_Policy_Escrow_Status_Indicator;
	}
	public void setProperty_Condo_Flood_Insurance_Policy_Escrow_Status_Indicator(
			String property_Condo_Flood_Insurance_Policy_Escrow_Status_Indicator) {
		Property_Condo_Flood_Insurance_Policy_Escrow_Status_Indicator = property_Condo_Flood_Insurance_Policy_Escrow_Status_Indicator;
	}
	public String getProperty_Condo_Flood_Insurance_Coverage_Indicator() {
		return Property_Condo_Flood_Insurance_Coverage_Indicator;
	}
	public void setProperty_Condo_Flood_Insurance_Coverage_Indicator(
			String property_Condo_Flood_Insurance_Coverage_Indicator) {
		Property_Condo_Flood_Insurance_Coverage_Indicator = property_Condo_Flood_Insurance_Coverage_Indicator;
	}
	public Date getMortgage_Insurance_Next_Premium_Due_Date() {
		return Mortgage_Insurance_Next_Premium_Due_Date;
	}
	public void setMortgage_Insurance_Next_Premium_Due_Date(
			Date mortgage_Insurance_Next_Premium_Due_Date) {
		Mortgage_Insurance_Next_Premium_Due_Date = mortgage_Insurance_Next_Premium_Due_Date;
	}
	public String getMortgage_Insurance_Payment_Frequency_Code_Description() {
		return Mortgage_Insurance_Payment_Frequency_Code_Description;
	}
	public void setMortgage_Insurance_Payment_Frequency_Code_Description(
			String mortgage_Insurance_Payment_Frequency_Code_Description) {
		Mortgage_Insurance_Payment_Frequency_Code_Description = mortgage_Insurance_Payment_Frequency_Code_Description;
	}
	public BigDecimal getMortgage_Insurance_Premium_Amount() {
		return Mortgage_Insurance_Premium_Amount;
	}
	public void setMortgage_Insurance_Premium_Amount(
			BigDecimal mortgage_Insurance_Premium_Amount) {
		Mortgage_Insurance_Premium_Amount = mortgage_Insurance_Premium_Amount;
	}
	public BigDecimal getMortgage_Insurance_Rate() {
		return Mortgage_Insurance_Rate;
	}
	public void setMortgage_Insurance_Rate(BigDecimal mortgage_Insurance_Rate) {
		Mortgage_Insurance_Rate = mortgage_Insurance_Rate;
	}
	public String getProperty_County_Tax_Indicator() {
		return Property_County_Tax_Indicator;
	}
	public void setProperty_County_Tax_Indicator(
			String property_County_Tax_Indicator) {
		Property_County_Tax_Indicator = property_County_Tax_Indicator;
	}
	public BigDecimal getProperty_County_Tax_Disbursement_Amount() {
		return Property_County_Tax_Disbursement_Amount;
	}
	public void setProperty_County_Tax_Disbursement_Amount(
			BigDecimal property_County_Tax_Disbursement_Amount) {
		Property_County_Tax_Disbursement_Amount = property_County_Tax_Disbursement_Amount;
	}
	public Date getProperty_County_Tax_Disbursement_Due_Date() {
		return Property_County_Tax_Disbursement_Due_Date;
	}
	public void setProperty_County_Tax_Disbursement_Due_Date(
			Date property_County_Tax_Disbursement_Due_Date) {
		Property_County_Tax_Disbursement_Due_Date = property_County_Tax_Disbursement_Due_Date;
	}
	public String getProperty_County_Tax_Parcel_Number() {
		return Property_County_Tax_Parcel_Number;
	}
	public void setProperty_County_Tax_Parcel_Number(
			String property_County_Tax_Parcel_Number) {
		Property_County_Tax_Parcel_Number = property_County_Tax_Parcel_Number;
	}
	public String getProperty_County_Tax_Payment_Frequency_Code_Description() {
		return Property_County_Tax_Payment_Frequency_Code_Description;
	}
	public void setProperty_County_Tax_Payment_Frequency_Code_Description(
			String property_County_Tax_Payment_Frequency_Code_Description) {
		Property_County_Tax_Payment_Frequency_Code_Description = property_County_Tax_Payment_Frequency_Code_Description;
	}
	public String getProperty_County_Tax_Escrow_Status_Indicator() {
		return Property_County_Tax_Escrow_Status_Indicator;
	}
	public void setProperty_County_Tax_Escrow_Status_Indicator(
			String property_County_Tax_Escrow_Status_Indicator) {
		Property_County_Tax_Escrow_Status_Indicator = property_County_Tax_Escrow_Status_Indicator;
	}
	public String getProperty_County_Tax_Authority_Name() {
		return Property_County_Tax_Authority_Name;
	}
	public void setProperty_County_Tax_Authority_Name(
			String property_County_Tax_Authority_Name) {
		Property_County_Tax_Authority_Name = property_County_Tax_Authority_Name;
	}
	public String getProperty_City_Tax_Indicator() {
		return Property_City_Tax_Indicator;
	}
	public void setProperty_City_Tax_Indicator(String property_City_Tax_Indicator) {
		Property_City_Tax_Indicator = property_City_Tax_Indicator;
	}
	public BigDecimal getProperty_City_Tax_Disbursement_Amount() {
		return Property_City_Tax_Disbursement_Amount;
	}
	public void setProperty_City_Tax_Disbursement_Amount(
			BigDecimal property_City_Tax_Disbursement_Amount) {
		Property_City_Tax_Disbursement_Amount = property_City_Tax_Disbursement_Amount;
	}
	public Date getProperty_City_Tax_Disbursement_Due_Date() {
		return Property_City_Tax_Disbursement_Due_Date;
	}
	public void setProperty_City_Tax_Disbursement_Due_Date(
			Date property_City_Tax_Disbursement_Due_Date) {
		Property_City_Tax_Disbursement_Due_Date = property_City_Tax_Disbursement_Due_Date;
	}
	public String getProperty_City_Tax_Parcel_Number() {
		return Property_City_Tax_Parcel_Number;
	}
	public void setProperty_City_Tax_Parcel_Number(
			String property_City_Tax_Parcel_Number) {
		Property_City_Tax_Parcel_Number = property_City_Tax_Parcel_Number;
	}
	public String getProperty_City_Tax_Payment_Frequency_Code_Description() {
		return Property_City_Tax_Payment_Frequency_Code_Description;
	}
	public void setProperty_City_Tax_Payment_Frequency_Code_Description(
			String property_City_Tax_Payment_Frequency_Code_Description) {
		Property_City_Tax_Payment_Frequency_Code_Description = property_City_Tax_Payment_Frequency_Code_Description;
	}
	public String getProperty_City_Tax_Escrow_Status_Indicator() {
		return Property_City_Tax_Escrow_Status_Indicator;
	}
	public void setProperty_City_Tax_Escrow_Status_Indicator(
			String property_City_Tax_Escrow_Status_Indicator) {
		Property_City_Tax_Escrow_Status_Indicator = property_City_Tax_Escrow_Status_Indicator;
	}
	public String getProperty_City_Tax_Authority_Name() {
		return Property_City_Tax_Authority_Name;
	}
	public void setProperty_City_Tax_Authority_Name(
			String property_City_Tax_Authority_Name) {
		Property_City_Tax_Authority_Name = property_City_Tax_Authority_Name;
	}
	public String getProperty_School_Tax_Indicator() {
		return Property_School_Tax_Indicator;
	}
	public void setProperty_School_Tax_Indicator(
			String property_School_Tax_Indicator) {
		Property_School_Tax_Indicator = property_School_Tax_Indicator;
	}
	public BigDecimal getProperty_School_Tax_Disbursement_Amount() {
		return Property_School_Tax_Disbursement_Amount;
	}
	public void setProperty_School_Tax_Disbursement_Amount(
			BigDecimal property_School_Tax_Disbursement_Amount) {
		Property_School_Tax_Disbursement_Amount = property_School_Tax_Disbursement_Amount;
	}
	public Date getProperty_School_Tax_Disbursement_Due_Date() {
		return Property_School_Tax_Disbursement_Due_Date;
	}
	public void setProperty_School_Tax_Disbursement_Due_Date(
			Date property_School_Tax_Disbursement_Due_Date) {
		Property_School_Tax_Disbursement_Due_Date = property_School_Tax_Disbursement_Due_Date;
	}
	public String getProperty_School_Tax_Parcel_Number() {
		return Property_School_Tax_Parcel_Number;
	}
	public void setProperty_School_Tax_Parcel_Number(
			String property_School_Tax_Parcel_Number) {
		Property_School_Tax_Parcel_Number = property_School_Tax_Parcel_Number;
	}
	public String getProperty_School_Tax_Payment_Frequency_Code_Description() {
		return Property_School_Tax_Payment_Frequency_Code_Description;
	}
	public void setProperty_School_Tax_Payment_Frequency_Code_Description(
			String property_School_Tax_Payment_Frequency_Code_Description) {
		Property_School_Tax_Payment_Frequency_Code_Description = property_School_Tax_Payment_Frequency_Code_Description;
	}
	public String getProperty_School_Tax_Escrow_Status_Indicator() {
		return Property_School_Tax_Escrow_Status_Indicator;
	}
	public void setProperty_School_Tax_Escrow_Status_Indicator(
			String property_School_Tax_Escrow_Status_Indicator) {
		Property_School_Tax_Escrow_Status_Indicator = property_School_Tax_Escrow_Status_Indicator;
	}
	public String getProperty_School_Tax_Authority_Name() {
		return Property_School_Tax_Authority_Name;
	}
	public void setProperty_School_Tax_Authority_Name(
			String property_School_Tax_Authority_Name) {
		Property_School_Tax_Authority_Name = property_School_Tax_Authority_Name;
	}
	public String getProperty_Town_Tax_Indicator() {
		return Property_Town_Tax_Indicator;
	}
	public void setProperty_Town_Tax_Indicator(String property_Town_Tax_Indicator) {
		Property_Town_Tax_Indicator = property_Town_Tax_Indicator;
	}
	public BigDecimal getProperty_Town_Tax_Disbursement_Amount() {
		return Property_Town_Tax_Disbursement_Amount;
	}
	public void setProperty_Town_Tax_Disbursement_Amount(
			BigDecimal property_Town_Tax_Disbursement_Amount) {
		Property_Town_Tax_Disbursement_Amount = property_Town_Tax_Disbursement_Amount;
	}
	public Date getProperty_Town_Tax_Disbursement_Due_Date() {
		return Property_Town_Tax_Disbursement_Due_Date;
	}
	public void setProperty_Town_Tax_Disbursement_Due_Date(
			Date property_Town_Tax_Disbursement_Due_Date) {
		Property_Town_Tax_Disbursement_Due_Date = property_Town_Tax_Disbursement_Due_Date;
	}
	public String getProperty_Town_Tax_Parcel_Number() {
		return Property_Town_Tax_Parcel_Number;
	}
	public void setProperty_Town_Tax_Parcel_Number(
			String property_Town_Tax_Parcel_Number) {
		Property_Town_Tax_Parcel_Number = property_Town_Tax_Parcel_Number;
	}
	public String getProperty_Town_Tax_Payment_Frequency_Code_Description() {
		return Property_Town_Tax_Payment_Frequency_Code_Description;
	}
	public void setProperty_Town_Tax_Payment_Frequency_Code_Description(
			String property_Town_Tax_Payment_Frequency_Code_Description) {
		Property_Town_Tax_Payment_Frequency_Code_Description = property_Town_Tax_Payment_Frequency_Code_Description;
	}
	public String getProperty_Town_Tax_Escrow_Status_Indicator() {
		return Property_Town_Tax_Escrow_Status_Indicator;
	}
	public void setProperty_Town_Tax_Escrow_Status_Indicator(
			String property_Town_Tax_Escrow_Status_Indicator) {
		Property_Town_Tax_Escrow_Status_Indicator = property_Town_Tax_Escrow_Status_Indicator;
	}
	public String getProperty_Town_Tax_Authority_Name() {
		return Property_Town_Tax_Authority_Name;
	}
	public void setProperty_Town_Tax_Authority_Name(
			String property_Town_Tax_Authority_Name) {
		Property_Town_Tax_Authority_Name = property_Town_Tax_Authority_Name;
	}
	public String getProperty_Other_Tax_Indicator() {
		return Property_Other_Tax_Indicator;
	}
	public void setProperty_Other_Tax_Indicator(String property_Other_Tax_Indicator) {
		Property_Other_Tax_Indicator = property_Other_Tax_Indicator;
	}
	public String getProperty_Other_Tax_Type_Description() {
		return Property_Other_Tax_Type_Description;
	}
	public void setProperty_Other_Tax_Type_Description(
			String property_Other_Tax_Type_Description) {
		Property_Other_Tax_Type_Description = property_Other_Tax_Type_Description;
	}
	public BigDecimal getProperty_Other_Tax_Disbursement_Amount() {
		return Property_Other_Tax_Disbursement_Amount;
	}
	public void setProperty_Other_Tax_Disbursement_Amount(
			BigDecimal property_Other_Tax_Disbursement_Amount) {
		Property_Other_Tax_Disbursement_Amount = property_Other_Tax_Disbursement_Amount;
	}
	public Date getProperty_Other_Tax_Disbursement_Due_Date() {
		return Property_Other_Tax_Disbursement_Due_Date;
	}
	public void setProperty_Other_Tax_Disbursement_Due_Date(
			Date property_Other_Tax_Disbursement_Due_Date) {
		Property_Other_Tax_Disbursement_Due_Date = property_Other_Tax_Disbursement_Due_Date;
	}
	public String getProperty_Other_Tax_Parcel_Number() {
		return Property_Other_Tax_Parcel_Number;
	}
	public void setProperty_Other_Tax_Parcel_Number(
			String property_Other_Tax_Parcel_Number) {
		Property_Other_Tax_Parcel_Number = property_Other_Tax_Parcel_Number;
	}
	public String getProperty_Other_Tax_Payment_Frequency_Code_Description() {
		return Property_Other_Tax_Payment_Frequency_Code_Description;
	}
	public void setProperty_Other_Tax_Payment_Frequency_Code_Description(
			String property_Other_Tax_Payment_Frequency_Code_Description) {
		Property_Other_Tax_Payment_Frequency_Code_Description = property_Other_Tax_Payment_Frequency_Code_Description;
	}
	public String getProperty_Other_Tax_Escrow_Status_Indicator() {
		return Property_Other_Tax_Escrow_Status_Indicator;
	}
	public void setProperty_Other_Tax_Escrow_Status_Indicator(
			String property_Other_Tax_Escrow_Status_Indicator) {
		Property_Other_Tax_Escrow_Status_Indicator = property_Other_Tax_Escrow_Status_Indicator;
	}
	public String getProperty_Other_Tax_Authority_Name() {
		return Property_Other_Tax_Authority_Name;
	}
	public void setProperty_Other_Tax_Authority_Name(
			String property_Other_Tax_Authority_Name) {
		Property_Other_Tax_Authority_Name = property_Other_Tax_Authority_Name;
	}
	public String getLoan_Escrow_Cushion_Collected_Term() {
		return Loan_Escrow_Cushion_Collected_Term;
	}
	public void setLoan_Escrow_Cushion_Collected_Term(
			String loan_Escrow_Cushion_Collected_Term) {
		Loan_Escrow_Cushion_Collected_Term = loan_Escrow_Cushion_Collected_Term;
	}
	public String getBorrower_Work_Telephone_Number() {
		return Borrower_Work_Telephone_Number;
	}
	public void setBorrower_Work_Telephone_Number(
			String borrower_Work_Telephone_Number) {
		Borrower_Work_Telephone_Number = borrower_Work_Telephone_Number;
	}
	public String getLoan_Purpose_Type_Code() {
		return Loan_Purpose_Type_Code;
	}
	public void setLoan_Purpose_Type_Code(String loan_Purpose_Type_Code) {
		Loan_Purpose_Type_Code = loan_Purpose_Type_Code;
	}
	public String getLoan_Prepayment_Penalty_Indicator() {
		return Loan_Prepayment_Penalty_Indicator;
	}
	public void setLoan_Prepayment_Penalty_Indicator(
			String loan_Prepayment_Penalty_Indicator) {
		Loan_Prepayment_Penalty_Indicator = loan_Prepayment_Penalty_Indicator;
	}
	public String getLoan_Note_Late_Fee_Grace_Period() {
		return Loan_Note_Late_Fee_Grace_Period;
	}
	public void setLoan_Note_Late_Fee_Grace_Period(
			String loan_Note_Late_Fee_Grace_Period) {
		Loan_Note_Late_Fee_Grace_Period = loan_Note_Late_Fee_Grace_Period;
	}
	public BigDecimal getLoan_Note_Late_Fee_Percent() {
		return Loan_Note_Late_Fee_Percent;
	}
	public void setLoan_Note_Late_Fee_Percent(BigDecimal loan_Note_Late_Fee_Percent) {
		Loan_Note_Late_Fee_Percent = loan_Note_Late_Fee_Percent;
	}
	public String getLoan_Note_Late_Fee_Option_Type_Code() {
		return Loan_Note_Late_Fee_Option_Type_Code;
	}
	public void setLoan_Note_Late_Fee_Option_Type_Code(
			String loan_Note_Late_Fee_Option_Type_Code) {
		Loan_Note_Late_Fee_Option_Type_Code = loan_Note_Late_Fee_Option_Type_Code;
	}
	public BigDecimal getLoan_Interest_Rate_Buydown_Balance_Purchased_Amount() {
		return Loan_Interest_Rate_Buydown_Balance_Purchased_Amount;
	}
	public void setLoan_Interest_Rate_Buydown_Balance_Purchased_Amount(
			BigDecimal loan_Interest_Rate_Buydown_Balance_Purchased_Amount) {
		Loan_Interest_Rate_Buydown_Balance_Purchased_Amount = loan_Interest_Rate_Buydown_Balance_Purchased_Amount;
	}
	public BigDecimal getLoan_Interest_Rate_Original_Buydown_Balance_Amount() {
		return Loan_Interest_Rate_Original_Buydown_Balance_Amount;
	}
	public void setLoan_Interest_Rate_Original_Buydown_Balance_Amount(
			BigDecimal loan_Interest_Rate_Original_Buydown_Balance_Amount) {
		Loan_Interest_Rate_Original_Buydown_Balance_Amount = loan_Interest_Rate_Original_Buydown_Balance_Amount;
	}
	public BigDecimal getLoan_Interest_Rate_Original_Buydown_Term() {
		return Loan_Interest_Rate_Original_Buydown_Term;
	}
	public void setLoan_Interest_Rate_Original_Buydown_Term(
			BigDecimal loan_Interest_Rate_Original_Buydown_Term) {
		Loan_Interest_Rate_Original_Buydown_Term = loan_Interest_Rate_Original_Buydown_Term;
	}
	public BigDecimal getLoan_Interest_Rate_Buydown_Term() {
		return Loan_Interest_Rate_Buydown_Term;
	}
	public void setLoan_Interest_Rate_Buydown_Term(
			BigDecimal loan_Interest_Rate_Buydown_Term) {
		Loan_Interest_Rate_Buydown_Term = loan_Interest_Rate_Buydown_Term;
	}
	public BigDecimal getLoan_Interest_Rate_Buydown_First_Payment_Amount() {
		return Loan_Interest_Rate_Buydown_First_Payment_Amount;
	}
	public void setLoan_Interest_Rate_Buydown_First_Payment_Amount(
			BigDecimal loan_Interest_Rate_Buydown_First_Payment_Amount) {
		Loan_Interest_Rate_Buydown_First_Payment_Amount = loan_Interest_Rate_Buydown_First_Payment_Amount;
	}
	public BigDecimal getLoan_Interest_Rate_Buydown_Second_Payment_Amount() {
		return Loan_Interest_Rate_Buydown_Second_Payment_Amount;
	}
	public void setLoan_Interest_Rate_Buydown_Second_Payment_Amount(
			BigDecimal loan_Interest_Rate_Buydown_Second_Payment_Amount) {
		Loan_Interest_Rate_Buydown_Second_Payment_Amount = loan_Interest_Rate_Buydown_Second_Payment_Amount;
	}
	public BigDecimal getLoan_Monthly_Tax_And_Insurance_Payment_Amount() {
		return Loan_Monthly_Tax_And_Insurance_Payment_Amount;
	}
	public void setLoan_Monthly_Tax_And_Insurance_Payment_Amount(
			BigDecimal loan_Monthly_Tax_And_Insurance_Payment_Amount) {
		Loan_Monthly_Tax_And_Insurance_Payment_Amount = loan_Monthly_Tax_And_Insurance_Payment_Amount;
	}
	public String getLast_Successful_Data_Import() {
		return Last_Successful_Data_Import;
	}
	public void setLast_Successful_Data_Import(String last_Successful_Data_Import) {
		Last_Successful_Data_Import = last_Successful_Data_Import;
	}
	
	

}
