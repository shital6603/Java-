    
    /* Output:
            * * * * 
            * * * *
            * * * *
            * * * *
            * * * * 
    */
public class PatternEx1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {                    //loop for rows
            for (int j = 0; j < 4; j++) {                //loop for columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
