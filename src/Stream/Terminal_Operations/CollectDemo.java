package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Prince", "Ram", "Shyam");

        // collect() -> Collects stream elements into a Collection like Map,List,Set
        List<String> result = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
