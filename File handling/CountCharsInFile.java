//write a java program that will count no of characters present in file

import java.io.*;

class CountCharsInFile
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("nikita.txt");
		int c,count=0;
		while((c=fin.read())!=-1)
		{
			count++;
		}
		System.out.print("No of characters present in file="+count);
		fin.close();
	}
}