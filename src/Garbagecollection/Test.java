package Garbagecollection;

class Test {
    protected void finalize() {
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1 = t2;                   // The first Test object is now unreachable
        System.gc();
    }
}
