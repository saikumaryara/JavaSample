package com.nt.sai.user;

import java.util.Scanner;

import com.nt.sai.developer.student01;

public class college01 {

	 static void main(String[] args) {
		/*
		 * student01 s1 = new student01(101, "CJ"); student01 s2 = new student01(102,
		 * "ADJ");
		 */
		student01 s1 = new student01();
		student01 s2 = new student01();
		
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter s1 atudent details");
			System.out.println("Enter sno::");
			s1.setSno(sc.nextInt());
			System.out.println("Enter Course::");
			s1.setCourse(sc.next());
			System.out.println("Enter s2 atudent details");
			System.out.println("Enter sno::");
			s2.setSno(sc.nextInt());
			System.out.println("Enter Course::");
			s2.setCourse(sc.next());
		if (s1.hashCode() == s2.hashCode()) {//it search by their state
			System.out.println("Both students s1 and s2 same group::");
		} else
			System.out.println("Both students s1 and s2 not same group::");
		if (s1.equals(s2)) {//here it search by reference.
			System.out.println("Both are student State(duplicate)::");
		} else {
			System.out.println("Both are student state(unique)::");
		}
	}

}
