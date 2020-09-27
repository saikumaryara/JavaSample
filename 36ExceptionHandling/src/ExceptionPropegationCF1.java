class ExceptionPropegationCF1
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
		m1();			
		System.out.println("main end");			
	}
}