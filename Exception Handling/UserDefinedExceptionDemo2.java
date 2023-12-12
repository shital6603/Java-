//write a program to accept a password from the user and throw "authentication failure" exception if the password is incorrect

import java.util.*;
class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
}
class UserDefinedExceptionDemo2
{
	public static void main(String args[])
	{
		String password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password:");
		password=sc.next();
		
		if(password.equals("NIKITA"))
		{
			System.out.println("LOGIN SUCCESSFULLY!!");
		}
		else
		{
			try
			{
				throw new MyException("authentication failure");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}			
	}
}