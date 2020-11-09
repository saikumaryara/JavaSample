package com.nit.performence;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Test03_performence_removes {

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
       //removing 1st element linkedlist is fast
		time1 = System.nanoTime();

		v.remove(Integer.valueOf(1));

		time2 = System.nanoTime();

		time2 = System.nanoTime();
		System.out.println("v remove time ::" + (time2 - time1));

		time1 = System.nanoTime();

		al.remove(Integer.valueOf(1));

		time2 = System.nanoTime();
		System.out.println("al remove time ::" + (time2 - time1));

		time1 = System.nanoTime();

		ll.remove(Integer.valueOf(1));

		time2 = System.nanoTime();
		System.out.println("ll remove time ::" + (time2 - time1));
           
		System.out.println();
		
		//removing last element linkedlist is fast
				time1 = System.nanoTime();

				v.remove(Integer.valueOf(499999));

				time2 = System.nanoTime();

				time2 = System.nanoTime();
				System.out.println("v remove time ::" + (time2 - time1));

				time1 = System.nanoTime();

				al.remove(Integer.valueOf(499999));

				time2 = System.nanoTime();
				System.out.println("al remove time ::" + (time2 - time1));

				time1 = System.nanoTime();

				ll.remove(Integer.valueOf(499999));

				time2 = System.nanoTime();
				System.out.println("ll remove time ::" + (time2 - time1));
				
				System.out.println();
				//removing middle element arraylist is fast
				time1 = System.nanoTime();

				v.remove(Integer.valueOf(250000));

				time2 = System.nanoTime();

				time2 = System.nanoTime();
				System.out.println("v remove time ::" + (time2 - time1));

				time1 = System.nanoTime();

				al.remove(Integer.valueOf(250000));

				time2 = System.nanoTime();
				System.out.println("al remove time ::" + (time2 - time1));

				time1 = System.nanoTime();

				ll.remove(Integer.valueOf(250000));

				time2 = System.nanoTime();
				System.out.println("ll remove time ::" + (time2 - time1));
				
					}

}
