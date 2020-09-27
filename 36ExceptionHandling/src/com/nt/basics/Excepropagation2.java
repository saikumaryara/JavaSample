package com.nt.basics;

public class Excepropagation2 {

	public static void main(String[] args) {
		System.out.println("main start");
	try {
		m1();
	} catch (ArithmeticException ae) {
		System.out.println("In m1 catch");
	}

		System.out.println("main end");
	}

	static void m1() {

			System.out.println("In m1() start");
			System.out.println(10 / 0);
			System.out.println("In m1() end");
	}

}
