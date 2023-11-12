import java.util.*;
class ArrayOfString
{
    public static void main(String[] args) {
        Scanner scobj=new Scanner(System.in);
        String[] string1=new String[10];
        for (int noOfString = 0; noOfString < 5; noOfString++) {
            string1[noOfString]=scobj.next();
        }
        System.out.println("The elements of the string :");
        for (int noOfString = 0; noOfString < 5; noOfString++) {
            System.out.println(string1[noOfString]);
        }
    }
}