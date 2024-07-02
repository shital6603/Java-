/*     - Following is the code for Polymorphism using method overloading in java
    - Method overloading also known as compile time polymorphism */

public class AutomaticPromotioninPolymorphism {

    void functionOne() 
    {
        System.out.println("No argument !!!");
    }
    void functionOne(int a) 
    {
        System.out.println("Integer argument !!!");
    }
    void functionOne(float a) 
    {
        System.out.println("Integer argument !!!");
    }
    void functionOne(String a) 
    {
        System.out.println("Integer argument !!!");
    }

    void functionOne(int... a) 
    {
        System.out.println("Many arguments at same time method !!!");
    }
    public static void main(String[] args)
    {
        AutomaticPromotioninPolymorphism p1 = new AutomaticPromotioninPolymorphism();
        p1.functionOne();
        p1.functionOne(10);
        p1.functionOne("This is String ");
        p1.functionOne(10.5f);
        p1.functionOne(10, 20, 30, 40, 50);
    }
}
