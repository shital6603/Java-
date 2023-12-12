//WAP to create two threads one thread print number from 1 to 100 and second thread print number from 100 to 1
class ThreadX extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(+i);
		}
	}
}
class ThreadY extends Thread
{
	public void run()
	{
		for(int j=100;j>=1;j--)
		{
			System.out.println("\t"+j);
		}
	}
}

class MainThreadclassDemo
{
	public static void main(String args[])
	{
		ThreadX t1=new ThreadX();
		ThreadY t2=new ThreadY();
		t1.start();
		t2.start();
	}
}