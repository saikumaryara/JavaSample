package com.hk.bean;
public class Student implements java.io.Serializable {
 private int sno;
 private String sname;
 private String course;
 private double fee;
 private long hallTicketNumber;
 public Student(){ }
 public void setSno(int sno){
 this.sno = sno;
 }
 public int getSno(){
 return sno;
 }
 public void setSname(String sname){
 this.sname = sname;
 }
 public String getSname(){
 return sname;
 }
 public void setCourse(String course){
 this.course = course;
 }
 public String getCourse(){
 return course;
 }
 public void setFee(double fee){
 this.fee = fee;
 }
 public double getFee(){
 return fee;
 }
 public void setHallTicketNumber(long hallTicketNumber){
 this.hallTicketNumber = hallTicketNumber;
 }
 public long getHallTicketNumber(){
 return hallTicketNumber;
 }
 public String toString(){
 return "Student("+sno + ", "+sname+", "+ course+ ", "+ fee+", "+hallTicketNumber+")";
 }
}