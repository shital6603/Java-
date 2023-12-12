//by extending thread class 

class ThreadX extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(+i);
		}
	}
}
class ThreadY extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++ )
		{
			System.out.println("\t"+j);
		}
	}
}

class ThreadDemo
{
	public static void main(String args[])
	{
		ThreadX t1=new ThreadX();
		ThreadY t2=new ThreadY();
		t1.start();
		t2.start();
	}
}