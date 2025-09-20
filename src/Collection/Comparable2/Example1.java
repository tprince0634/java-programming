package Collection.Comparable2;

import java.util.Arrays;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,7,8,94,3);
        list.sort((a, b) -> a - b); // Ascending order

        System.out.println(list);
    }
}
