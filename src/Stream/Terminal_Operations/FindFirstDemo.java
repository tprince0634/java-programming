package Stream.Terminal_Operations;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class FindFirstDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

        Optional<Integer> result = numbers.stream()
                .findFirst();

        System.out.println(result.get());
    }
}