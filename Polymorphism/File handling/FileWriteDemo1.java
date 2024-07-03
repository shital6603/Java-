//write file

import java.io.*;

class FileWriteDemo1
{
	public static void main(String args[])throws Exception
	{
		FileWriter fw=new FileWriter("msbte.txt");
		String str="welcome in msbte";
		fw.write(str);
		System.out.println("file written successfully!!");
		fw.close();
	}
}