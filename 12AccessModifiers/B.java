//accessing 4 members of class A from outside class within the same packge
package P1;
public class B
{
	public static void main(String[] args) 
	{
                A a=new  A();//accessing class A members from outside class
		// System.out.println("a :"+a.a);//not allowed CE: a has private access in class A
		System.out.println("b :"+a.b);
		System.out.println("c :"+a.c);
		System.out.println("d :"+a.d);
	}
}
//>>javac -d . B.java
//>>java P1.B