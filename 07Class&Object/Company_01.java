import java.util.Scanner;
class Employee_01
{
	int empno;
	String empname;
	double salary;
	String dept;
}
class Company_01
{
	public static void main(String[] args){
		 Employee_01 e1=new Employee_01();
		 Employee_01 e2=new Employee_01();
	Scanner sc=new Scanner(System.in);
    System.out.println("::Enter Fist Employee Details::");
	System.out.println("EMPLOYEE NUMBER:");
		 e1.empno=sc.nextInt();
		 System.out.println("EMPLOYEE NAME:");
		 e1.empname=sc.next();
		 System.out.println("EMPLOYEE SALARY:");
		 e1.salary=sc.nextDouble();
		 System.out.println("EMPLOYEE DEPT:");
		 e1.dept=sc.next();
		 System.out.println("::Enter Fist Employee Details::");
		 System.out.println("EMPLOYEE NUMBER:");
		 e2.empno=sc.nextInt();
		 System.out.println("EMPLOYEE NAME:");
		 e2.empname=sc.next();
		 System.out.println("EMPLOYEE SALARY:");
		 e2.salary=sc.nextDouble();
		 System.out.println("EMPLOYEE DEPT:");
		 e2.dept=sc.next();
		 
		
		     System.out.println();

		     System.out.println("----First EMPLOYEE Details----");

		 System.out.println("EMPLOYEE NUMBER\t::"+e1.empno);
	System.out.println("EMPLOYEE NAME  \t::"+e1.empname);
	System.out.println("EMPLOYEE salary ::"+e1.salary);
		System.out.println("EMPLOYEE dept\t::"+e1.dept);

		     System.out.println();
		     System.out.println("----Second EMPLOYEE Details----");
	System.out.println("EMPLOYEE NUMBER\t::"+e2.empno);
	System.out.println("EMPLOYEE NAME  \t::"+e2.empname);
	System.out.println("EMsPLOYEE salary::"+e2.salary);
		System.out.println("EMPLOYEE dept\t::"+e2.dept);
}
}
//Company_01.java
//>>javac Company_01.java
//>>java Company_01