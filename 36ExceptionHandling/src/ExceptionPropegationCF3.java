class ExceptionPropegationCF3
{
	static void m1()	
	{	
		System.out.println("In m1");			
		System.out.println(10/0);			
		System.out.println("end of  m1");		
	}
	public static void main(String[] args) 
	{
		System.out.println("In main");			
		try
		{
			System.out.println("In main => try");			
			m1();			
			System.out.println("In main => end of try");			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("In main => catch");			
		}
		System.out.println("main end");			
	}
}