package Stream.Advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;



//How it is useful and reducing the Extra work , what are the basic Benefits of streams



public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        int count = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even using for loop: " + count);



        long count1 = numbers.stream()
                .filter(x -> x % 2 == 0).count();
        System.out.println("Even using for Streams: " + count1);

//----------------------------------------------------------------------------------------------------------------------------
        int sum = 0;
        for (int d : numbers) {
            sum = sum + d;
        }
        System.out.println("Sum using Old ways " + sum);

//  To addition
        Integer reduce = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println("Sum Using Stream " + reduce);  // Output: 15


//To find max
        Integer i = numbers.stream()
                .reduce((a, b) -> a > b ? a : b)
                .orElseThrow();
        System.out.println(i);


        int max = numbers.stream()
                .max(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println(max);
//------------------------------------------------------------------------------------------------------------





    }
}