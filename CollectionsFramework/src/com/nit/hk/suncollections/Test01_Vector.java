package com.nit.hk.suncollections;

import java.util.Vector;

import com.nit.hk.suncollections.Student;;

public class Test01_Vector {
	public static void main(String[] args) {
		Vector<Object> v = new Vector();
		Vector<Student> v2 = new Vector<Student>();
		Student s1=new Student(1,"P");
		Student s2=new Student(1,"P");
		v2.add(s1);
		v2.add(s2);
		
		System.out.println("capacity: " + v.capacity());
		System.out.println("size    : " + v.size());
		System.out.println("eles    : " + v.toString());
		System.out.println();
		v.addElement("a");
		v.addElement("b");
		v.addElement(5);
		v.addElement(6.7);
		v.addElement('p');
		v.addElement(true);
		v.addElement("a");
		v.addElement(5);
		v.addElement(6.7);
		v.addElement(true);
		System.out.println("capacity: " + v.capacity());
		System.out.println("size    : " + v.size());
		System.out.println("eles    : " + v.toString());
		System.out.println();
		v.addElement(11);
		v.addElement(null);
		v.add(null);
		v.add(new A(5, 6));
		System.out.println("capacity: " + v.capacity());
		System.out.println("size    : " + v.size());
		System.out.println("eles    : " + v.toString());
		System.out.println();
		System.out.println(v.contains("a"));
		System.out.println(v.indexOf("a"));
		System.out.println();
		System.out.println(v.elementAt(3));
		v.removeElementAt(5);
		System.out.println(v.removeElement(5));
		System.out.println(v.removeElement("a"));
		System.out.println();
		System.out.println("capacity: " + v.capacity());
		System.out.println("size    : " + v.size());
		System.out.println("eles    : " + v.toString());
		System.out.println();
		v.insertElementAt("c", 3);
		System.out.println("capacity: " + v.capacity());
		System.out.println("size    : " + v.size());
		System.out.println("eles    : " + v.toString());
		System.out.println();
		v.setElementAt("Q", 7);
		System.out.println("capacity: " + v.capacity());
		System.out.println("size    : " + v.size());
		System.out.println("eles    : " + v.toString());
		System.out.println();

		


	}
}