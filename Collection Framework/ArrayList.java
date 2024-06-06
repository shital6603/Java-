import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        ArrayList oobj = new ArrayList();
        oobj.add("Shital");
        oobj.add("Sanjay");
        oobj.add(56);
        oobj.add(6698);
        oobj.add(32);
        oobj.add(74);
        Iterator itr = oobj.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
