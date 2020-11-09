package com.nit.hk.main;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.nit.hk.bean.Address;
import com.nit.hk.bean.Student;
import com.nit.hk.dao.StudentDAO;
import com.nit.hk.exceptions.StudentNotFoundException;
import com.nit.hk.helper.CourseMap;

public class College {
	public static void main(String[] args) throws StudentNotFoundException {
		Scanner scn = new Scanner(System.in);
		StudentDAO studentDAO = new StudentDAO();
		loop: while (true) {
			System.out.println("\nChoose one option");
			System.out.println(" 1. Store ");
			System.out.println(" 2. Get");
			System.out.println(" 3. Update");
			System.out.println(" 4. Delete");
			System.out.println(" 5. Count");
			System.out.println(" 6. Display");
			System.out.println(" 7. Exit");
			System.out.print("Enter one option: ");
			int option = scn.nextInt();
			switch (option) {
			case 1: // store
				System.out.println("\nChoose one option");
				System.out.println(" 1. one student");
				System.out.println(" 2. multiple students");
				System.out.print("Enter option: ");
				option = scn.nextInt();
				switch (option) {
				case 1: { // one student
					Student student = getStudent();
					boolean inserted = studentDAO.insert(student);
					if (inserted)
						System.out.println("\nstudent details are stored");
					else
						System.out.println("duplicate student, so not stored");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					}
					break;
				}
				case 2: {// multiple students
					ArrayList<Student> al = new ArrayList<>();
					String opt = "N";
					do {
						Student student = getStudent();
						al.add(student);
						System.out.println("Student object is saved");
						while (true) {
							System.out.println("\nDo you want to continue?(Y/N): ");
							opt = scn.next();
							if (opt.equalsIgnoreCase("Y") || opt.equalsIgnoreCase("N")) {
								break;
							} else {
								System.err.println("Please enter only Y/N");
								continue;
							}
						} // while(true) close
					} while (opt.equalsIgnoreCase("Y"));
					studentDAO.insert(al);
					System.out.println("All student details are stored");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
					}
					break;
				}
				default:
					System.out.println("Invalid option");
				}// inner switch close for insert operation
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				break;
			case 2: // Get
				System.out.println("\nChoose one option");
				System.out.println(" 1. Get one student");
				System.out.println(" 2. Get one course all students ");
				System.out.println(" 3. Get all students ");
				System.out.print("Enter option: ");
				option = scn.nextInt();
				scn.nextLine();
				switch (option) {
				case 1: {// one student
					System.out.println("  Enter sno: ");
					int sno = scn.nextInt();
					scn.nextLine();
					System.out.println("  Enter course: ");
					String course = scn.nextLine();
					Student student;
					try {
						student = studentDAO.select(sno, course);
						System.out.println(student);
					} catch (StudentNotFoundException e) {
						System.err.println(e.getMessage());
					}
					break;
				}
				case 2: {// one course students
					System.out.println("  Enter course: ");
					String course = scn.nextLine();
					if (CourseMap.contains(course)) {
						Enumeration<Student> e;
						e = studentDAO.select(course);
						while (e.hasMoreElements()) {
							System.out.println(e.nextElement());
						}
					} else {
						System.err.println("  The course " + course + " is not existed");
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
						}
						System.out.println("\n  Choose one course from the below list");
						System.out.println("     ===================== ");
						CourseMap.getCourses().forEach(crs -> {
							System.out.println("     | " + crs);
						});
						System.out.println("     ===================== ");
						System.out.println("Please enter course name as it was displayed: ");
					}
					break;
				}
				case 3: { // all students
					Enumeration<Student> e = studentDAO.select();
					while (e.hasMoreElements()) {
						System.out.println(e.nextElement());
					}
				}
				default: {
					System.out.println("Invalid option");
				}
				}
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				break;
			case 3: // Update
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				break;
			case 4: // Delete
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				break;
			case 5: // Count
				System.out.println("Number of students exist are: " + studentDAO.getCount());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				break;
			case 6: // display
				System.out.println(studentDAO);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				break;
			case 7: // Exit
				System.out.println("\n_/\\_ Thank You Visit Again _/\\_");
				break loop;
			default:
				System.out.println("Tumri fellow ");
				System.out.println("Invalid option");
				System.out.println("Enter between 1-7");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
			}// switch close
		} // while(true) close
	}// main close

	private static Student getStudent() {
		Scanner scn = new Scanner(System.in);
		Student student = new Student();
		System.out.println("\n=== Enter Personal details ===");
		while (true) {
			try {
				System.out.print("  sno\t\t: ");
				student.setSno(scn.nextInt());
				scn.nextLine();
				break;
			} catch (InputMismatchException e) {
				System.err.println("  Please enter only integer\n");
				scn.nextLine();
			}
		}
		System.out.print("  sname\t\t: ");
		student.setSname(scn.nextLine());
		while (true) {
			System.out.print("  course\t: ");
			String course = scn.nextLine().toUpperCase();
			if (CourseMap.contains(course)) {
				student.setCourse(course);
				break;
			} else {
				System.err.println("  The course " + course + " is not existed");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				System.out.println("\n  Choose one course from the below list");
				System.out.println("     ===================== ");
				CourseMap.getCourses().forEach(crs -> {
					System.out.println("     | " + crs);
				});
				System.out.println("     ===================== ");
				System.out.println("Please enter course name as it was displayed: ");
			}
		}
		while (true) {
			try {
				System.out.print("  fee\t\t: ");
				student.setFee(scn.nextDouble());
				break;
			} catch (InputMismatchException e) {
				System.err.println("  Please enter only number\n");
				scn.nextLine();
			}
		}
		System.out.print("  email\t\t: ");
		student.setEmail(scn.next());
		System.out.print("  mobile\t: ");
		student.setMobile(scn.nextLong());
		System.out.print("  gender\t: ");
		student.setGender(scn.next().charAt(0));
		System.out.println("\n=== Enter Address details ===");
		Address address = new Address();
		student.setAddress(address);
		System.out.print("  strNum\t: ");
		address.setStrNum(scn.nextInt());
		scn.nextLine();
		System.out.print("  city\t\t: ");
		address.setCity(scn.nextLine());
		return student;
	}
}// class close