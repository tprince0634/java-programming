package Stream.Basics.MethodReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
/**
 * A method reference is a shorter and cleaner way to write a lambda expression when all you're doing
 * is calling an existing method.
 * It’s part of Java 8's functional programming features — works wherever you’d use a lambda.
 * */
        //Method Reference
        List<String> students = Arrays.asList("Ram", "Shaym", "Ghanshyam");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);   //without invoking (Method as Reference)

        //constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<Mobilephone> mobilePhonelist = names.stream().
                map(Mobilephone::new).collect(Collectors.toList());
    }
}
class Mobilephone{
    String name;
    public Mobilephone(String name) {
        this.name = name;
    }
}