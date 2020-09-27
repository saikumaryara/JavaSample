package com.nt.user;

import java.util.Scanner;
import com.nt.blogic.Bank;
import com.nt.blogic.HDFCBank;
import com.nt.exceptions.InsufficientFundsException;
import com.nt.exceptions.InvalidAmountException;

public class Clerk {

	public static void main(String[] args) {
		try {
			int index=0;
			char option = 0;
			Bank acc1=new HDFCBank();
			Bank acc2=new HDFCBank();
			Scanner sc=new Scanner(System.in);
			do { System.out.println("1 For Deposit::");
			  System.out.println("2 For Withdraw::");
			  System.out.println("3 For TranferAmount::");
			  System.out.println("Enter Which option You Want to Perform::"); 
			  sc.nextInt(); 
			  switch (index) {
			  case 1: {
			  System.out.println("Enter Deposit Amount::"); 
			  double amt = sc.nextDouble();
			  acc1.deposit(amt); acc1.currentBalance(); }
			  case 2: {
			  System.out.println("Enter WithDraw Amount::");
			  double amt = sc.nextDouble();
			  double withDrawAmt = acc1.withdraw(amt);
			  System.out.println("Yous Withdrawing Amount is::" + withDrawAmt);
			  acc1.currentBalance(); 
			  break; 
			  }
			  case 3: {
			  System.out.println("Enter Tranfer Amount::"); 
			  double amt = sc.nextDouble();
			  double TranferAmt = acc1.tranferAmt(acc2, amt); acc1.currentBalance(); break;
			  } default:{ System.out.print("  Enter (Y/N): "); option =
			  sc.next().charAt(0); } } 
			  } while ((equalsIgnoreCase(option) == 'y'));
			 
		} catch (InvalidAmountException | InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
	}

	private static char equalsIgnoreCase(char str) {
		return str;
	}

}