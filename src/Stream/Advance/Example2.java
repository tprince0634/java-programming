package Stream.Advance;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {

        List<String> l1 = Arrays.asList("Alice","Bob","Alexander","Thomoas");
        System.out.println( l1.stream().collect(Collectors.groupingBy(x-> x.length())));

//       2) Counting word Occurence
        String sentence = "Hello world NEW london Hello from Dubai";
        System.out.println( Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x-> x,Collectors.counting())));

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        System.out.println(integerStream.collect(Collectors.partitioningBy(x-> x%2 ==0 )));


//      3)suming values
        Map<String , Integer> l3 = new HashMap<>();
        l3.put("A",10);
        l3.put("B",20);
        l3.put("C",30);
        System.out.println(l3.values().stream().reduce((a,b)-> a+b).get());
        System.out.println(l3.values().stream().collect(Collectors.summingInt(x->x)));





    }
}

