package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prince", "Ram", "Shyam");

        // forEach() -> Performs an action on each element
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}