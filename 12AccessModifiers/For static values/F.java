//Below program shows the 4 levels of all accessibility permissions in same packages with static data menmbers
package P1;
public class  F
{
    private static int a=10;
            static int b=20;
    protected static int c=30;
    public  static int d=40;
	public static void main(String[] args) 
	{	
	    System.out.println("a :"+F.a);
		System.out.println("b :"+F.b);
		System.out.println("c :"+F.c);
		System.out.println("d :"+F.d);
	}
}
//>>javac -d . F.java
//>>java P1.F