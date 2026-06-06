package Stream.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateDemo {
    public static void main(String[] args) {

//Filter
        List<String> students = Arrays.asList("Anchal", "Radha", "Saba", "Anushka");
        List<String> collect = students.stream()
                .filter(x -> x.startsWith("An"))
                .filter(x-> x.contains("u"))
                .collect(Collectors.toList());// Start with "An"
        System.out.println(collect);

        List<Integer> num = List.of(1,2,34,5,6,7,8,900,7);
         long collect1 = num.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.println("This if flter operation " + collect1);



//Map(function)
        List<String> collect2 = students.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("This is Map Operation " + collect2 );

        List<Integer> Salary = List.of(20000,40000,50000,60000);
        List<Integer> collect3 = Salary.stream()
                .map(x -> x + 5000)
                .collect(Collectors.toList());
        System.out.println("This is  Also Map Operation " + collect3);

// Sorted
        List<Integer> num2 = List.of(3,5,6,8,9,0,4,2,4,6,74,3,2,3,100);
        List<Integer> collect4 = num2.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Narural Order using Sorted operation " + collect4);

//  Distinct
        List<Integer> collect5 = num2.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect5);


//  Limit
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> limitedList = numbers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(limitedList);               // Output: [1, 2, 3]

//    Skip
        List<Integer> collect6 = numbers.stream()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("Skip the 3 Element"  + collect6);

        System.out.println(Stream.generate(() -> 1).skip(10).limit(20));
        System.out.println(Stream.iterate(1,x-> x + 1).skip(10).limit(30));
    }
}
