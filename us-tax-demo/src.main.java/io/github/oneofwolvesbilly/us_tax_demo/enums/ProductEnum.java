package io.github.oneofwolvesbilly.us_tax_demo.enums;

/**
 * An enum for product, including in name,group, and price
 */
public enum ProductEnum {
	SUSI("susi","food",4.99)
	,PIZZA("pizza","food",12.99)
	,T_SHIRT("T-shirt","clothing",2.45)
	,SHOES("shoes","clothing",9.99)
	;
	
	private String productName;
	
	private String productGroup;

	private double price;
	
	private ProductEnum(String productName, String productGroup, double price) {
		this.productName = productName;
		this.productGroup = productGroup;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductGroup() {
		return productGroup;
	}
	
	public double getPrice() {
		return price;
	}

	public static ProductEnum getEnumByProductName(String productName) {
		for (ProductEnum product : values()) {
			if(product.getProductName().equals(productName)) {
				return product;
			}
		}
		return null;
	}
}
