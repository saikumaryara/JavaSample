//Within in the same class all AM are allowed
class  Example
{
    private int a=10;
             int b=20;
    protected   int c=30;
    public   int d=40;
	public static void main(String[] args) 
	{
         Example e=new  Example();
		System.out.println("a :"+e.a);
		System.out.println("b :"+e.b);
		System.out.println("c :"+e.c);
		System.out.println("d :"+e.d);
	}
}
