// Printing Days According to the Numbers using switch case Ex: 1 - Sunday, 2 - Monday, 3 - Tuesday, etc.
import java.util.Scanner;

public class CheckingDaysBasedOnNumbers {
    public static void main(String[] args) {
        Scanner scobj=new Scanner(System.in);
        int choice=scobj.nextInt();
        switch (choice) {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thursday");
                break;
                case 6:
                System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
                break;
            default:
                break;
        }
    }
}
