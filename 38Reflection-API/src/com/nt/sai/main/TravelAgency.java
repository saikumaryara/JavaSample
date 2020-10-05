package com.nt.sai.main;
import com.nt.sai.user.Driver;
import java.util.Scanner;

import com.nt.sai.spec.Vehicle;

class TravelAgency {
	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Vehicle name::");
		String clsName = sc.next();
		Class<?> cls = Class.forName(clsName);
		System.out.println(cls+" is loaded");
		Object obj = cls.newInstance();
		System.out.println(cls+" object is created");

		Driver sai = new Driver();
		if (obj instanceof Vehicle)
			sai.drive((Vehicle) obj);
		else
			System.err.println("the given" + clsName + "Name is Not Found");
	}
}