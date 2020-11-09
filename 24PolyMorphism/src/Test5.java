class A3{
	void m1() {
		System.out.println("A3.m1()");
	}
	void m2() {
		System.out.println("A3.m2()");
		m1();
	}
}
class B3 extends A3{
	void m1() {
		System.out.println("B3.m1()");
	}
	void m3() {
		System.out.println("B3.m3()");
		m1();//this.m1(); current obj
		super.m2();
	}
}
class C3 extends B3{
	void m2() {
		System.out.println("C3.m2()");
		((D3)this).m4();
	}
}
class D3 extends C3{
	void m1() {
		System.out.println("D3.m1()");
	}
	void m2() {
		System.out.println("D3.m2()");
	}
	void m4() {
		System.out.println("D3.m4()");
	}
}
public class Test5{
	public static void main(String[] args) {
   D3 d1=new D3();
   d1.m1();
   System.out.println();
   d1.m2();
   System.out.println();
   d1.m3();
   System.out.println();
   d1.m4();
 }
}