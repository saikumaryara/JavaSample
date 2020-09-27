class ExceptionPropegationCF2
{
	static void m1()	
	{	
		System.out.println("In m1");			
		try
		{
			System.out.println("In try");		
			System.out.println(10/0);			
			System.out.println("End of try");		
		}
		catch(ArithmeticException ae)
		{
			System.out.println("In catch");		
		}
		System.out.println("end of  m1");		
	}
	public static void main(String[] args) 
	{
		System.out.println("In main");			
		m1();			
		System.out.println("main end");			
	}
}