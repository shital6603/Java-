//Question : Adding 1 to integer using bit manipulation

public class adding1usingBitManipulation {

        public static void main(String[] args) {
          int firstValue = 10;
          int secondValue = ~firstValue + 1;
          System.out.println(secondValue);
        }
}
