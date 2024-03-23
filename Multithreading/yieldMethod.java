class yieldMethod extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String args[]) {
        yieldMethod t1 = new yieldMethod();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}