package Stream.Advance;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {

                List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

                // 1. forEach(Consumer<? super T> action)
                // Performs the given action for each element in the stream
                numbers.stream().forEach(System.out::println);
                // Output: prints numbers 1 to 10


                // 2. collect(Collector<? super T, A, R> collector)
                // Collects the stream into a collection or other form
                List<Integer> collected = numbers.stream().collect(Collectors.toList());
                System.out.println(collected); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

                // 3. reduce(BinaryOperator<T> accumulator)
                //combine element to produce single Output
                Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
                sum.ifPresent(System.out::println);    // Output: 55 (sum of 1 to 10)

                // 4. reduce(T identity, BinaryOperator<T> accumulator)
                // Performs a reduction with an identity value
                int product = numbers.stream().reduce(1, (a, b) -> a * b);
                System.out.println(product); // Output: 3628800 (product of 1 to 10)

                // 5. count()
                // Returns the number of elements in the stream
                long count = numbers.stream().count();
                System.out.println(count); // Output: 10

                // 6. anyMatch(Predicate<? super T> predicate)
                // Returns true if any element matches the given predicate
                boolean anyMatch = numbers.stream().anyMatch(x -> x > 5);
                System.out.println(anyMatch); // Output: true (because there are numbers > 5)

                // 7. allMatch(Predicate<? super T> predicate)
                // Returns true if all elements match the given predicate
                boolean allMatch = numbers.stream().allMatch(x -> x > 0);
                System.out.println(allMatch); // Output: true (all numbers are > 0)

                // 8. noneMatch(Predicate<? super T> predicate)
                // Returns true if no element matches the given predicate
                boolean noneMatch = numbers.stream().noneMatch(x -> x < 0);
                System.out.println(noneMatch); // Output: true (because there are no negative numbers)

                // 9. findFirst()
                // Returns the first element of the stream
                Optional<Integer> first = numbers.stream().findFirst();
                first.ifPresent(System.out::println); // Output: 1 (first element in the stream)

                // 10. findAny()
                // Returns any element from the stream (could be any element, not necessarily the first)
                Optional<Integer> any = numbers.stream().findAny();
                any.ifPresent(System.out::println); // Output: 1 (since the stream is ordered)

                // 11. max(Comparator<? super T> comparator)
                // Returns the maximum element according to the given comparator
                 Optional<Integer> max = numbers.stream().max(Comparator.naturalOrder());
             //  max.ifPresent(System.out::println); // Output: 10 (maximum number)
                  System.out.println(max.get());

                // 12. min(Comparator<? super T> comparator)
                // Returns the minimum element according to the given comparator
                Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
                min.ifPresent(System.out::println); // Output: 1 (minimum number)

                // 13. toArray()
                // Converts the stream to an array
                Integer[] array = numbers.stream().toArray(Integer[]::new);
                System.out.println(Arrays.toString(array)); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

                // 14. sum()
                // Returns the sum of all elements (for numeric types)
                 Integer i = numbers.stream().reduce(Integer::sum).get();
                 System.out.println(i); // Output: 55 (sum of 1 to 10)


                // 15. average()
                // Returns the average of the elements (for numeric types)
                OptionalDouble average = numbers.stream().mapToInt(x-> x).average();
                average.ifPresent(System.out::println);  // Output: 5.5 (average of 1 to 10)

                // 16. join(CharSequence delimiter)
                // Concatenates the elements into a single string with the given delimiter
                String joined = numbers.stream().map(x->String.valueOf(x)) .collect(Collectors.joining(", "));
                System.out.println(joined); // Output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
                // String.valueOf(x) => It takes each element x from the stream and converts it to a String using String.valueOf(x).



                // 17. groupingBy(Function<? super T, ? extends K> classifier)
                // Groups the elements of the stream by a classifier function,
               // allowing you to create multiple groups based on a custom criterion.
                Map<Boolean, List<Integer>> grouped = numbers.stream()
                        .collect(Collectors.groupingBy(x -> x % 2 == 0));
                System.out.println(grouped); // Output: {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}


                // 17.1)
                List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear", "grape", "plum");
                Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(x -> x.length()));
                System.out.println(collect);


                // 17.2)
                List<String> names = Arrays.asList("Alice", "David", "Eve","Charlie", "Bob");
                Map<Boolean, List<String>> a = names.stream()
                .collect(Collectors.groupingBy(name -> name.contains("a")));
                System.out.println(a);




                // 18. partitioningBy(Predicate<? super T> predicate)
                // Partitions the elements of the stream into only two groups based on the predicate
                Map<Boolean, List<Integer>> partitioned = numbers.stream()
                        .collect(Collectors.partitioningBy(x -> x % 2 == 0));
                System.out.println(partitioned); // Output: {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}
            }
        }


