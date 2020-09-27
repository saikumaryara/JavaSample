package com.nt.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division1 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value::");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("C value::" + c);
	}catch(ArrayIndexOutOfBoundsException aiob) {
		System.out.println("Please pass atleast two integer values::");
	}catch(InputMismatchException ime) {
		System.out.println("Please pass only two integer values::");
	}catch(ArithmeticException ae) {
		System.out.println("Please donot pass second value as Zero::");
	}
   }
}
