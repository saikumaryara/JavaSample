package com.nit.hk.suncollections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Properties p = new Properties();
		p.load(new FileInputStream("src/com/nit/hk/suncollections/Employee.properties"));
		System.out.println("Id:" + p.getProperty("eid"));
		System.out.println("Name:" + p.getProperty("ename"));
		System.out.println("Desig:" + p.getProperty("desig"));
		System.out.println("Company:" + p.getProperty("company"));
		System.out.println("abc:" + p.getProperty("abc"));
		System.out.println("abc:" + p.getProperty("abc", "abc key not found"));
		p.setProperty("exp", "2020");
		Enumeration e = p.propertyNames();
		while (e.hasMoreElements()) {
			System.out.println(p.getProperty((String) e.nextElement()));
		}
		
		p.list(new PrintStream(new FileOutputStream("ListResult.properties")));
		p.store(new PrintStream(new FileOutputStream("StoreResult.properties")),"Employee Details");
		
	}

}
