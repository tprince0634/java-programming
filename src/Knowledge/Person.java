package Knowledge;
import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(); // ✅ modifiable list
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        // Same stream usage
        people.stream()
                .forEach(p -> System.out.println(p.getName() + " is " + p.getAge() + " years old"));
    }
}

