package Generic2.WildCards2;

import java.util.*;

public class LowerBoundExample {

    public void addNumbers(List<? super Integer> list) {
        // ✅ Safe to add Integer because list accepts Integer or its supertype

        list.add(100);
        list.add(200);

        for (Object a : list) {
            System.out.println("Element: " + a);
        }
    }


    public static void main(String[] args) {
        LowerBoundExample example = new LowerBoundExample();

        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        example.addNumbers(intList);

        List<Number> numberList = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        example.addNumbers(numberList);

        List<Object> objectList = new ArrayList<>(Arrays.asList(9, 10, 11, 12));
        example.addNumbers(objectList);
    }
}
