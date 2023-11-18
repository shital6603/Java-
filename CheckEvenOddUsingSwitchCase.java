import java.util.*;
class CheckEvenOddUsingSwitchCase{
    public static void main(String[] args) {
        Scanner scobj=new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scobj.nextInt();
        int remainderOfNumber=number%2;
        switch (remainderOfNumber) {
            case 0:
            System.out.println("Number is Even !!");
                break;
            case 1:
                System.out.println("Number is Odd !!");
            default:
                break;
        }
    }
}