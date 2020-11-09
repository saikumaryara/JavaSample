package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Test11_IteratorVsEnumeration {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");

		Iterator<Object> itr1 = al.iterator();

		System.out.println(itr1.next());
		al.add("e");// concurrently modified wit collection method
		// System.out.println(itr1.next());//throws CME because Iterator is fail-fast
		// cursor.

		Enumeration<Object> e1 = Collections.enumeration(al);
		System.out.println(e1.nextElement());
		al.add("f");// concurrently modified wit collection method
		// System.out.println(e1.nextElement());//throws CME because Enumeration is
		// fail-fast cursor.via enumeration method.

		Vector<Object> v1 = new Vector<Object>();
		v1.add(5);
		Iterator<Object> itr2 = v1.iterator();
		System.out.println(itr2.next());
		v1.add(6);// concurrently modified wit collection method
		// System.out.println(itr2.next());//throws CME because Enumeration is fail-fast
		// cursor.via enumeration method.

		Enumeration<Object> e2 = v1.elements();
		System.out.println(e2.nextElement());
		v1.add(7);// concurrently modified wit collection method
		System.out.println(e2.nextElement());// NO exception becauose Enumeration via elements() is not fail-fast

	}
}
