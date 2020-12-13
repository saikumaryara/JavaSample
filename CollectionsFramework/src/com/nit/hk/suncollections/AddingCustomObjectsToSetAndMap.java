package com.nit.hk.suncollections;
import java.util.*;

class AddingCustomObjectsToSetAndMap
{
	public static void main(String[] args) 
	{
		Student1 s1 = new Student1(1, 1, "Hari"); 
		Student1 s2 = new Student1(2, 1, "Hari"); 
		Student1 s3 = new Student1(1, 1, "Hair"); 
		Student1 s4 = new Student1(1, 1, "Hiar"); 
		Student1 s5 = new Student1(1, 1, "Hari"); 
		Integer io1 = new Integer(391);		
		Student1 s6 = new Student1(1, 1, "aHri"); 
	//	System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s3));

//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
		System.out.println(io1.hashCode());



		HashSet hs = new HashSet();
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(io1);
		hs.add(s6);
		System.out.println(hs.size());
		System.out.println(hs);
	}
}

class Student1
{
	int sno;
	int whichclass;
	String name;

	Student1(int sno, int whichclass, String name)
	{
		this.sno				= sno;
		this.whichclass	= whichclass;
		this.name				= name;
	}

	public boolean equals(Object obj)
	{
		System.out.println("In equals");
		if (obj instanceof Student)
		{
			Student1 s = (Student1)obj;
			if (this.sno == s.sno && this.whichclass == s.whichclass && this.name.equalsIgnoreCase(s.name))
			{
				return true;
			}
		}
		return false;
	}

	public int hashCode()
	{
		System.out.println("In hashcode");
		int size	= this.name.length();
		int result = 1;		
		
		for (int i = 0 ; i < size ; i ++ )
		{
			result = result + (name.charAt(i) ) ;
		}

		return  this.sno + this.whichclass + result;		
	}
	public String toString()
	{
		return sno+ "-"+ whichclass +"-" + name;
	}
}