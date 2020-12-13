package com.nit.hk.suncollections;

import java.util.TreeSet;

/**
 * Emp class
 * @author SilentSKY
 * @Version 15
 * I want to sort objects based on properties using comparable 
 * u can developed default sorting order logic along with the object
 * i.e we can sort only single element suc as sno,id,name ...etc
 */
class Emp implements Comparable<Emp> {

	private int sno;
	private String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	//	result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sno != other.sno)
			return false;
		return (name.equals(other.name)&&this.sno==other.sno);
	}
	@Override
	public String toString() {
		return "Emp [sno=" + sno + ", " + (name != null ? "name=" + name : "") + "]";
	}

	public Emp(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public Emp() {
		
	}

	@Override
	public int compareTo(Emp o) {
   //defualt sorting order based on sno descending order return o.sno-this.sno;
		
		return this.sno-o.sno;//for ascending
	}
	

}

public class AddingCustomObjectsToSetAndMap1 {

	public static void main(String[] args) {

		Emp e1=new Emp(1,"S");
		Emp e2=new Emp(2,"A");
		Emp e3=new Emp();
		Emp e4=new Emp(1,"S");
		Emp e5=new Emp(2,"A");
		
		
		
		/*
		 * Using Treeset no-arg constructor ,so elements are sorted in acc to natural
		 * sortin order only on single elememt at a time Suppose u want to change to
		 * based name  want sort then based sno u ust change  in comapreTo() method, But using comparator we
		 * can take multiple sortings at at time for every sorting new comparator class
		 * constructor outer class (or) we can take Anonymous class for visibilty more
		 */
		TreeSet<Emp> t1=new TreeSet<Emp>();
		t1.add(e1);
		t1.add(e3);
		t1.add(e2);
		t1.add(e5);
		t1.add(e4);
		
		System.out.println(t1);
		System.out.println();
		//For store Srting order use comparator it sort on multiple properties at time for each property
		TreeSet<Emp> t2=new TreeSet<Emp>(new Snocomparator());
		/*
		 * Here we are take outer class for Snocomparator that imelemnets comparator and
		 * Override compare
		 * visibilty is less if we take outer class
		 */
		t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		
		System.out.println(t2);
		System.out.println();
		TreeSet<Emp> t3=new TreeSet<Emp>(new Snocomparator() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.compareTo(o2);
			}
		});
		//Here I am taking Anonymous inner class for more visibilty 
		t3.add(e1);
		t3.add(e2);
		t3.add(e3);
		t3.add(e4);
		t3.add(e5);
		//Here state wise duplicate data not stored bacuase we are overrideing hs() ,equlas()
		//If name and sno are same of next elmenent we are adding then i returend hashcode based on sno  same for both elements . 
		//tat wy next e,e5 are not added
		System.out.println(t3);
		
		
		
		
	}

}
