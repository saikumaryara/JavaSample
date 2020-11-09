package com.nit.performence;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test08_Removing_Duplicates_ArrayList {
	static List<Object> list = new ArrayList<>();

	static void reomveDuplicates(List<Object> list) {
		for (int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			for (int j = 0; j < list.size(); j++) {
				Object ele = list.get(i);
				if (obj == null) {
					if (ele == null)
						list.remove(j);
				} else {
					if (obj.equals(ele))
						list.remove(j);
				}

			}
		}

	}

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();

		list.add("a");
		list.add("b");
		list.add("b");
		list.add(5);
		list.add("c");
		list.add(5);
		list.add(6.7);
		System.out.println(list);
		/*
		 * reomveDuplicates(list); System.out.println(list);
		 */

		LinkedHashSet<Object> lhs = new LinkedHashSet<>(list);

		System.out.println(lhs);
		list.clear();
		list.addAll(lhs);
		System.out.println(list);

	}
}
