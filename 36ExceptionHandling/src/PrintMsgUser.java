import custexcep.*;

class AdditionUser1 
{
	public static void main(String[] args) throws NegativeArgumentException 
	{
		int x = Addition.add(5, 7);
		System.out.println(x);

		x = Addition.add(6, -8);
		System.out.println(x);
	}
}