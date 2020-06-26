package com.hk.view;
import java.util.Scanner;
import com.hk.bean.Student;
import com.ht.model.University;
public class  College{
 public static void main(String[] args) {
 Scanner scn = new Scanner(System.in);
 Student[] students = new Student[60];
 int index = 0;
 String option = "N";
 do{
 students[index] = new Student();
 System.out.println("Enter student"+(index+1)+" details");
 System.out.print("  Enter sno\t: ");
 students[index].setSno(scn.nextInt()); scn.nextLine();
 System.out.print("  Enter sname\t: ");
 students[index].setSname(scn.nextLine()); 
 System.out.print("  Enter course\t: ");
 students[index].setCourse(scn.nextLine()); 
 System.out.print("  Enter fee\t: ");
 students[index].setFee(scn.nextDouble());  scn.nextLine();
 index++;
 System.out.println("Student"+index+" data is saved");
 System.out.println("\nDo you want to continue? ");
 System.out.print("  Enter (Y/N): ");
 option = scn.nextLine();
 }while (option.equals("Y"));
 System.out.println("\n\nApplying for exams");
 University hkUniversity = new University();
 hkUniversity.applyForExam(students);
 System.out.println("\n\nStudent Name\t\tHall Ticket Number");
 System.out.println("======================================");
 Student[] studentsWithHallTicketNumber = hkUniversity.getHallTickets();
 for(Student s: studentsWithHallTicketNumber){
 if(s != null)
 System.out.println(s.getSname() +"\t\t\t\t"+s.getHallTicketNumber());
 else
 break;
 }
 }
}