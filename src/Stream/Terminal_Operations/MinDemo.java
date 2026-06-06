package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;
public class MinDemo {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 5, 30, 2);

        // min() -> Returns smallest element
        Integer min = numbers.stream()
                .min((a,b) ->a.compareTo(b))
                .get();

        System.out.println(min);
    }
}