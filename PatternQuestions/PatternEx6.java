
/*     

    Code to print Following Pattern: 
            *
           ** 
          *** 
         **** 
        ***** 

 */

import java.util.*;

public class PatternEx6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no_of_rows = scan.nextInt();
        for (int i = 1; i <= no_of_rows; i++) {
            for (int j = 1; j <= no_of_rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
