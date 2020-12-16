package com.hk.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;

import com.hk.beans.BankAccount;

public class Test_Writing_Object_Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		BankAccount acc1 = new BankAccount();
		//System.out.println(acc1);

		acc1.setAccNo(1234);
		acc1.setAccHName("sai");
		acc1.setBalance(10000);
		acc1.setUseraname("sky");
		acc1.setPassword("$@!");
		acc1.setAccType("Savings");

		System.out.println(acc1);

		BankAccount acc2 = new BankAccount();
		//System.out.println(acc2);

		acc2.setAccNo(1234);
		acc2.setAccHName("sam");
		acc2.setBalance(20000);
		acc2.setUseraname("sai");
		acc2.setPassword("$@!");
		acc2.setAccType("current");

		System.out.println(acc2);
		
		BankAccount acc3 = new BankAccount();
		//System.out.println(acc3);

		acc3.setAccNo(12345);
		acc3.setAccHName("sunny");
		acc3.setBalance(20000);
		acc3.setUseraname("sai");
		acc3.setPassword("$@!");
		acc3.setAccType("current");

		System.out.println(acc3);
		

		HashSet hs=new HashSet<BankAccount>();
		hs.add(acc1);
		hs.add(acc2);
		hs.add(acc3);

		// seriaization start
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/accountinfo.ser"));
		// writing object data to file
		oos.writeObject(hs);
		System.out.println("acc object state is saved in file successfully");

	}

}
