package com.nt.basics;

public class Excepropagation {

	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}

	static void m1() {
		try {
			System.out.println("In m1() start");
			System.out.println(10 / 0);
			//Here the exception is not propaated to main()
			System.out.println("In m1() end");
		} catch (ArithmeticException ae) {
			System.out.println("In m1 catch");
		}
	}

}
