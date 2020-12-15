package com.nt.comps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BankUser {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		//create ObjectInputStream object
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/BankInfo.ser"));
		//casting returened object to bank type
		Bank accDetails=(Bank)ois.readObject();
		//printing object data
		System.out.println(accDetails.getAccHName()+" details");
		System.out.println(accDetails);
	}

}
