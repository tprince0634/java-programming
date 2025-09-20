package Generic2.WildCards2;

import java.util.Arrays;
import java.util.List;

public class Upperbounded {

    // ✅ Method accepts any List of Number or its subclasses (Integer, Double, etc.)

    public void processNumbers(List<? extends Number> list) {
//      list.add(6); // ❌ Compile-time error
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Upperbounded ub = new Upperbounded();

        // Create a list of Integers
        List<Integer> intList  =  Arrays.asList(1,2,3,4,5);
        System.out.println("Processing Integer list:");
        ub.processNumbers(intList);


        // Create a list of Floats
        List<Float> floatList = Arrays.asList(15f, 5f, 35f);
        System.out.println("Processing Double list:");
        ub.processNumbers(floatList);  // ✅ OK

    }
}
