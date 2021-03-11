package com.nt.threads;

import com.nt.blogic.BankAccount;

public class WitdrawThread extends Thread {
	
	private BankAccount acc;
	private double amt;

	public WitdrawThread(BankAccount acc, double amt, String threadName) {
		super(threadName);
		this.acc = acc;
		this.amt = amt;
	}

	@Override
	public void run() {
			acc.witdraw(amt);
	}

}
