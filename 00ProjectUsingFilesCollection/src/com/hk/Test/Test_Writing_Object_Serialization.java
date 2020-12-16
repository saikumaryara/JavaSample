package com.hk.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.hk.beans.BankAccount;

public class Test_Writing_Object_Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		BankAccount acc1 = new BankAccount();
		System.out.println(acc1);

		acc1.setAccNo(1234);
		acc1.setAccHName("sai");
		acc1.setBalance(10000);
		acc1.setUseraname("sky");
		acc1.setPassword("$@!");
		acc1.setAccType("Savings");

		System.out.println(acc1);

		BankAccount acc2 = new BankAccount();
		System.out.println(acc2);

		acc2.setAccNo(5678);
		acc2.setAccHName("sam");
		acc2.setBalance(20000);
		acc2.setUseraname("sai");
		acc2.setPassword("$@!");
		acc2.setAccType("current");

		System.out.println(acc2);
		

		ArrayList list=new ArrayList<BankAccount>();
		list.add(acc1);
		list.add(acc2);

		// seriaization start
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/accountinfo.ser"));
		// writing object data to file
		oos.writeObject(list);
		System.out.println("acc object state is saved in file successfully");

	}

}
