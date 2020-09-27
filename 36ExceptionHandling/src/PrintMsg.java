import custexcep.NagativeArgumentException;

class PrintMsg
{
	static void print(int a, String msg) throws NagativeArgumentException
	{
		if(a < 0)
		{
			throw new NagativeArgumentException("Do not pass negative number");
		}
		for (int i = 1; i <= a ; i++)
		{
			System.out.println(msg);
		}
	}

	static int add(int a , int b) throws NagativeArgumentException
	{

		if(a < 0 || b < 0 )
		{
			throw new NagativeArgumentException("Do not pass negative numbers"); 
		}
		return a + b;
	}
}