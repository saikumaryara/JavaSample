class P1{int a=10;}
class Q1 extends P1{int b=20;}
class R1{int c=30;}
class AB{
	P1 m1() {
		return new P1();
	}
}
class BC extends AB{
	P1 m1() {
		return new P1();
	}
}
public class Test8 {
      public static void main(String[] args) {
    	  BC b1=new BC();
    	//  Q1 q1=b1.m1();
    	    P1 p1=b1.m1();
    	    System.out.println(p1.a);
    	  //  System.out.println(p1.b);
    	  //Q1 q1=(Q1)P1;
    	   /* if(P1 instanceof Q1) {
    	    	Q1 q1=(Q1)P1;
    	    	System.out.println(q1.b);
    	    }*/
    	    //Q1 q1=b1.m1();
      }
}
