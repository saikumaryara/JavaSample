package com.nit.hk.suncollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test14_HashMap {

	public static void main(String[] args) {

		HashMap<Object, Object> hm = new HashMap<Object, Object>();
//#1 counting
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
//#2 printing
		System.out.println(hm);
		System.out.println();
//#3 adding
		System.out.println(hm.put("a", 1));
		System.out.println(hm.put(6, 2));
		System.out.println(hm.put("c", 3));
		System.out.println(hm.put(5, 4));
		System.out.println(hm.put("b", 5));
		System.out.println(hm.put(true, 5));
		System.out.println(hm.put(null, 7));
		System.out.println(hm.put(new A(5, 6), 8));
		System.out.println(hm.put(new A(7, 8), 9));
		System.out.println(hm.put(new A(10, 20), 10));

		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();

		System.out.println(hm.put("a", 01));
		System.out.println(hm.put(5, 02));
		System.out.println(hm.put(new A(5, 6), "03"));
		A a5 = new A(1, 2);
		System.out.println(hm.put(a5, "04"));
		System.out.println(hm.put(a5, "05"));
		System.out.println(hm.put("z", new A(3, 5)));
		System.out.println();
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();

//For Adding diff b/w put() and putIfAbsent()
		System.out.println(hm.put(null, "06"));
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();

		System.out.println(hm.putIfAbsent(null, "07"));

		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();

		System.out.println(hm.putIfAbsent("X", "08"));
		System.out.println(hm.putIfAbsent("Y", "null"));
		System.out.println(hm.size());
		System.out.println(hm);
		System.out.println();

//#4 retrieving one value  randomly for the given key
		Object obj1 = hm.get("a");
		Object obj2 = hm.get(true);
		Object obj3 = hm.get("A");
		Object obj4 = hm.get("X");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println();
//For retrieving ->diff b/w get() and getOrDefault()
		Object obj5 = hm.get("hari");
		Object obj6 = hm.getOrDefault("hari", "key is not available");
		Object obj7 = hm.getOrDefault("b", "key is not available");

		System.out.println(obj5);
		System.out.println(obj6);
		System.out.println(obj7);
		System.out.println();
//#5 retrieving all keys from this map
		Set<Object> keys = hm.keySet();
		for (Object key : keys) {
			System.out.println(key);
		}
		System.out.println();

//#6 retrieving all values from this map
		Collection<Object> values = hm.values();
		for (Object value : values) {
			System.out.println(value);
		}
		System.out.println();
//# retrieving all keys and values from this map
		Set<Map.Entry<Object, Object>> entries = hm.entrySet();
		for (Map.Entry<Object, Object> entry : entries) {
			// System.out.println(entries); allowed and display [key=value]
			Object key = entry.getKey();
			Object value = entry.getValue();
			if ((key != null) && (key.equals("a"))) {
				entry.setValue("OOOA");
			}
			System.out.println(key + ":" + value);
		}
		System.out.println();

		// entries.forEach(System.out::println);

//#8 retrieving all keys and values from this map by using keySet() and get()
		Set<Object> keys2 = hm.keySet();

		for (Object key : keys2) {
			Object value = hm.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println();
//#9 retreiving own class object keys values
		Object obj9 = hm.get(new A(5, 6));
		Object obj10 = hm.get(a5);

		System.out.println(obj9);
		System.out.println(obj10);
		System.out.println();
		// #10 searchin for the key //hashcode(),==,equals()
		System.out.println(hm.containsKey("a"));
		System.out.println(hm.containsKey(null));
		System.out.println(hm.containsKey("A"));
		System.out.println(hm.containsKey(true));
		System.out.println(hm.containsKey(new A(5, 6)));
		System.out.println(hm.containsKey(a5));

		System.out.println();
		// searching for value

		System.out.println(hm.containsValue("a"));
		System.out.println(hm.containsValue("000A"));
		System.out.println(hm.containsValue(new A(3, 5)));
		System.out.println();

		// #12 remmoving //hc(),==,equals()
		System.out.println(hm);
		System.out.println(hm.remove("a"));
		System.out.println(hm.remove(new A(5, 6)));
		System.out.println(hm.remove(a5));
		System.out.println(hm);
		// diff b/w reove(k) and remove(k,v)
		System.out.println(hm.remove(5));
		System.out.println(hm.remove(true, 7));
		System.out.println(hm);
		System.out.println();
		// #13 replacing given keys value(we can't relace keys)
		System.out.println(hm.put(true, 7)); // 1.2 put if fund replace if not found
		System.out.println(hm.put(false, 8));
		System.out.println(hm.replace(6, "PK"));// 1.8 only replace if found else return null
		System.out.println(hm.replace(7, "RK"));
		System.out.println(hm);
		System.out.println();
		// diff b/w replce(k,v) and replce(k,v,v)
		System.out.println(hm.replace(7, "RK"));
		System.out.println(hm.replace(7, "RK", "BK"));
		System.out.println(hm);
		System.out.println();
	}

}
