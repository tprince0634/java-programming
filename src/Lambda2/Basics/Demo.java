package Lambda2.Basics;
/*
 (parameters) -> {

 }
*/


@FunctionalInterface
interface A {
    void show();
}

public class Demo {
    public static void main(String[] args) {
        A a = () -> System.out.println("This is a lambda");
        a.show();
    }
}
