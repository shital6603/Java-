import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(45);
        ts.add(78);
        ts.add(65);
        ts.add(34);
    
        ts.remove(45);
        System.out.println(ts);

    }
}