package io.github.oneofwolvesbilly.us_tax_demo.bean;

import java.util.List;

/**
 * The data shown on command line after calculating
 */
public class ResultData {
	
	private List<ProductDetail> productDetail;
	
	private double subtotal;
	
	private double salesTax;
	
	private double total;

	public List<ProductDetail> getProductDetail() {
		return productDetail;
	}

	public void setProductDetail(List<ProductDetail> productDetail) {
		this.productDetail = productDetail;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getSalesTax() {
		return salesTax;
	}

	public void setSalesTax(double salesTax) {
		this.salesTax = salesTax;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
