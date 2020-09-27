class Division
{
	public static void main(String[] args) 
	{
		try
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;

			System.out.println(c);
		}
		
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("Please pass atlease two integer values");
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Please pass only integer values");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Please DONOT pass second value as ZERO");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
