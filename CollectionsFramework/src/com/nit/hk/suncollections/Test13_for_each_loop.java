package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Test13_for_each_loop {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add(5);
		lhs.add("b");
		lhs.add(6);
		lhs.add("c");
		lhs.add(7);
		System.out.println(lhs);
		System.out.println();
		for (Object obj : lhs) {
			if (obj instanceof String) {
				System.out.println(((String) obj).toUpperCase());
			} else {
				System.out.println(obj);
			}
		}
		ArrayList<String> al = new ArrayList<String>();
		al.add("hk");
		al.add("bk");
		al.add("pk");
		System.out.println(al);

		for (String s : al) {
			System.out.println(s.toUpperCase());
		}
		// Rule1 : Object must be an array or Iterable type
		// for(char ch:"abc") {}
		char[] ca = new char[] { 'a', 'b', 'c' };

		ArrayList<String> al2 = new ArrayList<String>();
		Iterator<String> itr = al2.iterator();

		// All collection sub tyes are allowed
		// Iterator is not allowed
		// Map is not allowed

		for (String s : al2) {
		}
		// for(String s:itr) {}
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		// for(String : lhm) {}
		// Rule2: variable type must be same type or higher type then the returning
		// values or object type
		// for(byte b:ca) {}
		for (int i : ca) {
		}
		// Rule3:varaible must be declared in for() paranthesis
		int i1;
		// for(i1:ca) {}

//Rule4: the seaprator must be : colon
		for (String s : al) {
		} // copying al elements
		// for(String s=al) {}//coying al reference ,so not allowed/
	}
}
