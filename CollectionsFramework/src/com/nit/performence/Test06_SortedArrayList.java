package com.nit.performence;

import java.util.ArrayList;
import java.util.List;

public class Test06_SortedArrayList {
	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("b");
		System.out.println(list);
		list.sort(null);// java 8v
		System.out.println(list);
	}
}
