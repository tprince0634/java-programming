package Stream.Basics.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * @FunctionalInterface
 * public interface Consumer<T> {
 *     void accept(T t);
 * }
 *
*/

/*In Java Streams, a Consumer is a functional interface that represents an operation that takes
 an input and returns nothing.
 It’s usually used to perform side effects, like printing or logging.*/

public class Demo {
    public static void main(String[] args) {


        List<String> names = List.of("Akbar", "Birbal", "Ranasanga");

        Consumer<String> pl = (name -> System.out.println(name));
        names.stream().forEach(pl);

//      names.stream().forEach(name-> System.out.println(name));


    }
}
