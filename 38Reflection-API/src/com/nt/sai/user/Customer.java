package com.nt.sai.user;

import com.nt.sai.spec.Product;

public class Customer {	
	public Customer() {}
   public void Buy(Product p) {
		p.diplayProducts();
		p.Sale();
	}
}
