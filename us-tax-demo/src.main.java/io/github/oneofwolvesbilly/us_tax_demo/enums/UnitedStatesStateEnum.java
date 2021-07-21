package io.github.oneofwolvesbilly.us_tax_demo.enums;

/**
 * An enum wtih U.S. states 
 */
public enum UnitedStatesStateEnum {

	ALABAMA("Alabama","AL")
	,ALASKA("Alaska","AK")
	,ARIZONA("Arizona","AZ")
	,ARKANSAS("Arkansas","AR")
	,CALIFORNIA("California","CA")
	,COLORADO("Colorado","CO")
	,CONNECTICUT("Connecticut","CT")
	,DELAWARE("Delaware","DE")
	,DISTRICT_OF_COLUMBIA("District of Columbia","DC")
	,FLORIDA("Florida","FL")
	,GEORGIA("Georgia","GA")
	,HAWAII("Hawaii","HI")
	,IDAHO("Idaho","ID")
	,ILLINOIS("Illinois","IL")
	,INDIANA("Indiana","IN")
	,IOWA("Iowa","IA")
	,KANSAS("Kansas","KS")
	,KENTUCKY("Kentucky","KY")
	,LOUISIANA("Louisiana","LA")
	,MAINE("Maine","ME")
	,MARYLAND("Maryload","MD")
	,MASSACHUSETTS("Massachusetts","MA")
	,MICHIGAN("Michigan","MI")
	,MINNESOTA("Minnesota","MN")
	,MISSISSIPPI("Mississippi","MS")
	,MISSIOURI("Missouri","MO")
	,MONTANA("Montana","MT")
	,NEBRASKA("Nebraska","NB")
	,NEVADA("Nevada","NV")
	,NEW_HAMPSHIRE("New Hampshire","NH")
	,NEW_JERSEY("New Jersey","NJ")
	,NEW_MEXICO("New Mexico","NM")
	,NEW_YORK("New York","NY")
	,NORTH_CAROLINA("North Carolina","NC")
	,NORTH_DAKOTA("North Dakota","ND")
	,OHIO("Ohio","OH")
	,OKLAHOMA("Oklahoma","OK")
	,OREGON("Oregon","OR")
	,PENNSYLVANIA("Pennsylvania","PA")
	,PUERTO_RICO("Puerto Rico","PR")
	,RHODE_ISLAND("Rhode Island","RI")
	,SOUTH_CAROLINA("South Carolina", "SC")
	,SOUTH_DAKOTA("South Dakota","SD")
	,TENNESSEE("Tennessee","TN")
	,TEXAS("Texas","TX")
	,ULTAH("Ultah","UT")
	,VERMONT("Vermont","VT")
	,VIRGINIA("Virginia","VA")
	,WASHINGTON("Washington","WA")
	,WEST_VIRGINIA("West Virginia","WV")
	,WISCONSIN("Wisconsin","WI")
	,WYOMING("Wyoming","WY")
	;
	
	private String name;
	
	private String unitedStatesPostalServiceCode;

	private UnitedStatesStateEnum(String name, String unitedStatesPostalServiceCode) {
		this.name = name;
		this.unitedStatesPostalServiceCode = unitedStatesPostalServiceCode;
	}

	public String getName() {
		return name;
	}

	public String getUnitedStatesPostalServiceCode() {
		return unitedStatesPostalServiceCode;
	}
	
	public static UnitedStatesStateEnum getEnumByName(String name) {
		for(UnitedStatesStateEnum state:values()) {
			if (state.getName().equals(name)) {
				return state;
			}
		}
		return null;
	}
	
	public static UnitedStatesStateEnum getEnumByCode(String code) {
		for(UnitedStatesStateEnum state:values()) {
			if (state.getUnitedStatesPostalServiceCode().equals(code)) {
				return state;
			}
		}
		return null;
	}
}
