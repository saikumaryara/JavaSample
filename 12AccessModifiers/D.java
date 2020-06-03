package P2;
import P1.A;
class D
{
	public static void main(String[] args) 
	{
		 A a=new  A();
		//System.out.println("a :"+a.a);//CE:a has private access in class A
		//System.out.println("b :"+a.b);//CE:b is not public in Class A;can't access from outside package
		//System.out.println("c :"+a.c);//CE: c has protected has in A
		System.out.println("d :"+a.d);
		C c1=new C();
		//System.out.println("c :"+c1.c);//here c1 is not subclass of class A so protected 
		System.out.println("d :"+c1.d);
	}
}
