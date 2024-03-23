class Medical extends Thread {
    public void run() {
        try {
            System.out.println("Medical starts!!!");
            sleep(1000);
            System.out.println("Medical Ends !!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class TestDrive extends Thread {
    public void run() {
        try {
            System.out.println("Medical starts!!!");
            sleep(1000);
            System.out.println("Medical Ends !!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class OfficerSign extends Thread {
    public void run() {
        try {
            System.out.println("Officer takes file!!!");
            sleep(1000);
            System.out.println("Signing process done !!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ShowingSleepMethod {
    public static void main(String[] args) throws Exception {
        Medical m1 = new Medical();
        TestDrive t1 = new TestDrive();
        OfficerSign o1 = new OfficerSign();
        m1.start();
        m1.sleep(2000);
        t1.start();
        t1.sleep(2000);
        Thread.sleep(1000);
        o1.start();

    }
}
