//write a java program that will count no of Alphabet 'o' present in file

import java.io.*;

class CountAlphabetsInFile
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("nikita.txt");
		int c,count=0;
		while((c=fin.read())!=-1)
		{
			char ch=(char)c;
			if(ch=='o')
			{
				count++;
			}
		}
		System.out.print("No of 'o' characters present in file="+count);
		fin.close();
	}
}