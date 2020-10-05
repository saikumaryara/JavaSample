package com.nt.blogic;

public class BankAccount {
 private double balance;
 private double amt;
 public synchronized void deposit(double amt) {
	 this.balance=this.balance+amt;
	 System.out.println(amt+" Deposted successfully from thread "+Thread.currentThread().getName());
	 try {
			wait(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
 }
 public synchronized void witdraw(double amt) {
	 this.balance=this.balance-amt;
	 System.out.println(amt+" withdraw successfully from thread "+Thread.currentThread().getName());
	 try {
			wait(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notify();
 }
 public synchronized void currentBalance() {
	 System.out.println("Your current balance"+this.balance);
	 try {
			wait(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		notifyAll();

 }
}
