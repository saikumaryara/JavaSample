package com.nit.hk.suncollections;

public class Student {

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	private int sno;
	private String name;
	
	public int getSno() {
		return sno;
	}


	public void setSno(int sno) {
		this.sno = sno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", " + (name != null ? "name=" + name : "") + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + sno;
		return result;
	}
    
	@Override
	public boolean equals(Object obj) {
		System.out.println("compare addr");
		if (this == obj)
			return true;
		System.out.println("check obj");
		if (obj == null)
			return false;
		System.out.println("compare cls");
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		System.out.println("check name");
		if (name == null) {
			System.out.println("check 64");
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		
		System.out.println("compare sno");
		if (sno != other.sno)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Student s1=new Student(1,"P");
		String s="a";
		Student s2=new Student(2,"P");
		System.out.println(s1.equals(s2));
	}
}
