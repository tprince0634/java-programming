package Collection.Comparator2;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "Banana", "Mango", "Kiwi");

        names.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(names); // [Kiwi, Mango, Apple, Banana]
    }
}

