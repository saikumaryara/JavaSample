package com.nit.hk.suncollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Test07_Enumeration {

	public static void main(String[] args) {
		Vector<Object> v = new Vector();
		System.out.println();
		v.addElement("a");
		v.addElement("b");
		v.addElement(5);
		v.addElement(6.7);
		v.addElement('p');
		v.addElement(true);
		// retrieving objects from vectotr randomly by using get()
		// System.out.println(v.get(3));
		// String s1=v.get(2); rule1: we can't assign returning object to type varaible
		// String s=(String) v.get(1);
		// String ss=(String) v.get(3); CE:cce
		Object o1 = v.get(1); // we must assign to object type varaible because of generic
		// System.out.println(o1.toUperCase()); rule3:we can't call methods on returned
		// object
		// String s2=(String) o1;
		// System.out.println(s2.toUpperCase());//we must not type cast directly
		// we must check object tye then type cast
		// because colection is heteroegneus
		System.out.println();

		/*
		 * if(o1 instanceof String) { String s=(String) o1;
		 * System.out.println(s.toUpperCase()); }
		 */// old style
//=============================================================================================

		Enumeration<Object> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			System.out.println();
		}

		e = v.elements();
		while (e.hasMoreElements()) {
			Object o3 = e.nextElement();
			if (o3 instanceof String) {
				System.out.println(((String) o3).toUpperCase());
			} else {
				System.out.println();
				System.out.println(o3);
			}
		}
//===============Enumaration on Collection FrameWork============================
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(7);
		al.add(9);
		System.out.println();
		System.out.println(al);

		// Enumeration<Integer> e=al.elements();
		Enumeration<Integer> e2 = Collections.enumeration(al);
		while (e2.hasMoreElements()) {
			int i = e2.nextElement();
			System.out.println(i);
		}

	}

}
