package com.nt.sai.impli;

import com.nt.sai.spec.Product;

public class Hp extends Laptop implements Product {
	public Hp() {
		this.setProductName("Hp");
		this.setProductId(10001);
		this.setAmount(28000.0);
		this.setQuantity(5);
	}

	private int productId;
	private String productName;
	private double amount;
	private int quantity;

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

	@Override
	public void diplayProducts() {
		System.out.println("Hp.diplayProducts()");
	}

	@Override
	public void Sale() {
		System.out.println("Hp.Sale()");
	}

}
