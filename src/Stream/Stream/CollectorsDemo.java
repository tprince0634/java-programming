package Stream.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // Provide a set of methods to create common collectors

        // 1) Collection to a List
        List<String> names = Arrays.asList("Alice", "Bob", "Roy", "Jonty");
        List<String> n = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());  // Collect into a List
        System.out.println(n);  // Output: [Alice]



        // 2) Collection to a Set
        List<Integer> numbers = Arrays.asList(9, 8, 7, 1, 2, 2, 2, 3, 4, 3, 4, 4, 5, 6, 7, 8, 9, 9);
        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());  // Collect into a Set
        System.out.println(set);   // Output: No duplicates, order not guaranteed.



        //4) Joining Strings
        String concatnames = names.stream().collect(Collectors.joining("8"));
        System.out.println(concatnames);



         //5) Summarizing Data
        //Generate Statistical  summary (count,sum,min,average,max)
        List<Integer> Num = Arrays.asList(1,2,3,4,5,6,9);
        IntSummaryStatistics sumrizing = Num.stream()
                .collect(Collectors.summarizingInt(x -> x));
               System.out.println(sumrizing);

        //6) Calculating Only Average
        Double Average = Num.stream()
                .collect(Collectors.averagingDouble(x -> x));
                 System.out.println(Average);

        //7) Grouping Element
        List<String> fruits = Arrays.asList("Banana","Mango","Apple","Kiwi","Coconut","Grapes");
        System.out.println(fruits.stream().collect(Collectors.groupingBy(x-> x.length())));
        System.out.println(fruits.stream().collect(Collectors.groupingBy(x-> x.length(), Collectors.counting())));

        //8)Partition Element (Based on Predicate)
        // Partition element in to two Groups(True or False)
        List<String> cities = Arrays.asList("Mumbai","Lucknow","Banaras","PrayagRaj","Mirzapur");
        System.out.println(cities.stream().collect(Collectors.partitioningBy(x-> x.length()>3 )));

        //9)Mapping and Collecting
        System.out.println(fruits.stream().collect(Collectors.mapping(x-> x.toUpperCase(),Collectors.toList())));










    }
}
