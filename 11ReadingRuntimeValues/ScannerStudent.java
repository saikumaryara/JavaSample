import java.util.Scanner;
class Student04
{
	int sno;
	String sname;
	String course;
	double fee;
	String email;
	long mobile;
	char gender;
	boolean studying;

}
public class ScannerStudent
{
	public static void main(String[] args) 
	{
		
	Student04 s1=new Student04();
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter SNO:");
		s1.sno=sc.nextInt();
		sc.nextLine();//because (when you enter SNO 101   it takes 101<-' enter key also)<-'(ie ""is stored in sname
		System.out.println("Enter SNAME:");
		s1.sname=sc.nextLine();
		System.out.println("Enter Course:");
		s1.course=sc.nextLine();
		System.out.println("Enter FEE:");
		s1.fee=sc.nextDouble();
		System.out.println("Enter Email:");
		s1.email=sc.next();
		System.out.println("Enter mobileNo:");
		s1.mobile=sc.nextLong();
		System.out.println("Enter Gender:");
		s1.gender=sc.next().charAt(0);
	    System.out.println(" Are You Studying (Yes/No) if yes enter y or else n :");
		char str=sc.next().charAt(0);
	    if(equalsIgnoreCase(str)=='y'){
	    s1.studying=true;
       	}
	    else{
		s1.studying=false;
	    }
		System.out.println("--Student Details Are---");
		System.out.println("s1.sno     :\t"+s1.sno);
		System.out.println("s1.sname   :\t"+s1.sname);
		System.out.println("s1.course  :\t"+s1.course);
		System.out.println("s1.fee     :\t"+s1.fee);
		System.out.println("s1.email   :\t"+s1.email);
		System.out.println("s1.mobile  :\t"+s1.mobile);
		System.out.println("s1.gender  :\t"+s1.gender);
		System.out.println("s1.studying:\t"+s1.studying);
    }
	private static char equalsIgnoreCase(char str) {
	return str;
    }
}