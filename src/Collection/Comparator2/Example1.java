package Collection.Comparator2;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Mango", "Kiwi");

        names.sort(Comparator.comparing(String::length));
        System.out.println(names); // [Kiwi, Mango, Apple, Banana]
    }
}

