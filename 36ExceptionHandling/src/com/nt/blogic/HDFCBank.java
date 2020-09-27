package com.nt.blogic;
import java.util.Scanner;
import com.nt.exceptions.InsufficientFundsException;
import com.nt.exceptions.InvalidAmountException;

public class HDFCBank implements Bank {
	private double balance = 0.0;
	

	public double getBalance() {
		return balance;
	}

	

	@Override
	public void deposit(double amt) throws InvalidAmountException {
		if (amt <= 0)
			throw new InvalidAmountException("Error::Please Enter Valid amount to Deposit.");
		balance=(getBalance() + amt);
		System.out.println("Your Deposited amount is::" + amt);
	}

	@Override
	public double withdraw(double amt) throws InsufficientFundsException, InvalidAmountException {
		if (amt <= 0)
			throw new InvalidAmountException("Error::Please Enter Available Amount to Withdraw.");
		if (amt > getBalance())
			throw new InsufficientFundsException("insufficient balance");
		balance=(getBalance() - amt);
		return amt;
	}

	@Override
	public double tranferAmt(Bank acc, double amt) throws InsufficientFundsException, InvalidAmountException {
		if (amt <= 0)
			throw new InvalidAmountException("Error::Please Enter Valid amount to Transfer.");
		else if (amt > getBalance())
			throw new InsufficientFundsException("You Do not have sufficient Amount To Trsnfer");
		return amt;
	}

	@Override
	public double currentBalance() {
		System.out.println("---Your Current Balance is::" + getBalance());
		return balance;
	}
}
