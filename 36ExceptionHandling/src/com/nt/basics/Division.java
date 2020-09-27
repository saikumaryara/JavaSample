package com.nt.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

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
		aiob.printStackTrace();
		System.out.println(aiob.getMessage());
		System.out.println(aiob.toString());
	}catch(InputMismatchException ime) {
		ime.printStackTrace();
		System.out.println(ime.getMessage());
		System.out.println(ime.toString());
	}catch(ArithmeticException ae) {
		ae.printStackTrace();
		System.out.println(ae.getMessage());
		System.out.println(ae.toString());
	}
   }
}
