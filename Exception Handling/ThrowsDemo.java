
class ThrowsDemo
{
	void myMethod(int num) throws Exception
	{
		if(num==1)
		{
			throw new ArithmeticException("ArithmeticException occured");
		}
		else
		{
			throw new NullPointerException("NullPointerException occured");
		}
	}
	public static void main(String args[])
	{
		ThrowsDemo obj=new ThrowsDemo();
		try
		{
			obj.myMethod(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}