//Question : Check whether entered year is leap or not
import java.util.*;
public class YearIsLeapOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year :");
        int year=sc.nextInt();
        if(year % 4 == 0)
        {
            if (year% 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Year is leap year !!!");
                }
                else
                {
                    System.out.println("Not leap year !!!");
                }
            }
            else{
                System.out.println("Leap year !!");
            }
        }
        else{
            System.out.println("Year is not leap year !");
        }

    }
}
