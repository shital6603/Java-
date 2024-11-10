class Test {
    String name = "Ashwani";

    public void display() {
        System.out.println("Name :" + name);
    }
}

public class ModifierExample {
    public static void main(String[] args) {
        Test vv = new Test();
        vv.display();
        System.out.println(Test.name);
    }
}
