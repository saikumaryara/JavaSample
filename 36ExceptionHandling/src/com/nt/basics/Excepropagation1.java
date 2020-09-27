package com.nt.basics;

public class Excepropagation1 {

	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}

	static void m1() {
	
			System.out.println("In m1() start");
			System.out.println(10 / 0);
			//if ur not caugt exception it is propaated to calling method main()
			System.out.println("In m1() end");
		}

}
