package com.nt.classes;

public class A {
    static {
    	System.out.println("class A SB is loaded.");
    }
    public A(){
    	System.out.println("class A no-param cnstructor executed");
    }
    public static void main(String[] args) {
		System.out.println(" class A main is executed ");
	}
}
