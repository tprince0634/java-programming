package Stream.Advance;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,8,7,4,5);
        Optional<Integer> max = list.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());
        Optional<Integer> min = list.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());


//        List<Integer> list1 = list.stream().min((a, b) -> b + a).stream().toList();
//        List<Integer> list1 = list.stream()
//                .min(Integer::compareTo)
//                .stream().toList();
//        System.out.println(list1);


        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Accumulating sum of the numbers using reduce with parallel stream
        int sum = list2.parallelStream()
                .reduce(0,Integer::sum);
        System.out.println("Sum" + sum );

           //     .reduce(0,(x,y)-> (x+y)); // This safely adds up elements


    }
}
