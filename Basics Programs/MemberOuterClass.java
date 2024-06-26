public class MemberOuterClass {
    int a=40;
    static int b=50;
    private int sh=80;
    void outermethod()
    {
        System.out.println("Method of outer class");
    }
    class Inner
    {
        void show()
        {
            System.out.println("Inner class method !!!");
            System.out.println(a);
            System.out.println(b);
            System.out.println(sh);
        }
    }

    public static void main(String args[])
    {
        MemberOuterClass obj1=new MemberOuterClass();
        obj1.outermethod();

        MemberOuterClass.Inner obj2=obj1.new Inner();
        obj2.show(); 
    }
}
