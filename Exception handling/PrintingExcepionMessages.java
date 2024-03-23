public class PrintingExcepionMessages {
    public static void main(String[] args) {
        try {
            int a = 100;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Way 1 :");
            e.printStackTrace(); // way 1
            System.out.println("\nWay 2 : " + e.toString()); // way2
            System.out.println("\nWay 3 : " + e.getMessage()); // way3
        }
        System.out.println("Normal termination of the program !");
    }
}