class A{
	A(){
		System.out.println("Good Morning::");
	}
	static void m1() {
		System.out.println("\nHi");
	}
	void m2() {
		System.out.println("Hello");
	}
}
@FunctionalInterface
interface I1{
	void abc();
}
public class Test01 {

	public static void main(String[] args) {
      	I1 i1=()->{System.out.println("\nHru");};
      	i1.abc();
      	I1 i2=()->{A.m1();};
      	i2.abc();
      	I1 i3=()->{System.out.println("\nHello all\n");};
      	i3.abc();
      	I1 i4=()->{new A().m2();};
      	i4.abc();
      	//for static method reference
      	I1 i5=A::m1;
      	i5.abc();
      	//For Instance method reference
      	System.out.println();
      	I1 i6=new A()::m2;
      	i6.abc();
      	System.out.println();
      	//for Constructor reference
      	I1 i7=A::new;
      	i7.abc();
      	
	}

}
