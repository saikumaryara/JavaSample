package com.nit.performence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test05_synchronizedList {

	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		
	 // making arraylist has synchronized
		
		System.out.println(list);
		List<Object> syncList = Collections.synchronizedList(list);
		System.out.println();
		System.out.println(syncList);
		syncList.add("d");
		syncList.add("e");
		System.out.println(syncList);
		System.out.println(list);

	}

}
