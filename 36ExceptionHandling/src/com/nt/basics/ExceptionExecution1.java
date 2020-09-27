package com.nt.basics;

import java.util.Scanner;

public class ExceptionExecution1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value::");
		int a = sc.nextInt();
		System.out.println("Enter b value");
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("C value::" + c);
	}

}
