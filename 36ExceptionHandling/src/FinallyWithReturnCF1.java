class FinallyWithReturnCF1 
{
	static void m1()
	{	
		System.out.println("In m1");			
		try
		{
			System.out.println("In try");			
			return;		
		}
		catch(ArithmeticException ae)
		{
			System.out.println("In catch");			
		}
		finally
		{
			System.out.println("In finally");			
		}
		System.out.println("End of m1");			
	}

	public static void main(String[] args) 
	{
		System.out.println("In main");			
		m1();
		System.out.println("end of main");			
	}
}
