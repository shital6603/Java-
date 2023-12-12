class ExceptionDemo
{
	public static void main(String args[])
	{
		int a=10,b=10,c=5,d;
		System.out.println("Program execution begin");
		try
		{
			d=(a/(b-c));
			System.out.println("value of d="+d);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero exception occured!!");
		}
			System.out.println("Program execution ended..");
	}
}