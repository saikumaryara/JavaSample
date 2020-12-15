package com.nt.comps;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankTransaction {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Bank acc1 = new Bank();
		acc1.setAccNo(1);
		acc1.setAccHName("sai");
		acc1.setUsername("saikumaryara");
		acc1.setPasswaord("$@!kumar");
		acc1.setBalance(9999);
		// printing bank object state
		System.out.println(acc1);

		// creating ObjectOutputStream object
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/BankInfo.ser"));

		// writing bank object state to file
		oos.writeObject(acc1);
		System.out.println("Object data writen to file");
		
	}

}
