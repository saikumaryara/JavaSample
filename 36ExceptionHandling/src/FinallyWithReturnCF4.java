class FinallyWithReturnCF4{
	static void m1()	{	
		System.out.println("In m1");			
		try{
			System.out.println("In try");			
		}
		catch(ArithmeticException ae){
			System.out.println("In catch");			
		}
		finally
		{
			System.out.println("In finally");			
			return;
		}
		//System.out.println("End of m1");			CE: u r s 
	}
}
