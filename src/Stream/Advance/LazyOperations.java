package Stream.Advance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyOperations {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice","Bo","Charlie","David");
        Stream<String> a = names.stream()
                .filter(name -> {
                    System.out.println("Filtering"  + " "  + name);   //It will not get print cause Terminal operation nhi us hua hai
                    return name.length() > 3;
                });

        System.out.println("Before Terminal Operations");

        List<String>  result = a.toList();   //Terminal operation
        System.out.println("After Terminal");
        System.out.println(result);
    }


}

