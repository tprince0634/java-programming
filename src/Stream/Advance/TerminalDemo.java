package Stream.Advance;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class TerminalDemo {
    public static void main(String[] args) {

//        List
        List<Integer> A = Arrays.asList(2,3,4,5,6,7);
        List<Integer> collect = A.stream().collect(Collectors.toList());
        System.out.println(collect);

//      foreach   Performs an action for each element of this stream.
       A.stream().forEach(x-> System.out.println(x));

//       reduce combine element to produce single Output
        Optional<Integer> reduce = A.stream().reduce((a, b) -> a * b);
        System.out.println(reduce.get());

        List<Integer> list = List.of(); // empty list
        int result2 = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(result2); // prints 1

//       5. count()   Returns the number of elements in the stream
        long count = A.stream().count();
        System.out.println(count); // Output: 10

        // 6. anyMatch(Predicate<? super T> predicate)
        // Returns true if any element matches the given predicate
        boolean anyMatch = A.stream().anyMatch(x -> x > 5);
        System.out.println(anyMatch); // Output: true (because there are numbers > 5)

        // 7. allMatch(Predicate<? super T> predicate)
        // Returns true if all elements match the given predicate
        boolean allMatch = A.stream().allMatch(x -> x > 0);
        System.out.println(allMatch); // Output: true (all numbers are > 0)

        // 8. noneMatch(Predicate<? super T> predicate)
        // Returns true if no element matches the given predicate
        boolean noneMatch = A.stream().noneMatch(x -> x < 0);
        System.out.println(noneMatch); // Output: true (because there are no negative numbers)

        // 9. findFirst()
        // Returns the first element of the stream
        Optional<Integer> first = A.stream().findFirst();
        System.out.println(first.get());
        Optional<Integer> firstany = A.stream().findAny();
        System.out.println(firstany.get());

//      11. max(Comparator<? super T> comparator)
        // Returns the maximum element according to the given comparator
        Optional<Integer> max = A.stream().max(Comparator.naturalOrder());
        //  max.ifPresent(System.out::println); // Output: 10 (maximum number)
        System.out.println(max.get());

        // 12. min(Comparator<? super T> comparator)
        // Returns the minimum element according to the given comparator
        Optional<Integer> min = A.stream().min(Comparator.naturalOrder());
        min.ifPresent(System.out::println); // Output: 1 (minimum number)

        // 14. sum()
        // Returns the sum of all elements (for numeric types)
        Integer i = A.stream().reduce(Integer::sum).get();
        System.out.println(i); // Output: 55 (sum of 1 to 10)


//     17. groupingBy(Function<? super T, ? extends K> classifier)
        // Groups the elements of the stream by a classifier function,
        // allowing you to create multiple groups based on a custom criterion.
        Map<Boolean, List<Integer>> grouped = A.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0));
        System.out.println(grouped); // Output: {false=[1, 3, 5, 7, 9], true=[2, 4, 6, 8, 10]}


//      17.1
        List<String> words = Arrays.asList("apple", "banana", "kiwi", "pear", "grape", "plum");
        Map<Integer, List<String>> collect6 = words.stream().collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collect6);

//       17.2
        List<String> names = Arrays.asList("Alice", "David", "Eve","Charlie", "Bob");
        Map<Boolean, List<String>> a = names.stream()
                .collect(Collectors.groupingBy(name -> name.contains("a")));
        System.out.println(a);

    }


}
