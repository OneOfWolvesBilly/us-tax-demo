package io.github.oneofwolvesbilly.us_tax_demo.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.github.oneofwolvesbilly.us_tax_demo.enums.ProductEnum;
import io.github.oneofwolvesbilly.us_tax_demo.enums.UnitedStatesStateEnum;

/**
 * Validate service
 */
public class ValidateInput {
	
	public static boolean validateInput(String productName,String quantity,String location) {
		
		return (checkProductName(productName) && checkQuantity(quantity) && checkLocation(location));
		
	}

	public static boolean checkProductName(String productName) {

		return ProductEnum.getEnumByProductName(productName) != null;
		
	}
	
	public static boolean checkQuantity(String quantity) {
		Pattern pattern = Pattern.compile("[0-9]*"); 
		Matcher isNum = pattern.matcher(quantity); 
		return quantity != null && isNum.matches() && !quantity.matches("-");
		
	}

	public static boolean checkLocation(String location) {
		return (UnitedStatesStateEnum.getEnumByCode(location) != null || UnitedStatesStateEnum.getEnumByName(location) != null);
	}
}
