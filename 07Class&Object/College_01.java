//import java.util.Scanner;
class Student_01
{
	int sno;
	String sname;
	String course;
	double fee;
/*	void Studednt_01(int sno,String sname,String course,double fee){
	 this.sno=sno;
	 this.sname=sname;
	 this.course=course;
	 this.fee=fee;
	}*/
}
class College_01
{
	public static void main(String[] args){
		 Student_01 s1=new Student_01();
		 Student_01 s2=new Student_01();
		 s1.sno=101;
		 s1.sname="sai";
		 s1.course="java";
		 s1.fee=2000.0;
		 s2.sno=102;
		 s2.sname="mahesh";
		 s2.course="java";
		 s2.fee=2000.0;
		     System.out.println();

		     System.out.println("----First Student Details----");

		 System.out.println("STUDENT NUMBER\t::"+s1.sno);
	System.out.println("STUDENT NAME  \t::"+s1.sname);
	System.out.println("STUDENT COURSE\t::"+s1.course);
	System.out.println("COURSE FEE    \t::"+s1.fee);
		     System.out.println();
		     System.out.println("----Second Student Details----");
	System.out.println("STUDENT NUMBER\t::"+s2.sno);
	System.out.println("STUDENT NAME  \t::"+s2.sname);
	System.out.println("STUDENT COURSE\t::"+s2.course);
	System.out.println("COURSE FEE    \t::"+s2.fee);

	/*    Student_01 s1=new Student_01(101,"saikumar","java",2000.0);
		Student_01 s2=new Student_01(102,"arun","java",2000.0);
			System.out.println("----First Student Details----");
         System.out.println(s1.sno);
		  System.out.println(s1.sname);
			   System.out.println(s1.course);
			   System.out.println(s1.fee);
           System.out.println("----Second Student Details----");
			   System.out.println(s2.sno);
		  System.out.println(s2.sname);
			   System.out.println(s2.course);
			   System.out.println(s2.fee);*/
	/*	Scanner sai=new Scanner(System.in);
    Student_01[] s={new Student_01(),new Student_01()};
	System.out.println("----First Student Details----");
	System.out.println(s[0].sno=sai.nextInt());
	System.out.println(s[0].sname=sai.next());
	System.out.println(s[0].course=sai.next());
	System.out.println(s[0].fee=sai.nextDouble());
    System.out.println("----Second Student Details----");
	System.out.println(s[1].sno=sai.nextInt());
	System.out.println(s[1].sname=sai.next());
	System.out.println(s[1].course=sai.next());
	System.out.println(s[1].fee=sai.nextDouble());
	for(int i=0;i<s.length;i++){
		   if(i==0)
				   System.out.println("----First Student Details----");
          else	
			  	  System.out.println("----second Student Details----");
	System.out.println("STUDENT NUMBER\t::"+s[i].sno);
	System.out.println("STUDENT NAME  \t::"+s[i].sname);
	System.out.println("STUDENT COURSE\t::"+s[i].course);
	System.out.println("COURSE FEE    \t::"+s[i].fee);
	}
	sai.close();*/
	}
}
