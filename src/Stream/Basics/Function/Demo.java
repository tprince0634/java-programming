package Stream.Basics.Function;

import java.util.List;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {


        Function<String,Integer> c = x -> x.length();
        System.out.println("The Third op is : " + c.apply("Apple"));


        Function<Integer,Integer> doubleit = x ->  x * 2;
        Function<Integer,Integer> tripleit =x ->  x * 3;
//        System.out.println(doubleit.apply(100));
        System.out.println(doubleit.andThen(tripleit).apply(20));
        System.out.println(doubleit.compose(tripleit).apply(10));


        List<String> name = List.of("Akbar", "Birbal", "Ranasanga");
        Function<String, Integer> NameLength = m -> m.length();
        for (String m : name) {
            System.out.println(NameLength.apply(m));
        }
//Identity static method
        Function<Integer, Integer> identity = Function.identity();
        System.out.println(identity.apply(5));


    }
}
