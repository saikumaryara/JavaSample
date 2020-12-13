package com.nit.hk.suncollections;

import java.util.IdentityHashMap;

public class Test17_IdentityHashMap {

	public static void main(String[] args) {

		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<Object, Object>();
		// IdentityHashMap doesnot sto dupliactes even though we are overried hc() in A
		// class
		// becuase it used hc() and equals() it uses System.IdentityHashcode() and ==
		// only
		System.out.println(ihm);
		System.out.println();

		ihm.put(new A(5, 6), 1); // System.IdentityHashcode() is using internally
		ihm.put(new A(5, 6), 2); // so it key obj reference wise it stored

		A a3 = new A(1, 2);
		ihm.put(a3, 3);
		ihm.put(a3, 3); // here replced becouse of same reference of a3 obj

		ihm.put("a", 1);
		ihm.put("a", 2); // here also replcaed because of same obj String pooling
		ihm.put(new String("a"), 3);// it stored because of new string obj

		System.out.println(ihm);
	}

}
