public class ExceptionHandlingBasic {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        /*
         * int c = a / b; // will thwrow the exception need to handle it
         * System.out.println(c);
         */
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero error !!");
        }
    }
}
