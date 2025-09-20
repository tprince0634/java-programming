package Generic2.Bounded.MultipleBounds;

interface printable {
    void print();
}



public class MyNumber extends Number implements printable {

    private int value = 42;          // Add a field to make it meaningful

    @Override
    public void print() {
        System.out.println("This is from the interface");
        System.out.println("Value: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}


// Class using multiple bounds (Number + printable)
class Boxx <T extends Number & printable> {
    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void show() {
        item.print();
        System.out.println("Double value: " + item.doubleValue());
    }
}

// Test class
class Test {
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber();

        Boxx<MyNumber> box = new Boxx<>(myNumber);  // ✅ Initialization with value
        box.show();                                 // ✅ Call method to show functionality
    }
}
