package com.nt.bank;

import java.util.Scanner;
import com.nt.acc.Account;
import com.nt.accGen.AccountNumber;

public class Bank {

	public static void main(String[] args) {
		int index = 0;
		char option;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter How many Accounts Deatils::");
			Account[] accounts = new Account[sc.nextInt()];
			for (int i = 0; i < accounts.length; i++) {
				Scanner sc1 = new Scanner(System.in);
				accounts[i] = new Account();
				System.out.println("Enter account" + (i + 1) + " details");
				System.out.println("Enter Acc HolderName::");
				accounts[i].setAccHname(sc1.nextLine());
				System.out.print("  Enter Balance applying for Account\t: ");
				accounts[i].setBalance(sc1.nextDouble());
				System.out.println("Account" + i + " data is saved");

				System.out.println("\n\nApplying for AccountNumber");

				AccountNumber acno = new AccountNumber();

				acno.applyForAccount(accounts);
				System.out.println("\n\nAccHName Name\t\tAccount Number");
				System.out.println("======================================");
				Account[] AccounttsWithAccNumber = acno.getAccNum();
				for (Account s : AccounttsWithAccNumber) {
					if (s != null)
						System.out.println(s.getAccHname() + "\t\t\t\t" + s.getAccNum());
					else
						break;
				} // for
				System.out.println(accounts[i]);

			} // for
			System.out.println("For which Object you want to Deposit Money:: ");
			System.out.println("Enter Account Obj ref 0 / 1 / ...");
			switch (index = sc.nextInt()) {
			case 0:
				accounts[index].Deposit();
				break;
			case 1:
				accounts[index].Deposit();
				break;
			}
			System.out.println("From which Object you want to Witdraw Money:: ");
			System.out.println("Enter Account Obj ref 0 / 1 / ...");
			switch (index = sc.nextInt()) {
			case 0:
				accounts[index].withdraw();
				break;
			case 1:
				accounts[index].withdraw();
				break;
			}
			System.out.println("Enter to which Account Obj ref 0 / 1 / .. to Transfer Money::");
			int to = sc.nextInt();
			System.out.println("From which Object you want to Transfer Money:: ");
			switch (index = sc.nextInt()) {
			case 0:
				accounts[index].TransferAmt(accounts[index], accounts[to]);
				break;
			case 1:
				accounts[index].TransferAmt(accounts[index], accounts[to]);
				break;
			}
			// accounts[index].Deposit();
			// accounts[index].withdraw();
			// accounts[index].TransferAmt();
			System.out.print("\nDo you want to continue?To Store account Details ");
			System.out.print("  Enter (Y/N): ");
			option = sc.next().charAt(0);
		} while ((equalsIgnoreCase(option) == 'y'));

	}// main

	private static char equalsIgnoreCase(char str) {
		return str;
	}
}