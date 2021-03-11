package com.nt.main;

import com.nt.blogic.BankAccount;
import com.nt.threads.DepositerThread;
import com.nt.threads.WitdrawThread;

public class Bank {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main starts");

		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();

		DepositerThread dt1 = new DepositerThread(acc1, 5000, "counter1");
		DepositerThread dt2 = new DepositerThread(acc2, 7000, "counter2");

		WitdrawThread wt1 = new WitdrawThread(acc2, 200, "counter3");

		acc1.currentBalance();
		dt1.start();

		Thread.sleep(1000);

		acc2.currentBalance();

		dt2.start();
		wt1.start();

		acc1.currentBalance();
		acc2.currentBalance();
		System.out.println("main end");

	}
}