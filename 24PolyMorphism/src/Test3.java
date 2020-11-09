
class  A1
{
	static void m1(){
	  System.out.println("A1 m1");
	}
	void m2(){
	   System.out.println("A1 m2");
	}
}
class  B1 extends A1
{
	static void m1(){
	  System.out.println("B1 m1");
	}
	void m2() {
		super.m2();//Method Extending
		System.out.println("B1.m2()");
		m3();//internally it place this.m3();->
	}
	void m3() {
		System.out.println("B1.m3()");
	}
}
class Test3
{
  public static void main(String[] args) 
	{
	  B1 b1=new B1();
	    b1.m2();
	    b1.m1();
		System.out.println();
		A1 a1=new B1();//here new B() create obj internally for A class also
		//because in B class extends A constructor call super() internaly
		a1.m2();
		a1.m1();
		System.out.println();
		A1 a2=new A1();
		a2.m2();
		a2.m1();
	}
}