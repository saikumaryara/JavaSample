package edu.neu.csye6200.agency;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

class VehicleRegistry {

	private List<Vehicle> list = Collections.synchronizedList(new ArrayList<Vehicle>());
	private Map<String, Vehicle> map = Collections.synchronizedMap(new HashMap<String, Vehicle>());
	
	// For logging information logging api
		static Logger logger = Logger.getLogger("MyLogger");
		static FileHandler fh;

		static {
			try {
				fh = new FileHandler("MyLogFile.log", true);
				SimpleFormatter formatter = new SimpleFormatter();
				logger.addHandler(fh);
				fh.setFormatter(formatter);
			} catch (IOException e) {
				logger.severe("problem");
				e.printStackTrace();
			} catch (Exception e) {
				logger.severe("problem");
				e.printStackTrace();
			}

		}
// converting VehicleRegistry to singleton pattern
	
	public static VehicleRegistry vr;

	private VehicleRegistry() {

	}

	public static VehicleRegistry getInstance() {
		if (vr == null)
			vr = new VehicleRegistry();
		return vr;
	}
	
	public List<Vehicle> addList() {
		list.add(new Vehicle("Volvo", "S80", 2008, 10, "VBG980"));
		list.add(new Vehicle("BMW", "M8", 2019, 12, "VBG981"));
		list.add(new Vehicle("Ferrari", "Roma", 2020, 15, "VBG982"));
		list.add(new Vehicle("Toyota", "Fartunar", 2015, 10, "VBG983"));
		list.add(new Vehicle("Toyota", "Innova", 2012, 12, "VBG984"));
		list.add(new Vehicle("Scoda", "Rapid TSI", 2016, 15, "VBG989"));
		list.add(new Vehicle("Volvo", "S90", 2008, 10, "VBG988"));
		list.add(new Vehicle("BMW", "M6", 2019, 12, "VBG987"));
		list.add(new Vehicle("Hyundai", "Creta", 2020, 15, "VBG986"));
		list.add(new Vehicle("Hyundai", "Verna", 2008, 10, "VBG985"));
		
		logger.info("called addList() method");
		
		//here i am maintaing 10 intances in a list and return  to calling method.
		return list;
	}

	protected List<Vehicle> quickSort(List list1) {
		
		if (list1.size() <= 1)
			return list1; // if list having 1 instance 

		List<Vehicle> sorted = new ArrayList<Vehicle>();
		List<Vehicle> lesser = new ArrayList<Vehicle>();
		List<Vehicle> greater = new ArrayList<Vehicle>();

		Vehicle pivot = (Vehicle) list1.get(list1.size() - 1); // Use last Vehicle as pivot

		for (int i = 0; i < list1.size() - 1; i++) {

			if (((Vehicle) list1.get(i)).compareTo(pivot) < 0)
				lesser.add((Vehicle) list1.get(i));
			else
				greater.add((Vehicle) list1.get(i));
		}

		lesser = quickSort(lesser);
		greater = quickSort(greater);
		lesser.add(pivot);
		lesser.addAll(greater);
		sorted = lesser;

		return sorted;
	}

	public void getObjects() {
		for (Object v : list) {
			System.out.println(v+"\n");
		}
	}

	public void getList() {
       System.out.println("get object "+list.get(1));		
	}
	
	public void setMaps() {
		map.put("VBG980",list.get(0));
		map.put("VBG981",list.get(1));
		map.put("VBG982",list.get(2));
		map.put("VBG983",list.get(3));
		map.put("VBG984",list.get(4));
		map.put("VBG989",list.get(5));
		map.put("VBG988",list.get(6));
		map.put("VBG987",list.get(7));
		map.put("VBG986",list.get(8));
		map.put("VBG985",list.get(9));

	}
	public void removeList() {
		System.out.println("removed object" + list.remove(2));
		logger.info("called removeList() method");
		
	}

	public Object getMaps(String licence) {

		Object v1 = map.get(licence);

		return v1;
	}


}
