package edu.neu.csye6200.agency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class VehicleRegistry {

	private List<Vehicle> list = Collections.synchronizedList(new ArrayList<Vehicle>());
	private Map<String, Vehicle> map = Collections.synchronizedMap(new HashMap<String, Vehicle>());

	// converting VehicleRegistry to singleton pattern
	public static VehicleRegistry vr;

	private VehicleRegistry() {

	}

	public static VehicleRegistry getInstance() {
		if (vr == null)
			vr = new VehicleRegistry();
		return vr;
	}

	Vehicle v1 = new Vehicle("Volvo", "S80", 2008, 10, "VBG980");
	Vehicle v2 = new Vehicle("BMW", "M8", 2019, 12, "VBG981");
	Vehicle v3 = new Vehicle("Ferrari", "Roma", 2020, 15, "VBG982");
	Vehicle v4 = new Vehicle("Toyota", "Fartunar", 2015, 10, "VBG983");
	Vehicle v5 = new Vehicle("Toyota", "Innova", 2012, 12, "VBG984");
	Vehicle v6 = new Vehicle("Scoda", "Rapid TSI", 2016, 15, "VBG989");
	Vehicle v7 = new Vehicle("Volvo", "S90", 2008, 10, "VBG988");
	Vehicle v8 = new Vehicle("BMW", "M6", 2019, 12, "VBG987");
	Vehicle v9 = new Vehicle("Hyundai", "Creta", 2020, 15, "VBG986");
	Vehicle v10 = new Vehicle("Hyundai", "Verna", 2008, 10, "VBG985");

	public List<Vehicle> addList() {
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		list.add(v6);
		list.add(v7);
		list.add(v8);
		list.add(v9);
		list.add(v10);
		return list;
	}
	
	public void getObjects() {
		for (Object v : list) {
			System.out.println(v);
		}
	}

	public void getList() {
		System.out.println("get object " + list.get(1));
	}

	public void removeList() {
		System.out.println("removed object" + list.remove(2));
	}

	public void setMaps() {
		map.put("VBG980", v1);
		map.put("VBG981", v2);
		map.put("VBG982", v3);
		map.put("VBG983", v4);
		map.put("VBG984", v5);
		map.put("VBG989", v6);
		map.put("VBG988", v7);
		map.put("VBG987", v8);
		map.put("VBG986", v9);
		map.put("VBG985",v10);
		
	}

	public Object getMaps(String licence) {

		Object v1 = map.get(licence);

		return v1;
	}

	

}
