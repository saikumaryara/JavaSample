package com.nit.hk.suncollections;

import java.util.Comparator;

public class Snocomparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		//Because of enerics o casting is required Emp e1=(Emp)o1; Emp e2=(Emp)o2;
		//return o1.copareTo(o2); for ascending
		return o2.compareTo(o1);
	}

}
