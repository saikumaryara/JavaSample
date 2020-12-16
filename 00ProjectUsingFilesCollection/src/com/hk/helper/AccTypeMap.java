package com.hk.helper;

import java.util.HashMap;

public class AccTypeMap {

	private static HashMap<String, Integer> accTypeMap;

	static {

		accTypeMap = new HashMap<String, Integer>();

		accTypeMap.put("SAVINGS", 1);
		accTypeMap.put("CURRENT", 2);
		accTypeMap.put("NRI", 3);

	}

	public static int getAccTypeID(String accType) {

		return accTypeMap.get(accType.toUpperCase());

	}
}
