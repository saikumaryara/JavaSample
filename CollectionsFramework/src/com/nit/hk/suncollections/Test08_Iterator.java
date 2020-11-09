package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Test08_Iterator {
	public static void main(String[] args) {
		Vector<Object> v = new Vector();
		System.out.println();
		v.addElement("a");
		v.addElement("b");
		v.addElement(5);
		v.addElement(6.7);
		v.addElement('p');
		v.addElement(true);

		Iterator<Object> itr1 = v.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(9);
		System.out.println();
		System.out.println(al);

		Iterator<Integer> itr2 = al.iterator();
		while (itr2.hasNext()) {
			int i = itr2.next();
			System.out.println(i);
		}
	}
}
