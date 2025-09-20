package Primitive_Reference;

public class ReferenceExample {
    String name;

    public static void main(String[] args) {
        ReferenceExample a = new ReferenceExample();
        a.name = "Singh";
        System.out.println("Before Assign : " + a.name);

        ReferenceExample b = new ReferenceExample();
        a=b;
        b.name = "Tiwari";

        System.out.println("After Assign :" + a.name);
        System.out.println(b.name);
    }
}
