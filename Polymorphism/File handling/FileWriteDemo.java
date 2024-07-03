//write file

import java.io.*;

class FileWriteDemo
{
	public static void main(String args[])throws Exception
	{
		FileOutputStream fout=new FileOutputStream("msbte.txt");
		String str="welcome in msbte";
		byte b[]=str.getBytes();
		fout.write(b);
		System.out.println("file written successfully!!");
		fout.close();
	}
}