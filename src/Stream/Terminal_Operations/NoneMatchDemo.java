package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class NoneMatchDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prince", "Ram", "Shyam");

        // noneMatch() -> True if no element matches condition
        boolean result = names.stream()
                .noneMatch(name -> name.startsWith("Z"));

        System.out.println(result);
    }
}