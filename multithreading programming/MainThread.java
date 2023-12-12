//creation of thread by extending thread
class ThreadX extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("from threadX class:i:"+i);
		}
	}
}
class ThreadY extends Thread
{
	public void run()
	{
		for(int j=0;j<5;j++)
		{
			System.out.println("from threadY class:j:"+j);
		}
	}
}
class ThreadZ extends Thread
{
	public void run()
	{
		for(int k=0;k<5;k++)
		{
			System.out.println("from threadX class:k:"+k);
		}
	}
}
class MainThread
{
	public static void main(String args[])
	{
		ThreadX t1=new ThreadX();
		ThreadY t2=new ThreadY();
		ThreadZ t3=new ThreadZ();
		t1.start();
		t2.start();
		t3.start();
	}
}