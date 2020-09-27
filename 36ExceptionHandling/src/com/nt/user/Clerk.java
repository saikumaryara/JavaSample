package com.nt.user;

import java.util.Scanner;
import com.nt.blogic.Bank;
import com.nt.blogic.HDFCBank;
import com.nt.exceptions.InsufficientFundsException;
import com.nt.exceptions.InvalidAmountException;

public class Clerk {

	public static void main(String[] args) {
	try {	
	        Bank acc1=new HDFCBank();
			Bank acc2=new HDFCBank();
			Scanner sc=new Scanner(System.in);
			
			  System.out.println("Enter Deposit Amount::"); 
			  double amt1 = sc.nextDouble();
			  acc1.deposit(amt1);
			  acc1.currentBalance(); 
			  System.out.println("Enter WithDraw Amount::");
			  double amt2 = sc.nextDouble();
			  double withDrawAmt = acc1.withdraw(amt2);
			  System.out.println("Yous Withdrawing Amount is::" + withDrawAmt);
			  acc1.currentBalance(); 
	
			  System.out.println("Enter Tranfer Amount::"); 
			  double amt3 = sc.nextDouble();
			  double TranferAmt = acc1.tranferAmt(acc2, amt1); 
			  acc1.currentBalance();
			  
		} catch (InvalidAmountException  e) {
			System.out.println(e.getMessage());
		}catch (InsufficientFundsException e1) {
			System.out.println(e1.getMessage());
	}
}
}