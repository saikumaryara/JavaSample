class ThrowsCF1 
{
	static void m1() throws InterruptedException
	{
		System.out.println("In m1");	
		throw new InterruptedException();
	}

	static void m2() throws InterruptedException
	{
		System.out.println("In m2");	
		m1();
	}

	static void m3() 
	{
		System.out.println("In m3");	
		try
		{
			System.out.println("In m3 try");	
			m2();
		}
		catch(InterruptedException ie)
		{
			System.out.println("In m3 catch");	
		}			
		System.out.println("End of m3");	
	}

	public static void main(String[] args)
	{
		System.out.println("In main");	
		m3();
		System.out.println("End of main");	
	}
}