class FinallyWithReturnCF3{
	static void m1()	{	
		System.out.println("In m1");			
		try{
			System.out.println("In try");			
				return;
		}
		catch(ArithmeticException ae){
			System.out.println("In catch");			
			return;
		}
	//	System.out.println("End of m1");			
	}
}
