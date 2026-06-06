package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class AnyMatchDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prince", "Ram", "Shyam");

        // anyMatch() -> True if at least one element matches
        boolean result = names.stream()
               .anyMatch(name -> name.startsWith("P"));

        System.out.println(result);
    }
}