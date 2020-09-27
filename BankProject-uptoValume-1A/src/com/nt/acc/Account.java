package com.nt.acc;

import java.io.Serializable;
import java.util.Scanner;

public class Account implements Serializable {

	private long accNum;
	private String accHname;
	private double balance;
	private static String bankName;
	private static String branchName;
	private static String ifsc;
	static {
		bankName = "Syndicate";
		branchName = "Bhiknoor";
		ifsc = "SYND0003518";
	}

	public Account() {
		setBankName(bankName);
		setBranchName(branchName);
		setIfsc(ifsc);
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		Account.bankName = bankName;
	}

	public static String getBranchName() {
		return branchName;
	}

	public static void setBranchName(String branchName) {
		Account.branchName = branchName;
	}

	public static String getIfsc() {
		return ifsc;
	}

	public static void setIfsc(String ifsc) {
		Account.ifsc = ifsc;
	}

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public String getAccHname() {
		return accHname;
	}

	public void setAccHname(String accHname) {
		this.accHname = accHname;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		System.out.println("<<<<<<<<<<<<Your Deatails >>>>>>>>>>");
		return "Account [accNum=" + accNum + ", " + (accHname != null ? "accHname=" + accHname + ", " : "") + "balance="
				+ balance + "]";
	}

	public void Deposit() throws IllegalArgumentException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How much amount You want to Deposit ::");
		double amt = sc.nextDouble();
		if (amt <= 0)
			throw new IllegalArgumentException("Negitive numbers are not allowed");
		System.out.println("---Your Depositing Amount is::" + amt);
		setBalance(getBalance() + amt);
		System.out.println("---Your Current Balance is::" + getBalance());
	}

	public double withdraw() throws IllegalArgumentException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How much amount You want to WithDraw ::");
		double amount = sc.nextDouble();
		if (amount < 0)
			throw new IllegalArgumentException("please enter valid amount");
		if (amount > getBalance())
			throw new IllegalArgumentException("insufficient balance");
		setBalance(getBalance() - amount);
		System.out.println("---Your Withdrawing :: " + amount);
		System.out.println("---Your Current Balance is::" + getBalance());
		return amount;
	}

	double CurrentBalance() {
		System.out.println("---Your Current Balance is::" + getBalance());
		return getBalance();
	}

	public void TransferAmt(Account from, Account to) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Are You Want To Tranfer amount:: --Enter if(yes/no)::");
		char ch1 = sc1.nextLine().charAt(0);
		if (equalsIgnoreCase(ch1) == 'y') {
			System.out.println("Enter Amount To tanfer::");
			double Tamount = sc1.nextDouble();
			if (Tamount <= 0)
				throw new IllegalArgumentException("please enter some In available amount::");
			else {
				from.setBalance(from.getBalance() - Tamount);
				to.setBalance(to.getBalance() + Tamount);
				System.out.println("\nFunds successfully transfered.");
				System.out.println("---Your Current Balance is::" + from.getBalance());
			}
		} else {
			System.out.println("::Insufficient Balance::");
		}

		// System.out.println("::--YourTranfer operation is Declained ::");

	}

	private static char equalsIgnoreCase(char ch1) {
		return ch1;
	}
}