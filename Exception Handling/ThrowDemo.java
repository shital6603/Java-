//use of throw kewword
class ThrowDemo
{
	void validate(int age)
	{
		if(age<18)
		{
			try
			{
				throw new ArithmeticException("Not valid age for voting");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("You are eligible for voting");
		}
	}
	public static void main(String args[])
	{
		ThrowDemo d1=new ThrowDemo();
		d1.validate(15);
	}
}