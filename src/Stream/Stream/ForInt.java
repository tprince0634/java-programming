package Stream.Stream;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ForInt {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);
        System.out.println(IntStream.range(1,5).boxed().toList());  //boxed convert in wrapper class
        System.out.println(IntStream.rangeClosed(1,5).boxed().toList());

        IntStream.of(1,2,3);

        DoubleStream doubles = new Random().doubles(5);
      //  System.out.println( doubles.sum());
      //  System.out.println(doubles.max());
      //  System.out.println(doubles.average());
        System.out.println(doubles.min());


    }
}
