class Student01
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
public class CommandLineStudent
{
	public static void main(String[] args) 
	{
		
	Student01 s1=new Student01();
	s1.sno=Integer.parseInt(args[0]);
	s1.sname=args[1];
	s1.course=args[2];
	s1.fee=Double.parseDouble(args[3]);
	s1.email=args[4];
	s1.mobile=Long.parseLong(args[5]);
	s1.gender=args[6].charAt(0);
	s1.studying=Boolean.parseBoolean(args[7]);
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
}