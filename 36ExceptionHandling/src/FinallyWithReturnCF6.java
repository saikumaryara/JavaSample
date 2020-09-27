class FinallyWithReturnCF6{
	static int m1(){	
		System.out.println("In m1");			
		try{
			System.out.println("In try");			
			System.out.println(10/0);			
		}
		finally
		{
			System.out.println("In finally");			
			return 20;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("In main");			
		int x = m1();			
		System.out.println("main end");			
	}
}