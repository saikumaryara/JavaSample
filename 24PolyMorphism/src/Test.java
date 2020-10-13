class A{
	void m1() {
		System.out.println("A.m1()");
	}
	void m2(int a) {
		System.out.println("Int A.m2()");
	}
}
class B extends A{
	void m1() {//overrding
		System.out.println("B.m1()");
	}
	void m1(int a) {
		System.out.println("Int B.m1()");
	}
	void m1(double d) {
		System.out.println(" Double B.m1()");
	}
	void m2(String s) {
		System.out.println("String B.m2()");
	}
}
public class Test {
   public static void main(String[] arggs) {
	   A a1=new A();
	   a1.m1();
	   a1.m2(10);
	  B b1=new B();
	    b1.m1();
	    b1.m2(5);
	    b1.m1(new Integer(3));
   }
}
