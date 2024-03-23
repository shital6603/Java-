public class DemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " thread is running");
    }

    public static void main(String[] args) {
        DemonThread t1 = new DemonThread();
        DemonThread t2 = new DemonThread();
        DemonThread t3 = new DemonThread();
        t1.setDaemon(true);
        System.out.println(Thread.currentThread().getName() + " is running ");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(t1.isDaemon());
    }
}
