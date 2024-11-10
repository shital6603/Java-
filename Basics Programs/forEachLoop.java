import java.util.*;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * int[] arr = { 1, 2, 3, 4, 5 };
         * for (int num : arr) {
         * System.out.println(num);
         * }
         * System.out.println("-----------------------------------------");
         * System.out.println("-----------------------------------------");
         * System.out.println(Arrays.toString(arr));
         * System.out.println("kmdkuhfbfrnlkdclmlcdfndffnllkvdlkldlkfdnlknfdjffn");
         * System.out.println("-----------------------------------------");
         */
        int[][] arrex = new int[2][3];
        for (int row = 0; row < arrex.length; row++) {
            for (int col = 0; col < arrex[row].length; col++) {
                arrex[row][col] = sc.nextInt();
            }
        }
        System.out.println("------------------ Printing an array -------------------");
        /*
         * for (int row = 0; row < arrex.length; row++) {
         * for (int col = 0; col < arrex[row].length; col++) {
         * System.out.print(arrex[row][col] + " ");
         * }
         * System.out.println();
         * }
         */
        for (int row = 0; row < arrex.length; row++) {
            System.out.println(Arrays.toString(arrex[row]));
        }

        System.out.println("------------------ Using foreach loop -----------------");

        for (int[] num : arrex) {
            System.out.println(Arrays.toString(num));
        }

        
    }
}
