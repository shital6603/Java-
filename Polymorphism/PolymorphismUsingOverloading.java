public class PolymorphismUsingOverloading {
    void show(int a) {
        System.out.println("This is show method of Integer type !!");
    }

    void show() {
        System.out.println("This is show method of no wrguments !!!");
    }

    public static void main(String[] args) {
        PolymorphismUsingOverloading p1 = new PolymorphismUsingOverloading();
        p1.show();
        p1.show(12);
    }
}
