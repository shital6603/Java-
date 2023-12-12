//define a exception called "no match exception" that is thrown when a string is not equal to "MSBTE"

import java.util.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
class UserDefinedExceptionDemo3
{
	public static void main(String args[])
	{
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your sting:");
		str=sc.next();
		
		if(str.equals("MSBTE"))
		{
			System.out.println("STRING MATCH!!");
		}
		else
		{
			try
			{
				throw new MyException("No Match Exception");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}			
	}
}