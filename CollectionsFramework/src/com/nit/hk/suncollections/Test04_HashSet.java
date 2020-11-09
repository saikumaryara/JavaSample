package com.nit.hk.suncollections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class Test04_HashSet {

	public static void main(String[] args) {

		HashSet<Object> hs=new HashSet<>();
		
		System.out.println(hs.size());
		System.out.println(hs);
	    System.out.println();
	    
	    hs.add("a");
	    hs.add(6);
	    hs.add("c");
	    hs.add(5);
	    hs.add("b");
	    hs.add(true);
	    hs.add(null);
	    hs.add(new A(5,6));
	    hs.add(new A(7,8));
	    
	    hs.add(new A(5,6));//not stored bocoz state  wise same reference hanshcode
	    //Here hashcode() override in A class.
	    hs.add(new A(10,20));
	    hs.add("a");
	    hs.add(5);
	    hs.add(true);
	    hs.add(null);
        hs.add(new A(5,6));
        A a5=new A(1,6);
        hs.add(a5);
        hs.add(a5);//not stored bcoz same hashcode reference data wise and reference wise
        System.out.println(hs.size());
		System.out.println(hs); //It doesnot maintain insertion order
		
		System.out.println("Retrieve Elements");
		
		Enumeration<Object> e=Collections.enumeration(hs);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());	
		}
		
	    
	}

}
