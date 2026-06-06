package Stream.Terminal_Operations;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);


        // reduce() -> Combines all elements into a single result
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        int sum2 = numbers.stream()
                .reduce(0, (a, b) -> {
                    System.out.println("a = " + a + ", b = " + b);
                    int result = a + b;
                    System.out.println("a + b = " + result);
                    return result;
                });

        System.out.println(sum);
        System.out.println(sum2);


       // Equivalent traditional code:
        int result = 0;

        for (Integer n : numbers) {
            result = result + n;
        }

        System.out.println(result);
    }
}


//Syntax
//reduce(identity, accumulator)

//identity → starting value (0)
//accumulator → logic to combine values ((a,b) -> a+b)

/*
Start = 0
0 + 10 = 10
10 + 20 = 30
30 + 30 = 60
60 + 40 = 100

Final Result = 100*/