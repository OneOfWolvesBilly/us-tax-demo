package io.github.oneofwolvesbilly.us_tax_demo.application;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

import io.github.oneofwolvesbilly.us_tax_demo.bean.InputData;
import io.github.oneofwolvesbilly.us_tax_demo.bean.ProductDetail;
import io.github.oneofwolvesbilly.us_tax_demo.bean.ResultData;
import io.github.oneofwolvesbilly.us_tax_demo.service.CalculateTax;
import io.github.oneofwolvesbilly.us_tax_demo.service.ValidateInput;


/**
 * Command line control with main method
 */

public class UnitStateSalesTaxCalculationApplication {
	public static void main(String[] args) {
	
		System.out.println("Please type in the product name, quantity,and location. And start to calculate after typing in character 'C'.");
		
		Scanner scanner = new Scanner(System.in);
		
		String product =null;
		
		ResultData result = null;
		
		CalculateTax calcuateTax =new CalculateTax();
		
		/**input */
		while(result == null) {
			
			product = scanner.nextLine();
			
			/** validate*/
			if (product == null) {
				
				System.out.println("Please type again.");
			
				continue;
			}else if("c".equals(product.trim()) || "C".equals(product.trim())) {
				result = calcuateTax.getResultData();
				break;
			}
			
			String [] details = product.split(",");
			if(details == null || details.length != 3 ) {
				System.out.println("Please type again.");
				
				continue;
			}
			
			String productName= details[0];
			
			String quantity = details[1] ;
			
			String location  = details[2];
			
			
			if(!ValidateInput.validateInput(productName, quantity, location)) {
				
				System.out.println("Please type again.");
				
				continue;
				
			}
			if(calcuateTax == null) {
				calcuateTax = new CalculateTax(new InputData(productName.trim(), new BigDecimal(quantity.trim()).intValue(), location.trim()));
			}else {
				calcuateTax.addProductDetail(new InputData(productName.trim(), new BigDecimal(quantity.trim()).intValue(), location.trim()));
			}
		}
		
		
		/** print output*/
		for (ProductDetail detail:   result.getProductDetail()) {
			System.out.println(detail.getProductName() +"    "+ detail.getQty()  +"    "+ detail.getPrice());
		}
	
		System.out.println("Subtotal :       "+ new DecimalFormat("#0.00").format (result.getSubtotal()));
		System.out.println("Sales Tax:       "+ new DecimalFormat("#0.00").format (result.getSalesTax()));
		System.out.println("Total    :       "+ new DecimalFormat("#0.00").format (result.getTotal()));
		scanner.close();
	}
}
