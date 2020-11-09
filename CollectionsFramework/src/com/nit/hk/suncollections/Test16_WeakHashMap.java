package com.nit.hk.suncollections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class Test16_WeakHashMap {

	public static void main(String[] args) throws InterruptedException {

		HashMap<Object, Object> hm = new HashMap<Object, Object>();
		WeakHashMap<Object, Object> whm = new WeakHashMap<Object, Object>();

		System.out.println(hm);
		System.out.println(whm);
		System.out.println();

		String s1 = "a"; // string s1 is having Strong reference of pooling area
		Integer i1 = 5; // Integer i1 is having strong reference of pooling area
		A a1 = new A(5, 6);

		hm.put(s1, 1);
		hm.put(i1, 2);
		hm.put(a1, 3);
		hm.put("b", 4);
		hm.put(6, 5);
		hm.put(new A(6, 7), 6);

		System.out.println("HashMap Entries");
		System.out.println(hm);
		System.out.println("After gc call hm entries");
		System.out.println();

		System.gc();
		Thread.sleep(5000);

		System.out.println(hm);

		whm.put(s1, 1);
		whm.put(i1, 2);
		whm.put(a1, 3);
		whm.put("b", 4);
		whm.put(6, 5);
		whm.put(new A(6, 7), 6);

		System.out.println();
		System.out.println("WeakHashMap Entries");
		System.out.println(whm);
		System.out.println("After gc call whm entries");// weak referenece entries are removed

		System.gc();
		Thread.sleep(5000);

		System.out.println(whm);

	}

}
