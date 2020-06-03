//accessing 4 members of Class A from another package from subclass ref
package P2;
import P1.F;
class H extends F
{
	public static void main(String[] args) 
	{
		 F a=new  F();
		//System.out.println("a :"+F.a);//CE:a has private access in class F
		//System.out.println("b :"+F.b);//CE:b is not public in Class F;can't access from outside package
		System.out.println("c :"+F.c);//CE: c has protected has in F
		System.out.println("d :"+F.d);
		H c1=new H();
		//System.out.println("a :"+H.a);
		//System.out.println("b :"+H.b);
		System.out.println("c :"+H.c);//here c1 is subclass of class F so protected 
		System.out.println("d :"+H.d);
	}
}
