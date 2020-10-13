class P{
	static void m1() {
		System.out.println("p.m1()");
	}
	 void m2() {
			System.out.println("p.m2()");
		}
	 void m3() {
			System.out.println("p.m3()");
		}
	
}
class Q extends P{
	static void m1() {
		System.out.println("Q.m1()");
	}
	 void m2() {
			System.out.println("Q.m2()");
		}
	 void m3() {
			System.out.println("Q.m3()");
		}
	 void m4() {
			System.out.println("Q.m4()");
		}
}
public class Test2 {
  public static void main(String[] args) {
	 
	  Q q1=new Q();
	    q1.m1();
	    q1.m2();//compiler add Q.m1();
	    q1.m3();
	    q1.m4();
	    P p1=new P();
	    p1.m1();//compiler add P.m1();
	    p1.m2();
	    p1.m3();
	    //p1.m4();cfs
	   
	    P p2=new Q();
	    p2.m1();//compiler add P.m1();
	    p2.m2();//Here we are calling NSM of class P but it holds Q class obj 
	    //so it exe from Q class and we are overriding m2() if not override exec from p class here
      //new Q() internally aving P obj
	    p2.m3();
	    //p2.m4();
	   // Q q2=new P();U can't store sub class obj in super class reference
  }
}
