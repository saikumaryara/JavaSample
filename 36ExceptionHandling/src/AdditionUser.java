
class AdditionUser 
{
	public static void main(String[] args) 
	{
		try
		{
			int x = Addition.add(5, 7);
			System.out.println(x);

			x = Addition.add(6, -8);
			System.out.println(x);
		}
		catch(NegativeArgumentException nae)
		{
			nae.printStackTrace();
			System.out.println("==========================================");
			System.out.println(nae.toString());
			System.out.println("==========================================");
			System.out.println(nae.getMessage());

		}
	}
}