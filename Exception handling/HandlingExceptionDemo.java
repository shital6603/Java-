public class HandlingExceptionDemo {
    public static void main(String[] args) {
        HandlingExceptionDemo demo = new HandlingExceptionDemo();
        demo.divide();
    }

    void divide() {
        try {
            int a = 100;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Normal Termination of Program !!");
    }
}
