package Stream.Advance;
//Intermediate operations in Java Streams are operations that transform a stream into another stream.
// They are lazy, meaning they are not executed until a terminal operation is invoked on the stream.

import java.util.*;
import java.util.stream.*;

public class    IntermediateOperations {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. filter(Predicate<? super T> predicate)
        // Filters elements based on the condition
        List<Integer> filtered =
                 numbers.stream()
                .filter(x -> x > 5)
                .collect(Collectors.toList());
        System.out.println(filtered);                                  // Output: [6, 7, 8, 9, 10]




        // 2. map(Function<? super T, ? extends R> mapper)
        // Transforms each element of the stream
        List<Integer> mapped = numbers.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());
        System.out.println(mapped);                           // Output: [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        // 3. flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
        // Flattens nested streams into a single stream
        List<String> words = Arrays.asList("hello", "world");

        List<String> flattened = words.stream()
                .flatMap(w -> Arrays.stream(w.split("")))
                .collect(Collectors.toList());
        System.out.println(flattened);                    // Output: [h, e, l, l, o, w, o, r, l, d]

        // 4. distinct()
        // Removes duplicates from the stream
        List<Integer> distinctNumbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5).stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers); // Output: [1, 2, 3, 4, 5]

        // 5. sorted()
        // Sorts elements in natural order
        List<Integer> sorted = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // 6. sorted(Comparator<? super T> comparator)
        // Sorts elements according to the provided comparator
        List<Integer> reverseSorted = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // Output: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

        // 7. peek(Consumer<? super T> action)
        // Allows for side-effects without modifying the stream
        numbers.stream().peek(System.out::println).count(); // Output: prints numbers 1 to 10

        // 8. limit(long maxSize)
        // Limits the stream to the first n elements
        List<Integer> limited = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println(limited); // Output: [1, 2, 3]

        // 9. skip(long n)
        // Skips the first n elements in the stream
        List<Integer> skipped = numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println(skipped); // Output: [6, 7, 8, 9, 10]


    }
}
