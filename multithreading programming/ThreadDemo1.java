public class ThreadDemo1 extends Thread
{
    public void run(String name)
    {
        System.out.println("Executing:"+name);
    }
    public static void main(String args[])
    {
        ThreadDemo t=new ThreadDemo("Thread 1");
        ThreadDemo t1=new ThreadDemo("Thread 2");

        t.start();
        t1.start();

    }
}