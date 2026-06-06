package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class FindAnyDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prince", "Ram", "Shyam");

        // findAny() -> Returns any element from stream
        String value = names.stream()
                .findAny()
                .get();

        System.out.println(value);
    }
}