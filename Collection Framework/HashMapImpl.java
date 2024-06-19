import java.util.*;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap();

        hm.put(101, "deepak");
        hm.put(109, "amit");
        hm.put(103, "rahul");
        hm.put(104, "kamala");

        hm.put(105, "ravi");

        System.out.print(hm);
        System.out.println();
        Set set = hm.entrySet();
        System.out.println(set);
        hm.remove(109);
        System.out.println(hm);
        System.out.println(hm.containsKey(103));
        System.out.println(hm.containsValue("kamala"));
        System.out.println(hm.get(104));
        System.out.println(hm.get(333));
        System.out.println(hm.isEmpty());
        hm.replace(104,"aaaa");
        System.out.println(hm);
        System.out.println(hm.size());

        /*
         * Iterator itr=set.iterator();
         * while(itr.hasNext())
         * {
         * System.out.println(itr.next());
         * Map.Entry entry = (Map.Entry)itr.next();
         * System.out.println(entry.getKey()+"->"+entry.getValue());
         * }
         */
        /*
         * for (Map.Entry me: hm.entrySet()) {
         * System.out.println(me.getKey()+"->"+me.getValue());
         * }
         */

    }
}
