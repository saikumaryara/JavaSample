package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test09_RemovingElementsByUsingIterator {
	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();
		al.add("a");
		al.add(5);
		al.add("b");
		al.add('c');
		al.add(6.7);
		System.out.println();
		System.out.println(al);

		Iterator<Object> itr1 = al.iterator();
		// itr1.remove();//rule1 we can't call remove() before next() metod call
		itr1.next();
		itr1.remove();
		System.out.println(al);

		Iterator<Object> itr2 = al.iterator();

		while (itr2.hasNext()) {
			// itr2.remove();//not allowed
			Object obj = itr2.next();
			// itr2.remove();//allowed but all elements are removed
			if (obj instanceof String) {
				// itr2.remove();//only string type elements removed
			}
		}
		itr2.remove();// only last element is removed
		System.out.println(al);
	}
}
