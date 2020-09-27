class PureCheckedExceptionRule 
{
	public static void main(String[] args) 
	{
		try{}
		catch (ArithmeticException ae){}

		try{}
		catch (Exception e){}

/*
		try{}
		catch (InterruptedException ie){} CE: exception java.lang.InterruptedException is never thrown in body of corresponding try statement
	*/
	}
}
