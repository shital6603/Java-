// Question : Swap two variables without using the third variable...

public class swappingTwoNumbers {
    public static void main(String[] args) {
        int firstNumber = 562;
        int secondNumber = 763;
        System.out.println("Value of firstNumber before swapping :"+firstNumber);
        System.out.println("Value of secondNumber before swapping :"+secondNumber);
        firstNumber = firstNumber + secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber = firstNumber - secondNumber;
        System.out.println("Value of firstNumber after swapping :"+firstNumber);
        System.out.println("Value of secondNumber after swapping :"+secondNumber);
    }
}
