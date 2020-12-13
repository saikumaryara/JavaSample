package com.nit.hk.suncollections;

import java.util.TreeSet;

public class Test_TreeMapInternal {

	public static void main(String[] args) {

		TreeSet<Object> ts1 = new TreeSet<>();

		ts1.add("a");
		ts1.add("c");
		ts1.add("b");
		System.out.println(ts1);

		// ts1.add(5); //CCE
		// ts1.add(null); //NPE

		TreeSet<Integer> ts2 = new TreeSet<>();

		ts2.add(5);
		ts2.add(7);
		ts2.add(6);
		System.out.println(ts2);

		TreeSet<A> ts3 = new TreeSet<>();

		ts3.add(new A(5, 6));
		ts3.add(new A(7, 5));
		ts3.add(new A(6, 9));
		System.out.println(ts3);

	}

}
