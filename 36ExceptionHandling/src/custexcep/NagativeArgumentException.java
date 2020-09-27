package custexcep;

public class NagativeArgumentException extends Exception
{
	public NagativeArgumentException()
	{
		super();
	}
	public NagativeArgumentException(String msg)
	{
		super(msg);
	}
}
