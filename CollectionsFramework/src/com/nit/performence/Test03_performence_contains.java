package com.nit.performence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test03_performence_contains {

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
       //searching 1st element arraylist is fast
		time1 = System.nanoTime();

		v.contains(Integer.valueOf(1));

		time2 = System.nanoTime();

		time2 = System.nanoTime();
		System.out.println("v searching time ::" + (time2 - time1));

		time1 = System.nanoTime();

		al.contains(Integer.valueOf(1));

		time2 = System.nanoTime();
		System.out.println("al searching time ::" + (time2 - time1));

		time1 = System.nanoTime();

		ll.contains(Integer.valueOf(1));

		time2 = System.nanoTime();
		System.out.println("ll searching time ::" + (time2 - time1));
           
		System.out.println();
		
		//searching last element linkedlist is fast
				time1 = System.nanoTime();

				v.contains(Integer.valueOf(499999));

				time2 = System.nanoTime();

				time2 = System.nanoTime();
				System.out.println("v searching time ::" + (time2 - time1));

				time1 = System.nanoTime();

				al.contains(Integer.valueOf(499999));

				time2 = System.nanoTime();
				System.out.println("al searching time ::" + (time2 - time1));

				time1 = System.nanoTime();

				ll.contains(Integer.valueOf(499999));

				time2 = System.nanoTime();
				System.out.println("ll searching time ::" + (time2 - time1));
				
				System.out.println();
				//searching middle element arraylist is fast
				time1 = System.nanoTime();

				v.contains(Integer.valueOf(250000));

				time2 = System.nanoTime();

				time2 = System.nanoTime();
				System.out.println("v searching time ::" + (time2 - time1));

				time1 = System.nanoTime();

				al.contains(Integer.valueOf(250000));

				time2 = System.nanoTime();
				System.out.println("al searching time ::" + (time2 - time1));

				time1 = System.nanoTime();

				ll.contains(Integer.valueOf(250000));

				time2 = System.nanoTime();
				System.out.println("ll searching time ::" + (time2 - time1));
				
					}

}
