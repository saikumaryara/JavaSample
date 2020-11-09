package com.nit.performence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test02_performence_retrieving {

	public static void main(String[] args) {

		Vector<Object> v = new Vector<>();
		ArrayList<Object> al = new ArrayList<>();
		LinkedList<Object> ll = new LinkedList<>();
		long time1, time2;
		time1 = System.nanoTime();
		for (int i = 0; i < 500000; i++) {
			v.add(Integer.valueOf(i));
			al.add(Integer.valueOf(i));
			ll.add(Integer.valueOf(i));

		}
       //retrieving 1st element arraylist is fast
		time1 = System.nanoTime();

		v.get(Integer.valueOf(1));

		time2 = System.nanoTime();

		time2 = System.nanoTime();
		System.out.println("v retrieving time ::" + (time2 - time1));

		time1 = System.nanoTime();

		al.get(Integer.valueOf(1));

		time2 = System.nanoTime();
		System.out.println("al retrieving time ::" + (time2 - time1));

		time1 = System.nanoTime();

		ll.get(Integer.valueOf(1));

		time2 = System.nanoTime();
		System.out.println("ll retrieving time ::" + (time2 - time1));
           
		System.out.println();
		
		//retrieving last element arraylist is fast
				time1 = System.nanoTime();

				v.get(Integer.valueOf(499999));

				time2 = System.nanoTime();

				time2 = System.nanoTime();
				System.out.println("v retrieving time ::" + (time2 - time1));

				time1 = System.nanoTime();

				al.get(Integer.valueOf(499999));

				time2 = System.nanoTime();
				System.out.println("al retrieving time ::" + (time2 - time1));

				time1 = System.nanoTime();

				ll.get(Integer.valueOf(499999));

				time2 = System.nanoTime();
				System.out.println("ll retrieving time ::" + (time2 - time1));
				
				System.out.println();
				//retrieving middle element Vector is fast
				time1 = System.nanoTime();

				v.get(Integer.valueOf(250000));

				time2 = System.nanoTime();

				time2 = System.nanoTime();
				System.out.println("v retrieving time ::" + (time2 - time1));

				time1 = System.nanoTime();

				al.get(Integer.valueOf(250000));

				time2 = System.nanoTime();
				System.out.println("al retrieving time ::" + (time2 - time1));

				time1 = System.nanoTime();

				ll.get(Integer.valueOf(250000));

				time2 = System.nanoTime();
				System.out.println("ll retrieving time ::" + (time2 - time1));
				
				//for all retrieving arrayList is fast
				time1=System.nanoTime();
				for(int i=0;i<500000;i++) {
					v.get(Integer.valueOf(i));
				}
				time2=System.nanoTime();
				System.out.println("v retrieving time ::"+(time2-time1));
				
				time1=System.nanoTime();
				for(int i=0;i<500000;i++) {
					al.get(Integer.valueOf(i));
				}
				time2=System.nanoTime();
				System.out.println("al retrieving time ::"+(time2-time1));

				System.out.println();
				System.out.println();
				time1=System.nanoTime();
				for(int i=0;i<500000;i++) {
					ll.get(Integer.valueOf(i));
				}
				time2=System.nanoTime();
				System.out.println("ll retrieving time ::"+(time2-time1));
				
				

	}

}
