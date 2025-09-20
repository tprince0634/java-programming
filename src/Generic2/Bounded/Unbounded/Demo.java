package Generic2.Bounded.Unbounded;

public class Demo <T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    public static void main(String[] args) {
        //Unbounded -> you can pass any datatypes data
        Demo<Integer> demo = new Demo<>();
        demo.setValue(5);
        Integer value1 = demo.getValue();
        System.out.println(value1);

        Demo<String> demo1 = new Demo<>();
        demo1.setValue("Hello");
        String value2 = demo1.getValue();
        System.out.println(value2);

    }
}

//T is a type parameter, which is not restricted by any bound.
//There is no constraint like T extends SomeClass or T super SomeClass.
