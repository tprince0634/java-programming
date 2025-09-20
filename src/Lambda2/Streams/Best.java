package Lambda.Streams;

import java.util.List;
import java.util.stream.Collectors;



public class Best {
    public static void main(String[] args) {
// 1. Filtering a list
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        List<String> filtered = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filtered);        // [Alice]


//🔹 2. Mapping (transforming) a list
        List<String> Players = List.of("Poran","Dhoni","Kohli","Sharma");
        List<Integer> namelength = Players.stream().
                map(Player->Player.length()). //Intermediate Operation
                collect(Collectors.toList());     //Terminate Operation
        System.out.println(namelength);

//   3. Sorting
        List<String> Impactplayers = List.of("Charlie", "Alice", "Bob");
        List<String> sortedplayers = Impactplayers.stream()
//                   .sorted()
                .sorted((a, b) -> a.compareTo(b))  // or just .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedplayers);


//🔹 5. ForEach (just performing an action)
        List<String> name2 = List.of("Alice", "Bob", "Charlie");
        name2.stream()
                .forEach(name -> System.out.println("Hello " + name2));

//🔹 7. Counting elements
        long count = name2.stream()
                .filter(name -> name.length() < 4)
                .collect(Collectors.counting());
        System.out.println(count); // e.g., 2


//🔹 8. Combining multiple operations
        List<String> names5 = List.of("Alice", "Bob", "Charlie", "Alex","Alice");
        List<String> result = names5.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result); // [ALEX, ALICE]




    }
}
