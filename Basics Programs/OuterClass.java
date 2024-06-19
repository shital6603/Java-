

class xyz{
    static int dhannnu=10;
    int shit=70;

    public void method1()
    {
        System.out.println(dhannnu);
    }
}
public class OuterClass extends xyz{

    static int a = 10;
    int b = 90;

    public static void display() {
        System.out.println(a);
        // System.out.println(b);
    }

    static class Inner {
        void inner() {
            System.out.println("this is constructor of inner class...");
            System.out.println("Value of a from inner class " + a);
            // System.out.println(b);
        }
    }

    public void meth() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(dhannnu);
        System.out.println(shit);
    }

    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();
        OuterClass.Inner obj = new OuterClass.Inner();
        System.out.println();
        obj.inner();
        System.out.println(OuterClass.a);
        System.out.println(obj1.b);

    }
}





/* Note:       Non-static methods or classes can access static and non-static both type of variables.
               But static method or class can only access static variables or methods. */