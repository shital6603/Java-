/*         Output:

                *
              *   *
            *   *   * 
          *   *   *   *
        *   *   *   *   *    
        
 */
class PatternEx5
{
    public static void main(String[] args) {
      int a=5;
        for (int i = 1; i <= a ; i++) {
            for (int j = 1; j <= a-i ; j++) {
                System.out.print(" ");
              }
              for (int j = 1; j <=i ; j++) {
              System.out.println("*");
              }
              
              System.out.println();
        }
    }
}