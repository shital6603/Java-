import java.util.*;

public class NofixedLengthArray {
    public static void main(String[] args) {
        int arr[][] = new int[5][];


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
