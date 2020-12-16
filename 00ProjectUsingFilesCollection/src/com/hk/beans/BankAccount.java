package com.hk.beans;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;

import com.hk.helper.AccTypeMap;

public class BankAccount implements Comparable<BankAccount>, Serializable {

	private static final long serialVersionUID = 1L;
	private static String bankName;
	private static String branchName;
	private static String ifsc;

	private long accNo;
	private String accHName;
	private double balance;
	transient private String useraname;
	transient private String password;
	private String accType;

	static {
		System.out.println("SB BA loaded");
		try (FileReader reader = new FileReader("src/bankinfo.properties")) {
			Properties props = new Properties();
			props.load(reader);
			bankName = props.getProperty("BANK_NAME");
			branchName = props.getProperty("BRANCH_NAME");
			ifsc = props.getProperty("IFSC");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public BankAccount() {
		System.out.println("BankAccount-NPC executed");
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}

	public static String getBranchName() {
		return branchName;
	}

	public static void setBranchName(String branchName) {
		BankAccount.branchName = branchName;
	}

	public static String getIfsc() {
		return ifsc;
	}

	public static void setIfsc(String ifsc) {
		BankAccount.ifsc = ifsc;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getUseraname() {
		return useraname;
	}

	public void setUseraname(String useraname) {
		this.useraname = useraname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public int hashCode() {
		/*
		 * final int prime = 31; int result = 1; result = prime * result + ((accHName ==
		 * null) ? 0 : accHName.hashCode()); result = prime * result + (int) (accNo ^
		 * (accNo >>> 32)); result = prime * result + ((accType == null) ? 0 :
		 * accType.hashCode()); long temp; temp = Double.doubleToLongBits(balance);
		 * result = prime * result + (int) (temp ^ (temp >>> 32)); result = prime *
		 * result + ((password == null) ? 0 : password.hashCode()); result = prime *
		 * result + ((useraname == null) ? 0 : useraname.hashCode()); return result;
		 */

		// grouping objects as acctype
		return AccTypeMap.getAccTypeID(accType);
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;// same hashcode() is return
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		if (obj instanceof BankAccount) {

			BankAccount acc = (BankAccount) obj;

			return this.accType.equalsIgnoreCase(acc.accType) && this.accNo == acc.accNo;
		}
		return false;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("\n BankName   \t:" + bankName);
		sb.append("\n BranchName \t:" + branchName);
		sb.append("\n IFSC       \t:" + ifsc);
		sb.append("\n ACCNO      \t:" + accNo);
		sb.append("\n ACCHNAME   \t:" + accHName);
		sb.append("\n Balance    \t:" + balance);
		sb.append("\n UserName   \t:" + useraname);
		sb.append("\n Password   \t:" + password);
		sb.append("\n AccType    \t:" + accType);

		return sb.toString();
	}

	// For Sorting the objects
	@Override
	public int compareTo(BankAccount acc) {

		int accTypeDiff = AccTypeMap.getAccTypeID(this.accType) - AccTypeMap.getAccTypeID(acc.accType);
		if (accTypeDiff == 0) {
			long accNumDiff = this.accNo - acc.accNo;

			if (accNumDiff < 0)
				return -1;
			else if (accNumDiff > 0)
				return 1;
		}
		return accTypeDiff;
	}

}
