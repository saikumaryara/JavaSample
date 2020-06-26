package com.ht.model;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.hk.bean.Student;
public class University {
 private long hallTicketNumSeq;
 public University(){
 hallTicketNumSeq = 94321;
 }
 public void applyForExam(Student[] students){
 System.out.println("student initial details ");
 for(int i= 0; i < students.length; i++){
 if(students[i] != null)
 System.out.println(students[i]);
 else
 break;
 }
 for(int i= 0; i < students.length; i++){
 if(students[i] != null)
 students[i].setHallTicketNumber(hallTicketNumSeq++);
 else
 break;
 }
 System.out.println("student details after hall ticket number assignment");
 for(int i= 0; i < students.length; i++){
 if(students[i] != null)
 System.out.println(students[i]);
 else
 break;
 }
 try(
 ObjectOutputStream oos = 
 new ObjectOutputStream(new FileOutputStream("students.txt"));
 ){
 oos.writeObject(students);
 System.out.println("All students applications are accepted");
 } catch (FileNotFoundException e) {
 System.out.println("students.ser is not found or access is denied");
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
 public Student[] getHallTickets(){
 Student[] students = null;
 try(
 ObjectInputStream ois = 
 new ObjectInputStream(new FileInputStream("students.txt"));
 ){
 students = (Student[])ois.readObject(); 
 //System.out.println("Students data read");
 }catch (FileNotFoundException e) {
 System.out.println("students.ser is not found or access is denied");
 } catch (IOException | ClassNotFoundException e){
 e.printStackTrace(); 
 }
 return students;
 }
}