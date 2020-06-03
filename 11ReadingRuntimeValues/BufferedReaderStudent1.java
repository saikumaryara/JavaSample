import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
class Student02
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
public class BufferedReaderStudent1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Student02 s1=new Student02();
	System.out.println("Enter SNO:");
	int a=System.in.read();//it take int type (1)but stored as char value(49)
	System.out.println(a);//49
	char ch=(char)a;
		System.out.println(ch);
	String str1=Character.toString(ch);
    s1.sno=Integer.parseInt(str1);
	System.out.println(s1.sno);

	System.out.println("Enter SNAME:");
	int a1=System.in.read();//it take int type (1)but stored as char value(49)
    	System.out.println(a1);
	//s1.sname=Character.parseCharacter();
	//System.out.println(s1.sname);
	/*s1.sname=args[1];
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
		System.out.println("s1.studying:\t"+s1.studying);*/
    }
}