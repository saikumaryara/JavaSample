package com.nt.sai.impli;

import com.nt.sai.spec.Product;

public class Samsung extends Mobile implements Product {
	private int productId;
	private String productName;
	private double amount;
	private int quantity;

	public Samsung() {
		this.setProductName("Samsung");
		this.setProductId(10002);
		this.setAmount(8000.0);
		this.setQuantity(10);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Samsung(String productName, int productId, double amount, int quantity) {

	}

	@Override
	public void diplayProducts() {
		System.out.println("Samsung.diplayProducts()");
	}

	@Override
	public void Sale() {
		System.out.println("Samsung.Sale()");
	}

}
