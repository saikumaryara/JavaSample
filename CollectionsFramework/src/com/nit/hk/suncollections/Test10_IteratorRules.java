package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test10_IteratorRules {
	public static void main(String[] args) {

		ArrayList<Object> al = new ArrayList<>();

		Iterator<Object> itr1 = al.iterator();

		System.out.println(itr1.hasNext());

		// System.out.println(itr1.next());//rule1:we ust not call next() on empty
		// collection or empty location
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		// al.add("a");//rule2 after obtaining iteratr object we can't nodify the
		// collection structurally
		// by using collection reference if we use same iterator we will get
		// concurrentOdificationExcetion because Iterator is fail fast 
		// we must use new iterator no problem

		// System.out.println(itr1.next());

		Iterator<Object> itr2 = al.iterator();

		System.out.println(itr2.next());

		// al.remove("a");
		System.out.println(itr2.next());

		itr2.remove();
		System.out.println(itr2.next());
		System.out.println(al);
		Iterator<Object> itr3 = al.iterator();
		// itr3.remove();//rule 3 we must not call remove() without callings next()

	}
}
