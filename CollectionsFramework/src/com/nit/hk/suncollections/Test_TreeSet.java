package com.nit.hk.suncollections;

import java.util.Comparator;
import java.util.TreeSet;

public class Test_TreeSet {

	public static void main(String[] args) {

		TreeSet<Integer> tr1 = new TreeSet<Integer>();
		tr1.add(5);
		tr1.add(6);
		tr1.add(7);
		System.out.println(tr1);
		System.out.println();

		TreeSet<Integer> tr2 = new TreeSet<Integer>(new IntegerComparator<Integer>());
		tr2.add(5);
		tr2.add(6);
		tr2.add(7);
		System.out.println(tr2);
		System.out.println();

		TreeSet<Integer> tr3 = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		tr3.add(5);
		tr3.add(6);
		tr3.add(7);
		System.out.println(tr3);
		System.out.println();

		TreeSet<Integer> tr4 = new TreeSet<Integer>((i1, i2) -> i1.compareTo(i2));
		tr4.add(5);
		tr4.add(6);
		tr4.add(7);
		System.out.println(tr4);
		

	}

}
