//WAP to create two threads one thread print EVEN NO number BETWEEN 1 to 20 and second thread print ODD number BETWEEN 1 TO 20
class ThreadX extends Thread
{
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println(+i);
			}
		}
	}
}
class ThreadY extends Thread
{
	public void run()
	{
		for(int j=1;j<=20;j++)
		{
			if(j%2!=0)
			{
				System.out.println("\t"+j);
			}
		}
	}
}

class EvenOddDemo
{
	public static void main(String args[])
	{
		ThreadX t1=new ThreadX();
		ThreadY t2=new ThreadY();
		System.out.println("EVEN\tODD");
		System.out.println("============");
		t1.start();
		t2.start();
	}
}