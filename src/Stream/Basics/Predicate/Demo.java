package Stream.Basics.Predicate;

import java.util.function.Predicate;

public class Demo {
    public static void main(String[] args) {

        //It is function interface that holds a condition in variable and return Boolean result

        Predicate<Integer> iseven = a -> a % 2 == 0;   // By defining the method name test, it becomes clear and descriptive that the method’s purpose is to "test" an input of type T and return a boolean value i
        System.out.println(iseven.test(3));

        Predicate<String> isstartwith = (a->a.startsWith("a"));
        System.out.println(isstartwith.test("akash"));

        Predicate<String> isendwith = (a->a.endsWith("y"));
        System.out.println(isendwith.test("akahsay"));

        Predicate<String>  Both = isstartwith.and(isendwith);
        System.out.println(Both.test("a"));    //












//
//        Predicate<String> iswswS = s -> s.toLowerCase().startsWith("s");
//        System.out.println(iswswS.test("Sonam"));

//        Predicate<String> iswewS = s -> s.toLowerCase().endsWith("m");
//        System.out.println(iswewS.test("Sonam"));

//
//        Predicate<String> and = iswewS.and(iswewS);
//        System.out.println(and.test("sonau"));  //only 1 condition is true


    }
}
