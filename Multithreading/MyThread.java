class MyThread1 extends Thread {
    public void run() {
        System.out.println("Hello from MyThread!");
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        thread.start();
    }
}