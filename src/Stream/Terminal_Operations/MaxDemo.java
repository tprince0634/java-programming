package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class MaxDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 30, 2);

        // max() -> Returns largest element
        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println(max);
    }
}