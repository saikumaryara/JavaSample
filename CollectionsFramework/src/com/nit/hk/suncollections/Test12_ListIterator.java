package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test12_ListIterator {

	public static void main(String[] args) {

		ArrayList<Object> al1 = new ArrayList<Object>();
		al1.add("a");
		al1.add(5);
		al1.add("b");
		al1.add(6);
		al1.add("c");
		al1.add(7);

		System.out.println(al1);
		System.out.println();

		ListIterator<Object> listItr1 = al1.listIterator();
		while (listItr1.hasNext()) {
			System.out.println(listItr1.next());
		}
		System.out.println();
		while (listItr1.hasPrevious()) {
			System.out.println(listItr1.previous());
		}
		System.out.println();
		int count = 0;
		while (listItr1.hasNext()) {
			Object obj = listItr1.next();
			if (obj instanceof String) {
				String s = (String) obj;
				listItr1.set(s.toUpperCase());
			} else if (obj instanceof Integer) {
				int i = (int) obj;
				if (count++ == 0) {
					listItr1.set(20);
				}
			}
		}
		System.out.println(al1);

	}

}
