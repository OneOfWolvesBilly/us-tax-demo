package io.github.oneofwolvesbilly.us_tax_demo.enums;

/**
 * An enum for SalesTax, including states, max tax, and exempt flag
 */
public enum SalesTaxByState2021Enum {

	ALABAMA("AL",0.115,false,false,true,false,false,false,false)
	,ALASKA("AK",0.0,true,true,true,true,true,true,true)
	,ARIZONA("AZ",0.112,true,false,true,false,false,false,false)
	,ARKANSAS("AR",0.115,false,false,true,false,false,true,false)
	,CALIFORNIA("CA",0.0975,true,false,true,false,false,true,true)
	,COLORADO("CO",0.112,true,false,true,false,false,false,false)
	,CONNECTICUT("CT",0.0635,true,false,true,true,false,false,true)
	,DELAWARE("DE",0.00,true,true,true,true,true,true,true)
	,DISTRICT_OF_COLUMBIA("DC",0.6,true,false,true,true,false,false,false)
	,FLORIDA("FL",0.075,true,false,true,false,false,true,true)
	,GEORGIA("GA",0.089,false,false,true,false,false,true,false)
	,HAWAII("HI",0.045,false,false,false,false,false,false,false)
	,IDAHO("ID",0.09,false,false,true,false,false,false,false)
	,ILLINOIS("IL",0.11,false,false,false,false,false,false,false)
	,INDIANA("IN",0.07,true,false,true,false,false,false,false)
	,IOWA("IA",0.07,true,false,true,false,false,true,false)
	,KANSAS("KS",0.106,false,false,false,false,false,true,false)
	,KENTUCKY("KY",0.06,true,false,true,false,false,false,false)
	,LOUISIANA("LA",0.1145,false,false,false,false,false,false,false)
	,MAINE("ME",0.055,true,false,true,false,false,false,false)
	,MARYLAND("MD",0.06,true,false,true,false,false,false,true)
	,MASSACHUSETTS("MA",0.0625,true,false,true,false,true,true,true)
	,MICHIGAN("MI",0.06,true,false,true,false,false,true,false)
	,MINNESOTA("MN",0.08875,true,false,true,false,true,false,true)
	,MISSISSIPPI("MS",0.08,false,false,false,false,false,false,false)
	,MISSIOURI("MO",0.1035,false,false,false,false,false,true,true)
	,MONTANA("MT",0.0,true,true,true,true,true,true,true)
	,NEBRASKA("NB",0.08,true,false,false,false,false,false,false)
	,NEVADA("NV",0.008375,true,false,true,false,false,true,true)
	,NEW_HAMPSHIRE("NH",0.09,true,false,true,true,true,true,true)
	,NEW_JERSEY("NJ",0.06625,true,false,true,true,true,true,true)
	,NEW_MEXICO("NM",0.14187,true,false,false,false,false,false,false)
	,NEW_YORK("NY",0.08875,true,false,true,true,true,false,true)
	,NORTH_CAROLINA("NC",0.075,false,false,true,false,false,false,false)
	,NORTH_DAKOTA("ND",0.085,true,false,false,false,false,true,false)
	,OHIO("OH",0.08,true,false,true,false,false,false,true)
	,OKLAHOMA("OK",0.11,false,false,false,false,false,true,false)
	,OREGON("OR",0.00,true,true,true,true,true,true,true)
	,PENNSYLVANIA("PA",0.08,true,false,true,true,true,false,true)
	,PUERTO_RICO("PR",0.115,false,false,true,false,false,false,false)
	,RHODE_ISLAND("RI",0.07,true,false,true,false,true,true,true)
	,SOUTH_CAROLINA("SC",0.09,true,false,true,false,false,true,false)
	,SOUTH_DAKOTA("SD",0.11,false,false,false,false,false,false,false)
	,TENNESSEE("TN",0.0975,false,false,false,false,false,false,false)
	,TEXAS("TX",0.0825,true,false,true,true,false,false,false)
	,ULTAH("UT",0.0905,false,false,true,false,false,false,true)
	,VERMONT("VT",0.07,true,false,true,true,true,false,false)
	,VIRGINIA("VA",0.07,false,false,true,true,false,true,false)
	,WASHINGTON("WA",0.105,true,false,true,false,false,false,false)
	,WEST_VIRGINIA("WV",0.07,true,false,true,false,false,true,false)
	,WISCONSIN("WI",0.0675,true,false,true,false,false,false,false)
	,WYOMING("WY",0.06,true,false,true,false,false,false,false)
	;
	
	private String stateName;
	
	private double salesTax;
	
	private boolean groceriesExemptionFlag;
	
	private boolean preparedFoodExemptionFlag;
	
	private boolean prescriptionDrugExemptionFlag;
	
	private boolean nonPrescriptionDrugExemptionFlag;
	
	private boolean clothingExemptionFlag;
	
	private boolean intangiblesExemptionFlag;
	
	private boolean feminineHygieneExemptionFlag;

	private SalesTaxByState2021Enum(String stateName, double d, boolean groceriesExemptionFlag,
			boolean preparedFoodExemptionFlag, boolean prescriptionDrugExemptionFlag,
			boolean nonPrescriptionDrugExemptionFlag, boolean clothingExemptionFlag, boolean intangiblesExemptionFlag,
			boolean feminineHygieneExemptionFlag) {
		this.stateName = stateName;
		this.salesTax = d;
		this.groceriesExemptionFlag = groceriesExemptionFlag;
		this.preparedFoodExemptionFlag = preparedFoodExemptionFlag;
		this.prescriptionDrugExemptionFlag = prescriptionDrugExemptionFlag;
		this.nonPrescriptionDrugExemptionFlag = nonPrescriptionDrugExemptionFlag;
		this.clothingExemptionFlag = clothingExemptionFlag;
		this.intangiblesExemptionFlag = intangiblesExemptionFlag;
		this.feminineHygieneExemptionFlag = feminineHygieneExemptionFlag;
	}

	public String getStateName() {
		return stateName;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public boolean isGroceriesExemptionFlag() {
		return groceriesExemptionFlag;
	}

	public boolean isPreparedFoodExemptionFlag() {
		return preparedFoodExemptionFlag;
	}

	public boolean isPrescriptionDrugExemptionFlag() {
		return prescriptionDrugExemptionFlag;
	}

	public boolean isNonPrescriptionDrugExemptionFlag() {
		return nonPrescriptionDrugExemptionFlag;
	}

	public boolean isClothingExemptionFlag() {
		return clothingExemptionFlag;
	}

	public boolean isIntangiblesExemptionFlag() {
		return intangiblesExemptionFlag;
	}

	public boolean isFeminineHygieneExemptionFlag() {
		return feminineHygieneExemptionFlag;
	}

	public static SalesTaxByState2021Enum getSalesTaxByState(String name) {
		for (SalesTaxByState2021Enum salesTaxByState : values()) {
			if(salesTaxByState.getStateName().equals( name));
			return salesTaxByState;
		}
		return null;
	}
}
