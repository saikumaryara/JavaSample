class Student01{
	int sno;
	String sname;
	String course;
	double fee;
}
class Example01{
	static void m1(){
	Student01 s1=new Student01();
	s1.sno=101;s1.sname="HK";
	s1.course="JAVA";s1.fee=2000.0;
	System.out.println(s1.sno+" "+s1.sname+" "+s1.course+" "+s1.fee);
  }
  static Student01[] m2(){
	Student01[] sa=new Student01[2];
	int index=0;
	sa[index]=new Student01();
	sa[index].sno=102;sa[index].sname="Sai";
	sa[index].course="Spring";sa[index].fee=3000.0;
	System.out.println(sa[index].sno+" "+sa[index].sname+" "+sa[index].course+" "+sa[index].fee);
	index++;
	return sa;
  }
}
public class Test01{ 
    public static void main(String[] args){
    Example01.m1();
	Example01.m2();
	Student01[] s3=Example01.m2();
	//System.out.println(Example01.m2());
	}
}