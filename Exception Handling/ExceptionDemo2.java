class ExceptionDemo2
{
	public static void main(String args[])
	{
		int a=10,b=5,c=5,d;
		System.out.println("Program execution begin");
		try
		{
			d=(a/(b-c));
			System.out.println("value of d="+d);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer exception occured!!");
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero exception occured!!");
		}
		finally
		{
			System.out.println("I am always executed!!");
		}
		System.out.println("Program execution ended..");
	}
}