package com.nit.hk.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;
import com.nit.hk.bean.Student;
import com.nit.hk.exceptions.StudentNotFoundException;

public class StudentDAO {
	private Vector<Student> studentDB;

	public StudentDAO() {
		studentDB = new Vector<Student>();
	}

	public int getCount() {
		return studentDB.size();
	}

	public boolean insert(Student s) {
		if (!studentDB.contains(s)) {
			studentDB.add(s);
			return true;
		} else {
			return false;
		}
	}

	public boolean insert(ArrayList<Student> list) {
		for (Student s : list) {
			insert(s);
		}
		return true;
	}

	public Student select(int sno, String course) throws StudentNotFoundException {
		Student s = new Student();
		s.setSno(sno);
		s.setCourse(course);
		int index = studentDB.indexOf(s);
		if (index != -1)
			return studentDB.get(index);
		throw new StudentNotFoundException(
				"Student is not found with the given details sno: " + sno + " and course: " + course);
	}

	public Enumeration<Student> select() {
		return studentDB.elements();
	}

	public Enumeration<Student> select(String course) {
		ArrayList<Student> al = new ArrayList<>();
		for (Student s : studentDB) {
			if (s.getCourse().equalsIgnoreCase(course)) {
				al.add(s);
			}
		}
		return Collections.enumeration(al);
	}

	public void update(Student s) throws StudentNotFoundException {
		Student ele = select(s.getSno(), s.getCourse());
		if (s.getSname() != null) {
			ele.setSname(s.getSname());
		}
		if (s.getMobile() != 0) {
			ele.setMobile(s.getMobile());
		}
		if (s.getEmail() != null) {
			ele.setEmail(s.getEmail());
		}
		if (s.getGender() != '\0') {
			ele.setGender(s.getGender());
		}
		if (s.isStudying()) {
			ele.setStudying(true);
		} else {
			ele.setStudying(false);
		}
		if (s.getAddress() != null) {
			ele.setAddress(s.getAddress());
		}
	}

	public void delete(Student s) throws StudentNotFoundException {
		boolean removed = studentDB.remove(s);
		if (!removed) {
			throw new StudentNotFoundException(
					"Student is not found with the given details sno: " + s.getSno() + " and course: " + s.getCourse());
		}
	}

	public void delete(String course) throws StudentNotFoundException {
		boolean removed = false;
		for (Student s : studentDB) {
			if (s.getCourse().equalsIgnoreCase(course))
				removed = studentDB.remove(s);
		}
		if (!removed)
			throw new StudentNotFoundException("Student is not found in the given course: " + course);
	}
}
