package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class CountDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prince", "Ram", "Shyam");

        // count() -> Returns total number of elements
        long count = names.stream()
                .count();

        System.out.println(count);
    }
}