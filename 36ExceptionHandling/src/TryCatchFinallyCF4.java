class TryCatchFinallyCF4 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("In Try");
			System.out.println(10/0);
			System.out.println("End of Try");
		}
		catch (ArithmeticException ae)
		{
			System.out.println("In catch");
			System.out.println(10/0);
			System.out.println("End of Try");
		}
		finally
		{
			System.out.println("In finally");
			String s = null;
			System.out.println(s.toUpperCase());
		}
		System.out.println("After try/catch/finally");
	}
}
