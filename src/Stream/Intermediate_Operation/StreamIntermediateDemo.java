package Stream.Intermediate_Operation;

import java.util.Arrays;
import java.util.List;

public class StreamIntermediateDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Prince", "Ram", "Shyam", "Prince",
                "Amit", "Ravi", "Karan"
        );

        names.stream()

                // filter() -> keeps only elements matching the condition
                .filter(name -> name.length() > 4)

                // peek() -> used for debugging, prints elements flowing through stream
                .peek(name -> System.out.println("After peak Filter: " + name))

                //  map() -> transforms each element
                // .map(String::toUpperCase)
                .map(name -> name.toUpperCase())

                // distinct() -> removes duplicate elements
                .distinct()

                // sorted() -> sorts elements in natural order
                .sorted()

                // skip() -> skips first N elements
                .skip(1)

                // limit() -> takes only first N elements
                .limit(3)

                // terminal operation
                .forEach(System.out::println);


        // flatMap() Example
        List<List<String>> data = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D")
        );

        data.stream()

                // flatMap() -> converts Stream<List<String>>
                // into Stream<String>
                .flatMap(list -> list.stream())

                .forEach(System.out::println);
    }
}