//Below program shows the 4 levels of all accessibility permissions in same packages 
package P1;
public class  A
{
    private int a=10;
             int b=20;
    protected  int c=30;
    public   int d=40;
	public static void main(String[] args) 
	{
         A a=new  A();
		System.out.println("a :"+a.a);
		System.out.println("b :"+a.b);
		System.out.println("c :"+a.c);
		System.out.println("d :"+a.d);
	}
}
//>>javac -d . A.java
//>>java P1.A