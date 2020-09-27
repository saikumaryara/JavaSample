class A2{
	void m1() {
		System.out.println("A2.m1()");
	}
	void m2() {
		System.out.println("A2.m2()");
	}
}
class B2 extends A2{
	void m1() {
		System.out.println("B2.m1()");
	}
	void m2() {
		System.out.println("B2.m2()");
	}
	void m3() {
		this.m1();
		this.m2();
		super.m1();
		super.m2();
	}
}
class C2 extends B2{
	void m1() {
		System.out.println("C2.m1()");
	}
	void m2() {
		System.out.println("C2.m2()");
	}
}
class D2 extends C2{
	void m1() {
		System.out.println("D2.m1()");
	}
}
public class Test4 {
	public static void main(String[] args) {
   D2 d1=new D2();
   d1.m1();
   d1.m2();
   d1.m3();
   System.out.println();
   C2 d2=new D2();
   d2.m1();
   d2.m2();
   d2.m3();

 }
}