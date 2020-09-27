class ThrowCF7 
{
	public static void main(String[] args)
	{
		System.out.println("In main");

		if(false)
		{
			System.out.println("In if");
			throw new ArithmeticException();
			//System.out.println("end of if"); CE: u r s
		}
		System.out.println("end of main"); 
	}
}