package edu.neu.csye6200.agency;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class RentalAgencyIO {

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

	private void save(Vehicle v, String in) {

		try {

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(in));
			oos.writeObject(v);
			logger.info("called first save() method");

		} catch (IOException o) {
			logger.severe("problem in saving  first save() method");
			o.printStackTrace();
		}
	}
	public void save(List<Vehicle> list, String in) throws ClassNotFoundException {

		try {

			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(in));

			oos.writeObject(list);
			logger.info("called second save() method");

		} catch (IOException o) {

			logger.severe("problem in saving save() method");
			o.printStackTrace();
		}
	}


	public void load(List<Vehicle> list2, String in)
			throws FileNotFoundException, IOException, ClassNotFoundException {

		try {

			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(in));
			ArrayList<Vehicle> vh = (ArrayList<Vehicle>) ois.readObject();

			logger.info("called load() method");
			System.out.println();

		} catch (IOException e) {

			logger.severe("problem in load() method");

		}
	}

}
