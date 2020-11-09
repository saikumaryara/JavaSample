package com.nit.hk.bean;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	private int strNum;
	private String city;

	public int getStrNum() {
		return strNum;
	}

	public void setStrNum(int strNum) {
		this.strNum = strNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("Address(%d, %s)", strNum, city);
	}
}