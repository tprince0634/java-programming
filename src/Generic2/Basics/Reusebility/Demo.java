package Generic2.Basics.Reusebility;

import java.util.ArrayList;
import java.util.List;

class GenericList<T> {
    List<T> elements = new ArrayList<>();

    public void add(T element) {
        elements.add(element);
    }

    public void printAll() {
        for (T e : elements) {
            System.out.println(e);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        //reusability
        GenericList<String> stringList = new GenericList<>();
        stringList.add("Hello");
        stringList.printAll();

        //reusability
        GenericList<Integer> intList = new GenericList<>();
        intList.add(6);
        intList.printAll();



    }
}
