package com.nt.comps;

import java.io.*;

public class Bank implements Serializable {

	
	static double minBalance = 5000.0;
	private long accNo;
	private String accHName;
	private String username;
	private transient String passwaord;
	private transient double balance;
	
    public Bank() {

    }
	
	public static double getMinBalance() {
		return minBalance;
	}

	public static void setMinBalance(double minBalance) {
		Bank.minBalance = minBalance;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getAccHName() {
		return accHName;
	}

	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPasswaord() {
		return passwaord;
	}

	public void setPasswaord(String passwaord) {
		this.passwaord = passwaord;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double amt) {
		this.balance =this.balance+amt;
	}
	@Override
	public String toString() {
		return "Bank [accNo=" + accNo + ", " + (accHName != null ? "accHName=" + accHName + ", " : "")
				+ (username != null ? "username=" + username + ", " : "")
				+ (passwaord != null ? "passwaord=" + passwaord + ", " : "") + "balance=" + balance + "]";
	}

}
