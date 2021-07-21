package io.github.oneofwolvesbilly.us_tax_demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;

import io.github.oneofwolvesbilly.us_tax_demo.bean.InputData;
import io.github.oneofwolvesbilly.us_tax_demo.bean.ProductDetail;
import io.github.oneofwolvesbilly.us_tax_demo.bean.ResultData;
import io.github.oneofwolvesbilly.us_tax_demo.enums.ProductEnum;
import io.github.oneofwolvesbilly.us_tax_demo.enums.SalesTaxByState2021Enum;
import io.github.oneofwolvesbilly.us_tax_demo.enums.UnitedStatesStateEnum;

/**
 * Calculate Service
 */
public class CalculateTax {

	
	
	private ResultData resultData;


	public CalculateTax() {

		this.resultData = new ResultData();
	}

	public CalculateTax(InputData inputData) {
		super();
		this.resultData = new ResultData();
		addProductDetail(inputData);
	}
	
	public void addProductDetail(InputData inputData) {
		ProductDetail detail = new ProductDetail() ;

		detail.setProductName(inputData.getItemName());
		
		detail.setQty(inputData.getQuantity());
		
		detail.setPrice(ProductEnum.getEnumByProductName(inputData.getItemName()).getPrice());

		if(resultData.getProductDetail() == null) {
			resultData.setProductDetail(new ArrayList<ProductDetail>() );
		}
		this.resultData.getProductDetail().add(detail);
		
		calculateResult(inputData);
	}
	
	
	private void calculateResult(InputData inputData) {
		
		double salesTax = resultData.getSalesTax();
		
		double subtotal = resultData.getSubtotal();
		
		double total = resultData.getTotal();
		
		salesTax = roundUp(salesTax + calculateTax(inputData));
		
		subtotal = roundUp(subtotal + ProductEnum.getEnumByProductName(inputData.getItemName()).getPrice() * inputData.getQuantity());
		
		total = salesTax +subtotal;
		
		this.resultData.setSalesTax(salesTax);
		
		this.resultData.setSubtotal(subtotal);
		
		this.resultData.setTotal(total);
	}
	
	private double calculateTax(InputData inputData) {
		ProductEnum productEnum =ProductEnum.getEnumByProductName(inputData.getItemName()); 
		double price = productEnum.getPrice();
		boolean exemptFlag = false;
		String local = null;
		if(UnitedStatesStateEnum.getEnumByCode(inputData.getLocation()) != null) {
			local = UnitedStatesStateEnum.getEnumByCode(inputData.getLocation()).getUnitedStatesPostalServiceCode();
		}else {
			local = UnitedStatesStateEnum.getEnumByName(inputData.getLocation()).getUnitedStatesPostalServiceCode();
		}
		switch (productEnum.getProductGroup()) {
		case "food":
			exemptFlag = SalesTaxByState2021Enum.getSalesTaxByState(local).isPreparedFoodExemptionFlag();
			break;
		case "clothing":
			exemptFlag = SalesTaxByState2021Enum.getSalesTaxByState(local).isClothingExemptionFlag();
			break;

		default:
			break;
		}
		if(exemptFlag) {
			return 0.0;
		}
		double tax = price * inputData.getQuantity() * SalesTaxByState2021Enum.getSalesTaxByState(local).getSalesTax();
		
		return roundUp(tax); 
		
	}
	
	private double roundUp(double input) {
		BigDecimal calInput = new BigDecimal(input); 
		double inputInt = calInput.setScale(0, BigDecimal.ROUND_DOWN).doubleValue();
		double numAfterPoint = input-inputInt;
		
		if(numAfterPoint % 0.05 == 0.00) {
			return inputInt;
		}else if(numAfterPoint % 0.1 <= 0.05){
			return new BigDecimal(inputInt + new BigDecimal(numAfterPoint)
					.setScale(1, BigDecimal.ROUND_DOWN).doubleValue() +0.05)
					.setScale(2, BigDecimal.ROUND_DOWN).doubleValue();
		}else {
			return new BigDecimal(inputInt + new BigDecimal(numAfterPoint)
					.setScale(1, BigDecimal.ROUND_DOWN).doubleValue() +0.10)
					.setScale(2, BigDecimal.ROUND_DOWN).doubleValue() ;
		}
	}

	public ResultData getResultData() {
		return resultData;
	}

	public void setResultData(ResultData resultData) {
		this.resultData = resultData;
	}
	
}
