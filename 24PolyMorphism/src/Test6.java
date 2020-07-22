class A4{
	static void m1() {
		System.out.println("A4.m1()");
	}
	static void m2() {
		System.out.println("A4.m2()");
		m1();
	}
}
class B4 extends A4{
	static void m1() {
		System.out.println("B4.m1()");
	}
	void m3() {
		System.out.println("B4.m3()");
		m1();
		super.m2();
	}
}
class C4 extends B4{
	static void m2() {
		System.out.println("C4.m2()");
		//m4();
	}
}
class D4 extends C4{
static void m1() {
		System.out.println("D4.m1()");
	}
static void m2() {
		System.out.println("D4.m2()");
	}
static void m4() {
		System.out.println("D4.m4()");
	}
}
public class Test6{
	public static void main(String[] args) {
   D4 d1=new D4();
   d1.m1();
   System.out.println();
   d1.m2();
   System.out.println();
   d1.m3();
   System.out.println();
   d1.m4();
 }
}