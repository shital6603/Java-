
abstract class Vehicle {
    abstract void engine();

}

class BMW extends Vehicle {
    public void engine() {
        System.out.println("This is BMW engine !!");
    }
}

class Tata extends Vehicle {
    public void engine() {
        System.out.println("This is Tata engine !!");
    }
}

class AbstractClass2 {
    public static void main(String[] args) {
        Vehicle vv = new BMW();
        vv.engine();

        Vehicle bb = new Tata();
        bb.engine();
    }
}