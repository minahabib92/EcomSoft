package edu.csi.csc330.classes;

public class Item {
	
	private String itemImagePath;
	private String itemName;
	private double itemPrice;
	private int quantity;
	private boolean outOfStock;
	
	
	public Item() {
		System.out.println("Item created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// Methods
	
	public void setItemName(String productName) {
		this.itemName = productName;
	}
	
	public void setItemPrice(double productPrice) {
		this.itemPrice = productPrice;
	}
	

}
