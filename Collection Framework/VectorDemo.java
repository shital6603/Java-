import java.util.Enumeration;
import java.util.Vector;

class VectorDemo {
    public static void main(String args[]) {
        Vector<Integer> vec = new Vector();
        vec.addElement(45);
        vec.addElement(145);
        vec.addElement(455);
        vec.addElement(453);
        vec.addElement(459);

        System.out.println(vec);

        Enumeration enume = vec.elements();
        while (enume.hasMoreElements()) {
            Integer data = (Integer) enume.nextElement();
            System.out.println(data);
        }
    }
}