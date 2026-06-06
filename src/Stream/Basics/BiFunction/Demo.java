package Stream.Basics.BiFunction;

import java.util.function.*;

public class Demo {
    public static void main(String[] args) {
        /***
         * 🔹 What is a Bi function?
         * Bi- means two inputs.
         * Java provides several Bifunctional interfaces to work with two input arguments.
         */

        BiPredicate<Integer,Integer> istwoeven = (x,y)-> (x+y) % 2 == 0;
        System.out.println(istwoeven.test(4,6));

        BiFunction<String,String,Integer> length = (x,y) -> (x+y).length();
        System.out.println(length.apply("Prince","Tiwari"));

        BiConsumer<String,String> printname = (x,y) ->{
            System.out.println(x);
            System.out.println(y);
        };
        printname.accept("One","Two");


        //UnaryOpeartor
        // @FunctionalInterface
//        public interface BiFunction<T,R>
//        It means Two  of them will have same datatypes

        Function<Integer,Integer> doubleit = x ->  x * 2;  //Input integer Output Integer
        Function<String,Integer> s = x-> x.length();       //Input integer Output String
        UnaryOperator<Integer> Double = x -> x*2;
        System.out.println( Double.apply(100));


      //BinaryOperator
        // <T> – the type of the operands and result of the operator
//        @FunctionalInterface
//        public interface BiFunction<T, U, R>
//        It means three of them will have same datatypes


        BinaryOperator<String> concatIfStartsWithA = (x, y) ->
                x.startsWith("A") ? x + y : y;
        System.out.println( concatIfStartsWithA.apply("Apple","Banana"));










    }
}
