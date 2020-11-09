package com.nit.hk.suncollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test05_LinkedHashSet {

	public static void main(String[] args) {

     LinkedHashSet<Object> lhs=new LinkedHashSet<>();
		
		System.out.println(lhs.size());
		System.out.println(lhs);
	    System.out.println();
	    
	    lhs.add("a");
	    lhs.add(6);
	    lhs.add("c");
	    lhs.add(5);
	    lhs.add("b");
	    lhs.add(true);
	    lhs.add(null);
	    lhs.add(new A(5,6));
	    lhs.add(new A(7,8));
	    
	    lhs.add(new A(5,6));//not stored bocoz state  wise same reference hanshcode
	    //Here hashcode() override in A class.
	    lhs.add(new A(10,20));
	    lhs.add("a");
	    lhs.add(5);
	    lhs.add(true);
	    lhs.add(null);
        lhs.add(new A(5,6));
        A a5=new A(1,6);
        lhs.add(a5);
        lhs.add(a5);//not stored bcoz same hashcode reference data wise and reference wise
        System.out.println(lhs.size());
		System.out.println(lhs);//It maintans Insertion order 
		
		System.out.println();
		
		System.out.println("Retieving Elements");
		Iterator<Object> itr=lhs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	    
	}

}
