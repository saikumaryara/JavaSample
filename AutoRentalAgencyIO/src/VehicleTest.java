import java.lang.reflect.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class VehicleTest {
	private ArrayList<Vehicle> list;

	public void run() throws ClassNotFoundException,FileNotFoundException,
	                          IOException{

		Vehicle v1 = new Vehicle("Volvo", "S80", 2008, 10, "VBG984");
		Vehicle v2 = new Vehicle("BMW", "M8", 2019, 12, "VBG985");
		Vehicle v3 = new Vehicle("Ferrari", "Roma", 2020, 15, "VBG986");

		VehicleRegistry vr = new VehicleRegistry();

		vr.addList();
		System.out.println();
		vr.getObjects();
		System.out.println("--------objects are added---------");
		vr.getList();
		vr.removeList();
		vr.setMaps();
		System.out.println("based on licence plate::" + vr.getMaps("VBG984"));

		System.out.println();

		TruckVehicle Tv1 = new TruckVehicle("Volvo", "S80", 2008, 10, "VBG984");
		TruckVehicle Tv2 = new TruckVehicle("BMW", "M8", 2019, 12, "VBG985");
		TruckVehicle Tv3 = new TruckVehicle("Ferrari", "Roma", 2020, 15, "VBG986");

		System.out.println("Brand \t\tModel \t\tModelYear \tRange \tlicence height \twidth \tlength \t area");
		System.out.println("-------\t\t-------\t\t---------\t------\t------\t-------\t------\t------\t------");

		Tv1.display();
		Tv2.display();
		Tv3.display();

		list = new ArrayList<Vehicle>();

		list.add(v1);
		list.add(v2);
		list.add(v3);

		RentalAgencyIO io = new RentalAgencyIO();

		String file_path = "src/file1.txt";
		
		Class c=RentalAgencyIO.class;  
	    Object obj;
		try {
			obj = c.newInstance();
			Method m=c.getDeclaredMethod("save",new Class[]{Vehicle.class,String.class}); 
			//"save",new Class[]{Vehicle.class},new Class[] {String.class}
		     m.setAccessible(true);  
		     m.invoke(obj,v1,file_path);  
		
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}  
	    
		io.save(list, file_path);

		System.out.println();
		System.out.println("data saved to file to file1.txt");
		System.out.println();
		System.out.println("Data retrieved from file");

		io.load(list, file_path);

	}

	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException{
		VehicleTest v = new VehicleTest();
		v.run();
	}

}
