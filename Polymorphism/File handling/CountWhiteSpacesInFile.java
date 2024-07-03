//write a java program that will count no of white spaces present in file

import java.io.*;

class CountWhiteSpacesInFile
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("nikita.txt");
		int c,count=0;
		while((c=fin.read())!=-1)
		{
			char ch=(char)c;
			if(ch==' ')
			{
				count++;
			}
		}
		System.out.print("No of white spaces present in file="+count);
		fin.close();
	}
}