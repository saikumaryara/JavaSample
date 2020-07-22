
public class Test04_Strin_prob_Why_StringBuffer {
	public static void main(String[] args) {
	String s1="hari";
	System.out.println("Before Concat\n"+s1);
	s1.concat("krishna");
	System.out.println("After concat\n"+s1);
	//here hari only come becoz String is immutable
	String s2=s1.concat("NIT");
	System.out.println("S1 "+s1);
	System.out.println("S2 "+s2);//here new object is pointing to s2
	s1=s1.concat("ameerpet");
	System.out.println(s1);
	//problem is if u modify 1Million times 
	//1Million new String objects are created
	//performence issue will come Solution is use StringBuffer
   StringBuffer sb1=new StringBuffer("sai");
   System.out.println(sb1);
   System.out.println(sb1.append("kumar"));
	}
}
