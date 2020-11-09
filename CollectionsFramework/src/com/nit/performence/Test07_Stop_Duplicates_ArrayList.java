package com.nit.performence;

import java.util.ArrayList;
import java.util.List;

public class Test07_Stop_Duplicates_ArrayList {
	static List<Object> list = new ArrayList<>();

	static void addUnique(Object obj) {
		if (!list.contains(obj))
			list.add(obj);
	}

	public static void main(String[] args) {

		addUnique("a");
		addUnique("a");
		addUnique("b");
		addUnique("b");
		addUnique("c");

		System.out.println(list);
	}
}
