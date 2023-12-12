
import java.io.*;

class FileDemo
{
	public static void main(String args[])throws Exception
	{
		File f1=new File("C:/java/File handling","vjtech.txt");
		System.out.println("File Name="+f1.getName());
		System.out.println("Parent Name="+f1.getParent());
		if(f1.exists()==true)
		{
			System.out.println("File is found");
			System.out.println("Path="+f1.getPath());
			System.out.println("Can Read="+f1.canRead());
			System.out.println("Can Write="+f1.canWrite());
		}
		else
		{
			System.out.println("File not found");
			f1.createNewFile();
			System.out.println("new file created!!");
			File f2=new File("C:/java/File handling/Maharashtra");
			f2.mkdir();
			System.out.println("directory created!!");
		}
	}
}