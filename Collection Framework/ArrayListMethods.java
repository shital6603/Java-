import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> oobj = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>(20);
        System.out.println("Initial capacity of ArrayList " + arr.size());
        /*
         * oobj.add("Shital");
         * oobj.add("Sanjay");
         */
        /*
         * oobj.add(56);
         * oobj.add(6698);
         * oobj.add(32);
         * oobj.add(74);
         */
        System.out.println(oobj);
        for (int i = 0; i <= 5; i++) {
            arr.add(i);
        }
        Iterator itr = arr.iterator();
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Size :" + arr.size());
    }
}
