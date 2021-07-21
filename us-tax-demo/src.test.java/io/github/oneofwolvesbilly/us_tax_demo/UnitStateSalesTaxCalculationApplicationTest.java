package io.github.oneofwolvesbilly.us_tax_demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.github.oneofwolvesbilly.us_tax_demo.bean.InputData;
import io.github.oneofwolvesbilly.us_tax_demo.service.CalculateTax;
import io.github.oneofwolvesbilly.us_tax_demo.service.ValidateInput;

public class UnitStateSalesTaxCalculationApplicationTest {

	
	/**Test for unknown product*/
	@Test
	public void testValidateInputUnknownProduct() {
		Assertions.assertFalse(ValidateInput.checkProductName("Not a product"));
	}
	
	/**Test for non-number quantity */
	@Test
	public void testValidateInputQuantityIsNotNumber() {
		Assertions.assertFalse(ValidateInput.checkQuantity("Words"));
	}
	
	/**Test for not including in US States */
	@Test
	public void testValidateInputUnknownState() {
		Assertions.assertFalse(ValidateInput.checkLocation("Unknow"));
	}
	
	/**Test for passing after checking product, quantity,and state*/
	@Test
	public void testValidateInputAllCheckPass() {
		Assertions.assertTrue(ValidateInput.validateInput("shoes", "5", "NY"));
	}
	
	/**Test the calculator*/
	@Test
	public void testCalculate() {
		InputData firstData = new InputData("shoes", 5, "NY");
		InputData secondData = new InputData("pizza", 1, "NY");
		InputData thirdData = new InputData("T-shirt", 2, "NY");
		
		CalculateTax calcuateTax = new CalculateTax(firstData);
		calcuateTax.addProductDetail(secondData);
		calcuateTax.addProductDetail(thirdData);
		
		Assertions.assertTrue(calcuateTax.getResultData().getProductDetail().size() == 3);
		Assertions.assertTrue(calcuateTax.getResultData().getSalesTax() != 0);
		Assertions.assertTrue(calcuateTax.getResultData().getSubtotal() != 0);
		Assertions.assertTrue(calcuateTax.getResultData().getTotal() != 0);
	}
	
}
