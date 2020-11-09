package com.nit.hk.suncollections;

import java.util.Iterator;
import java.util.LinkedList;

public class Test03_LinkedList {

	public static void main(String[] args) {

		LinkedList<Object> l1 = new LinkedList<>();
		System.out.println("l1 size :" + l1.size());
		System.out.println("l1 eles :" + l1);
		System.out.println();

		l1.add("a");
		l1.add("b");
		l1.add(5);
		l1.add(6.7);
		l1.add("a");
		l1.add(5);
		l1.add(null);
		l1.add(null);
		l1.add(new A(5, 6));
		l1.add(new A(5, 6));

		System.out.println("l1 size :" + l1.size());
		System.out.println("l1 eles :" + l1);
		System.out.println();

		System.out.println("retrieving 3rd index object :" + l1.get(3));

		System.out.println();
		for (int i = 0; i < l1.size(); i++) {
			System.out.println("Sequential access " + (i) + " index object :" + l1.get(i));
		}

		System.out.println();

		System.out.println("Searching for \"a\" object :" + l1.contains("a"));

		System.out.println("Searching for \"a\" object :" + l1.indexOf("a"));
		

		System.out.println("Searching for \"a\" object :" + l1.lastIndexOf("a"));
		

		System.out.println();
		System.out.println("Removing for \"a\" object :" + l1.remove("a"));
        System.out.println(l1);
		System.out.println("Removing for \"new A(5,6)\" object :" + l1.remove(new A(5,6)));
		System.out.println("l1 eles :" + l1);
		System.out.println();
		l1.add(1,"c");
		System.out.println("l1 eles :" + l1);
		System.out.println();
		l1.set(4, "X");
		System.out.println();
		System.out.println("l1 size :" + l1.size());
		System.out.println("l1 eles :" + l1);
		
		System.out.println();
		
		


	}

}
