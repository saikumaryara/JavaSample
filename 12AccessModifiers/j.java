package P2;
import P1.F;
class J
{
	public static void main(String[] args) 
	{
		 //A a=new  A();
		//System.out.println("a :"+F.a);//CE:a has private access in class A
		//System.out.println("b :"+F.b);//CE:b is not public in Class A;can't access from outside package
		//System.out.println("c :"+F.c);//CE: c has protected has in A
		System.out.println("d :"+F.d);
		C c1=new C();
		//System.out.println("c :"+C.c);//here c1 is not subclass of class A so protected 
		System.out.println("d :"+c1\\C.d);
	}
}
