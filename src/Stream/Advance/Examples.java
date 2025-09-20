package Stream.Advance;

import java.util.Arrays;
import java.util.List;

public class Examples {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("Apple","Mango","Banana","Peru");
        System.out.println(l1.stream().filter(x -> x.length() <= 4).toList());

        List<Integer> l2  = Arrays.asList(1,2,5,4,8);
        System.out.println(l2.stream().map((x) -> x * x ).sorted().toList());


        List<Integer> l3 = Arrays.asList(1,2,4,5,6);
        System.out.println(l3.stream().reduce((a,b) -> a + b).get());




    }

}
