//creation of runnable by implementing runnable interface
class RunnableX implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("from RunnableX:i:"+i);
		}
	}
}
class RunnableY implements Runnable
{
	public void run()
	{
		for(int j=0;j<5;j++)
		{
			System.out.println("from RunnableY:j:"+j);
		}
	}
}
class RunnableZ implements Runnable
{
	public void run()
	{
		for(int k=0;k<5;k++)
		{
			System.out.println("from RunnableZ:k:"+k);
		}
	}
}
class RunnableDemo
{
	public static void main(String args[])
	{
		RunnableX r1=new RunnableX();
		RunnableY r2=new RunnableY();
		RunnableZ r3=new RunnableZ();
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		/*t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);*/

		t1.start();
		t2.start();
		t3.start();
	}
}