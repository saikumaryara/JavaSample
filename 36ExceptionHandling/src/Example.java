class Example 
{
	int m1(int a)
	{
		System.out.println("m1 start");
		try
		{
			return  a +20;
		}
		catch(ArithmeticException ae)
		{
			return  a +20;
		}
		finally
		{
			return  a +20;
		}
		/*
		 * System.out.println("m1 end"); return 50;
		 */				//System.out.println("m1 end");
	}
}
