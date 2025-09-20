package Stream.Basics;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CommonExample {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x-> x%2 == 0;
        Function<Integer,Integer> function = x -> x*2;
        Consumer<Integer> consumer = x-> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;
//      Supplier<Integer> supplier =() -> 101;

        if(predicate.test(supplier.get())){    //False to no op
            consumer.accept(function.apply(supplier.get()));
        }

    }
}
