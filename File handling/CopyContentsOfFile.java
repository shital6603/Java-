//write a java program to copy contents of one file to another file(byte oriented)

import java.io.*;

class CopyContentsOfFile
{
	public static void main(String args[])throws Exception
	{
		FileInputStream fin=new FileInputStream("nikita.txt");
		FileOutputStream fout=new FileOutputStream("vjtech.txt");
		int c=0;
		while((c=fin.read())!=-1)
		{
			fout.write(c);
		}
		System.out.print("file contents copied successfully!!");
		fin.close();
	}
}