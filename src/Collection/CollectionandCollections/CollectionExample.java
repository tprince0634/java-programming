package Collection.CollectionandCollections;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        //Interface
        Collection<String> collection = new ArrayList<>();
        collection.add("Element1");
        collection.add("Element2");
        System.out.println(collection);


        //utility class
        List<Integer> numbers = Arrays.asList(4, 2, 9, 1, 5);
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed list: " + numbers);

    }
}
