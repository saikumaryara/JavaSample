class ThrowCF3 
{
	public static void main(String[] args)
	{
		System.out.println("In main");
		try
		{
			System.out.println("In try");
			throw new Exception();
		}
		catch(Exception e)
		{
			System.out.println("In catch");
		}
	}
}