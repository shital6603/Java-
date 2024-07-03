//write a java program to read contents of file(byte oriented)

import java.io.*;

class FileReadDemo
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("nikita.txt");
		int c=0;
		while((c=fin.read())!=-1)
		{
			System.out.print((char)c);
		}
		fin.close();
	}
}