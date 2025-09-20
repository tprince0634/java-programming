package Stream.Advance;

import java.lang.classfile.attribute.InnerClassesAttribute;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WaysofCreatingStreams {
    public static void main(String[] args) {
        //Way1   using List
        List<Integer> num = List.of(1,2,3,4,5);
        num.stream();

        List<Integer> num2 = Arrays.asList(1,2,3,4,5);
        num2.stream();

        //Way2 Using Array
        String [] Arr = {"A","B","C","D"};
        Arrays.stream(Arr);


        //Way 3 Stream.of
        Stream<Integer> integerStream = Stream.of(1, 2, 4, 5, 6);

        //Way 4 Infinite Stream
        Stream<Integer> limit = Stream.generate(() -> 1).limit(10);

        // Infinite Stream with iterate (creates an increasing sequence)
        Stream.iterate(1, x -> x + 1)  // Infinite sequence of integers
                .limit(10)  // Limit to 10 elements
                .forEach(System.out::println);  // Output: 1, 2, 3, 4, ..., 10


    }
}
