import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;
class Employee002 {
	int eno;
	String user;
	String pwd;
	String ename;
	String dept;
	double sal;
	long mobile;
	String email;
	char gender;
	Boolean status;

}
class EmployeeRegistration
{
    public static void main(String[] args)throws Exception{
       
	   Employee002 e1=new Employee002();
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	   Scanner sc=new Scanner(System.in);
       Console cn=System.console();
        System.out.println("Enter user:");
        System.out.println("Enter pwd:");
	   e1.pwd=new String(cn.readPassword());
	   if(!(e1.user.equals("saikumaryara"))&&(e1.pwd.equals("$@!@1024"))){
	      System.out.println("Error:Invalid user name and pwsd:");
		  return;
	   }
	   e1.eno=Integer.parseInt(args[0]);
    System.out.println("Enter ENAME:");
	   e1.ename=br.readLine();

		System.out.println("Enter DEPT:");
		e1.dept=sc.next();

       		System.out.println("Enter SALARY:");
			e1.sal=Double.parseDouble(br.readLine());

			System.out.println("Enter MOBILENO:");
		e1.mobile=sc.nextLong();

		System.out.println("Enter Email:");
		e1.email=sc.next();
        
        e1.gender=System.getProperty("gender").charAt(0);
		e1.status=Boolean.parseBoolean(System.getProperty("status"));
		System.out.println("--Employee Details Are---");
		System.out.println("e1.sno     :\t"+e1.eno);
		System.out.println("e1.pwd     :\t"+e1.pwd);
		System.out.println("e1.sname   :\t"+e1.ename);
		System.out.println("e1.course  :\t"+e1.dept);
		System.out.println("e1.fee     :\t"+e1.sal);
		System.out.println("e1.email   :\t"+e1.email);
		System.out.println("e1.mobile  :\t"+e1.mobile);
		System.out.println("e1.gender  :\t"+e1.gender);
		System.out.println("e1.status:\t"+e1.status);

	}
}

