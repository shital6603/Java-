class ExceptionDemo4
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
		catch(Exception e)
		{
			System.out.println("exception occured!!"+e);
		}
			System.out.println("Program execution ended..");
	}
}