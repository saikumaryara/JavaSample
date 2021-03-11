package com.nt.threads;

import com.nt.blogic.BankAccount;

public class DepositerThread extends Thread {
	
	public DepositerThread(BankAccount acc, double amt, String threadName) {
		super(threadName);
		this.acc = acc;
		this.amt = amt;
	}

	private BankAccount acc;
	private double amt;

	@Override
	public void run() {
		acc.deposit(amt);
	}
}
