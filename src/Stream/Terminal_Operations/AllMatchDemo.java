package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class AllMatchDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prince", "Ram", "Shyam");

        // allMatch() -> True if all elements match condition
        boolean result = names.stream()
                .allMatch(name -> name.length() > 2);

        System.out.println(result);
    }
}