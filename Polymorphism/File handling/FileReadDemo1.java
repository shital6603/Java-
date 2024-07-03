//write a java program to read contents of file(character oriented)

import java.io.*;

class FileReadDemo1
{
	public static void main(String args[])throws Exception
	{
		FileReader fr=new FileReader("nikita.txt");
		int c=0;
		while((c=fr.read())!=-1)
		{
			System.out.print((char)c);
		}
		fr.close();
	}
}