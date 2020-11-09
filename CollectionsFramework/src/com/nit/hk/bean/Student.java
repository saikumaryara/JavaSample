package com.nit.hk.bean;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Properties;
import com.nit.hk.helper.CourseMap;

public class Student implements Serializable{
	 private static final long serialVersionUID = 1L;
	 private static String institute;
	 private int sno;
	 private String sname;
	 private String course;
	 private double fee;
	 private long mobile;
	 private String email;
	 private char gender;
	 private boolean studying;
	 private Address address;
	 /**
	  * Static block for initializing the static variable institute
	  * Reading its value from a properties file dynamically
	  *  
	  */
	 static {
	 try (FileReader reader = new FileReader("institutedetails.properties")){
	 Properties instituteProps  = new Properties();
	 instituteProps.load(reader);
	 institute = instituteProps.getProperty("name", "NiT");
	 } catch(FileNotFoundException e) {
	 System.out.println("The properites file institutedetails.properties is not found");
	 }catch(IOException e) {
	 e.printStackTrace();
	 }
	 }
	 public static String getInstitute() {
	 return institute;
	 }
	 public static void setInstitute(String institute) {
	 Student.institute = institute;
	 }
	 public int getSno() {
	 return sno;
	 }
	 public void setSno(int sno) {
	 this.sno = sno;
	 }
	 public String getSname() {
	 return sname;
	 }
	 public void setSname(String sname) {
	 this.sname = sname;
	 }
	 public String getCourse() {
	 return course;
	 }
	 public void setCourse(String course) {
	 this.course = course;
	 }
	 public double getFee() {
	 return fee;
	 }
	 public void setFee(double fee) {
	 this.fee = fee;
	 }
	 public long getMobile() {
	 return mobile;
	 }
	 public void setMobile(long mobile) {
	 this.mobile = mobile;
	 }
	 public String getEmail() {
	 return email;
	 }
	 public void setEmail(String email) {
	 this.email = email;
	 }
	 public char getGender() {
	 return gender;
	 }
	 public void setGender(char gender) {
	 this.gender = gender;
	 }
	 public boolean isStudying() {
	 return studying;
	 }
	 public void setStudying(boolean studying) {
	 this.studying = studying;
	 }
	 public Address getAddress() {
	 return address;
	 }
	 public void setAddress(Address address) {
	 this.address = address;
	 }
	 @Override
	 public int hashCode() {
	 return CourseMap.getCourseID(course);
	 }
	 @Override
	 public boolean equals(Object obj) {
	 if(obj instanceof Student s) { //Java 14v new feature Pattern Matching
	 return this.course.equalsIgnoreCase(s.course)
	 && this.sno == s.sno;
	 }
	 return false;
	 }
	 @Override
	 public String toString() {
	 return String.format(
	 "Student(======== Personal Details ============="
	 + "\n   sno\t\t: + %d"
	 + "\n   sname\t\t:+ %s"
	 + "\n   course\t\t: %s"
	 + "\n   fee\t\t: %f"
	 + "\n   mobile\t\t: %d"
	 + "\n   email\t\t: %s"
	 + "\n   gender\t: %c"
	 + "\n   studying: %s"
	 + "\n\n======== Address Details ============="
	 + "\n   street num: %d"
	 + "\n   city\t\t: %s",
	 sno, sname, course, fee, mobile, email, gender, studying?"Yes":"No", 
	 address.getStrNum(), address.getCity() ); 
	 }
	}