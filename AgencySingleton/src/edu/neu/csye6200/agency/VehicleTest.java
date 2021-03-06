package edu.neu.csye6200.agency;

import java.lang.reflect.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class VehicleTest {
	

	public void run() throws ClassNotFoundException, FileNotFoundException, IOException {
		
	
		// calling vehicleReistry class instance
		VehicleRegistry vr = VehicleRegistry.getInstance();

		// here i am adding 10 instances in VehicelRegistry class
		List list1 = vr.addList();


		// Before sorting call getObjects() method see output based on licence is not in
		// ordered

		System.out.println("Before Sorting objects \n");
		
		vr.getObjects();
		
		System.out.println("\n--------objects are added---------" + list1.size()+"\n");
		
		// after sorting 
		
		System.out.println("after sorting objects based on licence plate using quicksort \n");

		//see licence ascending order is came

		List list2 = vr.quickSort(list1);
		
		for (Object l : list2) {
			System.out.println(l+"\n");
		}

		System.out.println();
		
		vr.removeList();
		

		RentalAgencyIO io = new RentalAgencyIO();

		String file_path = "src/file1.txt";
		Class c = RentalAgencyIO.class;

		Object obj;
		try {
			obj = c.newInstance();
			Method m = c.getDeclaredMethod("save", new Class[] { Vehicle.class, String.class });
			// "save",new Class[]{Vehicle.class},new Class[] {String.class}
			m.setAccessible(true);
			m.invoke(obj,(Vehicle) list2.get(1), file_path);//for sinlge instance is added

		} catch (Exception e) {
			e.printStackTrace();
		} 
		io.save(list2, file_path);

		System.out.println();
		System.out.println("data saved to file to file1.txt");
		System.out.println();
		System.out.println("Data retrieved from file");

		io.load(list2, file_path);

	}

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException {
		VehicleTest v = new VehicleTest();
		v.run();
	}

}
