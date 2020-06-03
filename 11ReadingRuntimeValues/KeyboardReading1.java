import java.io.*;
class Student03
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
public class KeyboardReading1
{
  public static void main(String args[]) throws IOException
  {
    DataInputStream dis = new DataInputStream(System.in);//it takes values as string type
    System.out.println("Enter FNO: ");
    int a =Integer.parseInt(dis.readLine());
    System.out.println("I know your FNO is " +a);
 
    System.out.println("Enter SNO: ");
    int b=Integer.parseInt(dis.readLine());
        System.out.println("I know your SNO is " +b);
     int c=a+b;
    System.out.printf("The sum of %d and %d is = %d \n",a,b,c); 
    
	Student03 s1=new Student03();
	System.out.println("Enter SNO:");
	s1.sno=Integer.parseInt(dis.readLine());
	System.out.println("Enter SNAME:");
	s1.sname=dis.readLine();
	System.out.println("Enter Cousre:");
	s1.course=dis.readLine();
	System.out.println("Enter FEE:");
	s1.fee=Double.parseDouble(dis.readLine());
	System.out.println("Enter Email:");
	s1.email=dis.readLine();
	System.out.println("Enter MonileNO:");
	s1.mobile=Long.parseLong(dis.readLine());
	System.out.println("Enter Gender:");
	s1.gender=dis.readLine().charAt(0);
	System.out.println(" Are You Studying (Yes/No) if yes enter y or else n :");
	char str=dis.readLine().charAt(0);
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

	dis.close();


  }


private static char equalsIgnoreCase(char str) {
	return str;
}
}
