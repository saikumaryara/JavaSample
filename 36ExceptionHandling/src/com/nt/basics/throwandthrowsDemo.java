package com.nt.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwandthrowsDemo {

	public static void main(String[] args) {
		try {
			int result = Addition.add();
			System.out.println("Resullt" + result);
		}
		 catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
			}

		catch (IllegalArgumentException iae) {
			System.out.println(iae.getMessage());
		}

		catch (InputMismatchException ime) {
			System.out.println(ime.getMessage());
		}

	}

}

class Addition {
	static int add() throws IllegalArgumentException, InputMismatchException,ArithmeticException {
		Scanner sc = null;
		int fno;
		int sno;
		sc = new Scanner(System.in);
		try {
			System.out.println("Enter FNO");
			fno = sc.nextInt();
			System.out.println("Enter SNO");
			sno = sc.nextInt();
			if (fno < 0 || sno < 0) {
				throw new IllegalArgumentException("Do not pass negitive numbers::");
			}	

			if(sno<0) {	
			   throw new ArithmeticException(" Do not pass second value as Zero::");
			}
			int result= fno / sno;
			return result;
		}
		catch (InputMismatchException ime) {
			throw new InputMismatchException("Please pass only integer values::");
		}

	}
}