//out side the class  protected default public   AM are allowed
class  Sample
{
	public static void main(String[] args) 
	{
         Example e=new  Example();
		//System.out.println("a :"+e.a);//not allowed CE: a has private access in Example
		System.out.println("b :"+e.b);
		System.out.println("c :"+e.c);
		System.out.println("d :"+e.d);
	}
}
