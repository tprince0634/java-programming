package Stream.Basics.Lambda;

import java.lang.classfile.Interfaces;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {


        //Functional interface
        Predicate<Integer> s = (a -> a %2 == 0);
        System.out.println(s.test(5));


        //Functional interface
        Function<Integer, String> iseven = (number) -> {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        };
            System.out.println(iseven.apply(2));
    }
}

