import java.util.Scanner;
class Student02{
	int sno;
	String sname;
	String course;
	double fee;

 public String toString(){
	return "sno "+sno+" : sname "+sname+" : course "+course+" :fee "+fee;
  }
}
class Example02{
	static void m1(){
	Student02 s1=new Student02();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter SNO:");
	s1.sno=sc.nextInt();
	System.out.println("Enter SName:");
	s1.sname=sc.next();
	System.out.println("Enter course:");
	s1.course=sc.next();
	System.out.println("Enter Fee:");
	s1.fee=sc.nextDouble();
	//System.out.println(s1.sno+" "+s1.sname+" "+s1.course+" "+s1.fee);
	System.out.println(s1);
  }
  static Student02 m2(){
	Student02 s2=new Student02();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter SNO:");
	s2.sno=sc.nextInt();
	System.out.println("Enter SName:");
	s2.sname=sc.next();
	System.out.println("Enter course:");
	s2.course=sc.next();
	System.out.println("Enter Fee:");
	s2.fee=sc.nextDouble();
	//System.out.println(s2.sno+" "+s2.sname+" "+s2.course+" "+s2.fee);
	System.out.println(s2);
	return s2;
  }
 
}
public class Test03{ 
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Student Details");
    Example02.m1();
	System.out.println("Enter 2nd Student Details");
	Example02.m2();
	System.out.println("Enter 3rd Student Details");
	Student02 s3=Example02.m2();
	System.out.println(s3);
	//System.out.println(Example02.m2());
	}
}