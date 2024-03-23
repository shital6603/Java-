public class sleepMethod extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Current Thread is" + Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws Exception {
        sleepMethod s1 = new sleepMethod();
        sleepMethod s2 = new sleepMethod();
        s1.start();
        s1.join();
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Current Thread is" + Thread.currentThread().getName() + " " + i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
