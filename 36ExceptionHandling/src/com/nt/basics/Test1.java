package com.nt.basics;

import java.util.Scanner;

class PassNumber{
	/* I want to pass one value from caller state
	 * and validate that value acc. to my class required method logic.
	 * if ur not pass correct value to acc. my reqiurement
	 * then ur not access my method inside logic
	 * and stop the program execution flow
	 */
	static int Vote(int num) {
		if(num>=18)
			System.out.println("Your Eligible for Vote::");
		else
			System.out.println("Your Not Eligible For Vote::");
		return num;
	}
}
public class Test1 {

	public static void main(String[] args) {
		PassNumber t1=new PassNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age::");
		int result=PassNumber.Vote(sc.nextInt());
		System.out.println("Because Your :: "+result);
		//but here ur not giving to help to user class like please Enter required value
	    //So Here whenever ur enter wrong value Ur Not Telling to Caller State	
		// like please Enter required value
		   //or
		if(result<18) {
			System.out.println("Please Enter valid Eligibilty Age >=18::");
		}
			
	}

}
