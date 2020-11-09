package com.nit.hk.suncollections;

import java.util.Comparator;

public class IntegerComparator<T> implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return i2.compareTo(i1);
	}

}
