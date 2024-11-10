import java.util.*;

class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(45);
        num.add(66);
        num.add(663);
        num.add(666);
        num.add(32);
        System.out.println(num);

        Iterator<Integer> itr = num.iterator();
        while (itr.hasNext()) {
            int data = itr.next();
            System.out.println(data);

        }
        int count = 0;

        ListIterator<Integer> itttrrrr = num.listIterator();
        System.out.println("this is listiterator");
        while (itttrrrr.hasNext()) {
            Integer next = itttrrrr.next();
            //System.out.println(next);
            count++;
            if (count == 2) {

                System.out.println("2 aa gya hai");
                while (itttrrrr.hasPrevious()) {
                    Integer previous = itttrrrr.previous();
                    System.out.println(previous);
                }
            }

        }

    }
}
