package io.github.oneofwolvesbilly.us_tax_demo.bean;


/**
 * the data from command line
 */
public class InputData {
	
	private String itemName;
	
	private int quantity;
	
	private String location;

	public InputData() {
		super();
	}

	public InputData(String itemName, int quantity, String location) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.location = location;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
