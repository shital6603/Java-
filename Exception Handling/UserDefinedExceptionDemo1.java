//write a program to input name and balance of customer and throw a user defined exception if balance less than 1500

import java.util.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
class UserDefinedExceptionDemo1
{
	public static void main(String args[])
	{
		String name;
		int balance;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name:");
		name=sc.next();
		System.out.println("Enter Customer Balance:");
		balance=sc.nextInt();
		
		if(balance<1500)
		{
			try
			{
				throw new MyException("Your balance less than 1500!!");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else
		{
			System.out.println("no exception occured");
		}			
	}
}