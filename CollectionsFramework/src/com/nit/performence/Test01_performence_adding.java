package com.nit.performence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test01_performence_adding{

	public static void main(String[] args) {

		Vector<Object> v=new Vector<>();
		ArrayList<Object> al=new ArrayList<>();
		LinkedList<Object> ll=new LinkedList<>();
		long time1,time2;
		//for adding arrayList is fast
		time1=System.nanoTime();
		for(int i=0;i<500000;i++) {
			v.add(Integer.valueOf(i));
		}
		time2=System.nanoTime();
		System.out.println("v adding time ::"+(time2-time1));
		
		time1=System.nanoTime();
		for(int i=0;i<500000;i++) {
			al.add(Integer.valueOf(i));
		}
		time2=System.nanoTime();
		System.out.println("al adding time ::"+(time2-time1));

		
		time1=System.nanoTime();
		for(int i=0;i<500000;i++) {
			ll.add(Integer.valueOf(i));
		}
		time2=System.nanoTime();
		System.out.println("ll adding time ::"+(time2-time1));
		
	}

}
