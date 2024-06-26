import javax.swing.table.AbstractTableModel;

abstract class addition {
    abstract void add_num();
}

abstract class subtraction extends addition {
    void add_num() {
        System.out.println("Addition method!!");
    }

    abstract void sub_num();
}

public class AbstractClass extends subtraction {
    void sub_num() {
        System.out.println("Subtraction method ");
    }

    public static void main(String[] args) {
        AbstractClass c1 = new AbstractClass();
        c1.sub_num();
        c1.add_num();
    }
}
