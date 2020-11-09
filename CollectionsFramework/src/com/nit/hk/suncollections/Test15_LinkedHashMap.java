package com.nit.hk.suncollections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test15_LinkedHashMap {

	public static void main(String[] args) {
//same like HashMap but it maintains insertion order
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<Object, Object>();
//#1 counting
		System.out.println(lhm.isEmpty());
		System.out.println(lhm.size());
//#2 printing
		System.out.println(lhm);
		System.out.println();
//#3 adding
		System.out.println(lhm.put("a", 1));
		System.out.println(lhm.put(6, 2));
		System.out.println(lhm.put("c", 3));
		System.out.println(lhm.put(5, 4));
		System.out.println(lhm.put("b", 5));
		System.out.println(lhm.put(true, 5));
		System.out.println(lhm.put(null, 7));
		System.out.println(lhm.put(new A(5, 6), 8));
		System.out.println(lhm.put(new A(7, 8), 9));
		System.out.println(lhm.put(new A(10, 20), 10));

		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println();

		System.out.println(lhm.put("a", 01));
		System.out.println(lhm.put(5, 02));
		System.out.println(lhm.put(new A(5, 6), "03"));
		A a5 = new A(1, 2);
		System.out.println(lhm.put(a5, "04"));
		System.out.println(lhm.put(a5, "05"));
		System.out.println(lhm.put("z", new A(3, 5)));
		System.out.println();
		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println();

//For Adding diff b/w put() and putIfAbsent()
		System.out.println(lhm.put(null, "06"));
		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println();

		System.out.println(lhm.putIfAbsent(null, "07"));

		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println();

		System.out.println(lhm.putIfAbsent("X", "08"));
		System.out.println(lhm.putIfAbsent("Y", "null"));
		System.out.println(lhm.size());
		System.out.println(lhm);
		System.out.println();

//#4 retrieving one value  randomly for the given key
		Object obj1 = lhm.get("a");
		Object obj2 = lhm.get(true);
		Object obj3 = lhm.get("A");
		Object obj4 = lhm.get("X");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println();
//For retrieving ->diff b/w get() and getOrDefault()
		Object obj5 = lhm.get("hari");
		Object obj6 = lhm.getOrDefault("hari", "key is not available");
		Object obj7 = lhm.getOrDefault("b", "key is not available");

		System.out.println(obj5);
		System.out.println(obj6);
		System.out.println(obj7);
		System.out.println();
//#5 retrieving all keys from this map
		Set<Object> keys = lhm.keySet();
		for (Object key : keys) {
			System.out.println(key);
		}
		System.out.println();

//#6 retrieving all values from this map
		Collection<Object> values = lhm.values();
		for (Object value : values) {
			System.out.println(value);
		}
		System.out.println();
//# retrieving all keys and values from this map
		Set<Map.Entry<Object, Object>> entries = lhm.entrySet();
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
		Set<Object> keys2 = lhm.keySet();

		for (Object key : keys2) {
			Object value = lhm.get(key);
			System.out.println(key + ":" + value);
		}
		System.out.println();
//#9 retreiving own class object keys values
		Object obj9 = lhm.get(new A(5, 6));
		Object obj10 = lhm.get(a5);

		System.out.println(obj9);
		System.out.println(obj10);
		System.out.println();
		// #10 searchin for the key //hashcode(),==,equals()
		System.out.println(lhm.containsKey("a"));
		System.out.println(lhm.containsKey(null));
		System.out.println(lhm.containsKey("A"));
		System.out.println(lhm.containsKey(true));
		System.out.println(lhm.containsKey(new A(5, 6)));
		System.out.println(lhm.containsKey(a5));

		System.out.println();
		// searching for value

		System.out.println(lhm.containsValue("a"));
		System.out.println(lhm.containsValue("000A"));
		System.out.println(lhm.containsValue(new A(3, 5)));
		System.out.println();

		// #12 remmoving //hc(),==,equals()
		System.out.println(lhm);
		System.out.println(lhm.remove("a"));
		System.out.println(lhm.remove(new A(5, 6)));
		System.out.println(lhm.remove(a5));
		System.out.println(lhm);
		// diff b/w reove(k) and remove(k,v)
		System.out.println(lhm.remove(5));
		System.out.println(lhm.remove(true, 7));
		System.out.println(lhm);
		System.out.println();
		// #13 replacing given keys value(we can't relace keys)
		System.out.println(lhm.put(true, 7)); // 1.2 put if fund replace if not found
		System.out.println(lhm.put(false, 8));
		System.out.println(lhm.replace(6, "PK"));// 1.8 only replace if found else return null
		System.out.println(lhm.replace(7, "RK"));
		System.out.println(lhm);
		System.out.println();
		// diff b/w replce(k,v) and replce(k,v,v)
		System.out.println(lhm.replace(7, "RK"));
		System.out.println(lhm.replace(7, "RK", "BK"));
		System.out.println(lhm);
		System.out.println();
	}

}
