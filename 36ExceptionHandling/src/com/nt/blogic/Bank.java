package com.nt.blogic;

import com.nt.exceptions.InsufficientFundsException;
import com.nt.exceptions.InvalidAmountException;

public interface Bank {
	public void deposit(double amt) throws InvalidAmountException;
	public double withdraw(double amt)throws InsufficientFundsException,InvalidAmountException;
	public double tranferAmt(Bank acc,double amt)throws InsufficientFundsException,InvalidAmountException;
	public double currentBalance();
}
