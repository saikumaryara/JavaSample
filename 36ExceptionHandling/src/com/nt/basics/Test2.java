package com.nt.basics;

import java.util.Scanner;

class PassNumber1{
	/* I want to pass one value from caller state
	 * and validate that value acc. to my class required method logic.
	 * if ur not pass correct value to acc. my reqiurement
	 * then ur not access my method inside logic
	 * whenever ur enter wrong value Ur Telling to Caller State	
	 * like please Enter required value
	 */
	static int Vote(int num)throws IllegalArgumentException {
		if(num>=18) {
			System.out.println("Your Eligible for Vote::");
		return num;
	}
		else {
		   throw new IllegalArgumentException("please Enter valid Elgibility Age::");
		}
		}
}
public class Test2 {

	public static void main(String[] args) {
		PassNumber1 t1=new PassNumber1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age::");
		try {
		int result=PassNumber1.Vote(sc.nextInt());
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}		
			
	}

}
