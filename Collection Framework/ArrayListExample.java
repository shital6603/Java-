import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<String>> ss = new ArrayList<>();
        for (int i = 0; i < ss.size(); i++) {
            ss.add(new ArrayList<>());
        }
        for (int i = 0; i < ss.size(); i++) {
            for (int j = 0; j < ss.size(); j++) {
                ss.get(i).add(sc.next());
            }
        }
        for (int i = 0; i < ss.size(); i++) {
            System.out.println(ss.get(i).toString());
        }
    }
}
