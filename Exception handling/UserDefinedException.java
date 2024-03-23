import java.util.Scanner;

class UnderAgeException extends RuntimeException {
    UnderAgeException(String message) {
        super(message);
    }

    UnderAgeException() {
        super("You are not eligible ha ha ha ha!!");
    }
}

class UserDefinedException {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age :");
        age = sc.nextInt();
        try {
            if (age < 18) {
                throw new UnderAgeException();
            } else {
                System.out.println("You are eligible for voting !!");
            }
        } catch (UnderAgeException ae) {
            ae.printStackTrace();
        }
        System.out.println("Normal execution termination !");
    }
}
