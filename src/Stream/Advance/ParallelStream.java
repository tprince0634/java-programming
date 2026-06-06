package Stream.Advance;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args) {
        long a = Factorial(5);
        System.out.println(a);

        // Generate a list of integers from 1 to 20,000
        long startime = System.currentTimeMillis();

        List<Integer> ps = Stream.iterate(1, x -> x + 1)
                .limit(20)
                .toList();

        List<Long> Factorial=
                ps.stream()
                        .map(ParallelStream::Factorial)
                        .toList();

        //map(x-> Factorial(x))

        long endtime = System.currentTimeMillis();

        System.out.println("Time taken with Sequential Stream" +  " " + (endtime - startime) +" Ms");


        startime = System.currentTimeMillis();
        Factorial= ps.parallelStream()
                .map(ParallelStream::Factorial)
                .toList();
        endtime = System.currentTimeMillis();
        System.out.println("Time taken with ParallelStream " +  " " + (endtime - startime) +" Ms");

        //Parallel stream are most effective For CPU-intensive or Large Database where task are independent
        //They may head Overhead for simple task
    }

    // Factorial method to calculate the factorial of a given number
    public static long Factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) { // Fix: the loop should go until i <= n
            result *= i;
        }
        return result;
    }


}