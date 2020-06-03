//accessing 4 members of class A from outside class within the same packge
package P1;
public class G
{
	public static void main(String[] args) 
	{
              //  F a=new  F();//accessing class F static members from outside class
		// System.out.println("a :"+F.a);//not allowed CE: a has private access in class F
		System.out.println("b :"+F.b);
		System.out.println("c :"+F.c);
		System.out.println("d :"+F.d);
	}
}
//>>javac -d . G.java
//>>java P1.G