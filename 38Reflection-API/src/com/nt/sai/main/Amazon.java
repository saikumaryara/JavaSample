package com.nt.sai.main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.nt.sai.spec.Product;
import com.nt.sai.user.Customer;

public class Amazon {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Product name::");
		String clsName = sc.next();//com.nt.sai.impli.Samsung or com.nt.sai.impli.Hp
		Class<?> cls = Class.forName(clsName);
		System.out.println(cls + " is loaded");
		Object obj =(Product) cls.newInstance();
		System.out.println(cls + " object is created");
        System.out.println();
          Constructor<?>[] ct = cls.getConstructors();
          for(int i=0; i< ct.length; i++)
          { System.out.println(ct[i]); }
          Constructor<?>[]cdt = cls.getDeclaredConstructors();
          for(int i=0;i< cdt.length;i++)
          { System.out.println(cdt[i]);}
        Field ff[] = cls.getFields();
          for(int i=0; i< ff.length; i++)
          { System.out.println(ff[i]); }
          Field f[] = cls.getDeclaredFields();
          for(int i=0;i< f.length; i++)
          { System.out.println(f[i]);  }
        
        System.out.println();
         Method md[] = cls.getDeclaredMethods();
          for(int i=0; i< md.length; i++ )
          { System.out.println(md[i]); }
 
		Customer sai = new Customer();
		if (obj instanceof Product)
			sai.Buy((Product) obj);
		else
			System.err.println("the given" + clsName + "Name is Not Found");
	}
}
