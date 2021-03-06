package edu.neu.csye6200.agency;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class RentalAgencyIO {

	private void save(Vehicle v, String in) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(in));
			oos.writeObject(v);

		} catch (IOException o) {
			o.printStackTrace();
		}
	}
	public void save(ArrayList<Vehicle> list, String in) throws ClassNotFoundException {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(in));
			oos.writeObject(list);

		} catch (IOException o) {
			o.printStackTrace();
		}
	}

	public void load(ArrayList<Vehicle> list, String in) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(in));
		ArrayList<Vehicle> vh = (ArrayList<Vehicle>) ois.readObject();
		System.out.println(vh);
		System.out.println();
	}

}
