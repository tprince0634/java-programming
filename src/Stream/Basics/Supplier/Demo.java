package Stream.Basics.Supplier;

import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Supplier<String> s = () -> "No input only Output";
        System.out.println(s.get());

    }
}
