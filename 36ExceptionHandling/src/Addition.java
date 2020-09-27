class Addition
{
	static int add(int a , int b) throws NegativeArgumentException
	{
		if(a < 0 || b < 0 )
		{
			throw new NegativeArgumentException("Do not pass negative numbers"); 
		}
		return a + b;
	}
}