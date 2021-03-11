package com.nt.blogic;

public class BankAccount {
	private double balance;
	private double amt;

	public synchronized void deposit(double amt) {
		
		this.balance = this.balance + amt;
		System.out.println(amt + " Deposted successfully from thread " + Thread.currentThread().getName());
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}

	public synchronized void witdraw(double amt) {
		
		this.balance = this.balance - amt;
		System.out.println(amt + " withdraw successfully from thread " + Thread.currentThread().getName());
		try {
			wait(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
	}

	public synchronized void currentBalance() {
		try {
			Thread.sleep(100);
			System.out.println("Your current balance" + this.balance);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
