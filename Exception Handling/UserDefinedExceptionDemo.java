//user defined exception

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
class UserDefinedExceptionDemo
{
	public static void main(String args[])
	{
		try
		{
			throw new MyException("User Defined exception!!");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}