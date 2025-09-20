package Generic2.Basics.GenericClass;

public class BoxWithGeneric <T>{          //<T> it is a placeholder i will tell the value during initialization
    private  T Value;

    public T getValue() {
        return Value;
    }

    public void setValue(T value) {
        Value = value;
    }

    public static void main(String[] args) {

        //Type safety +  Eliminate Manual Typecasting

        BoxWithGeneric<Integer> box2 = new BoxWithGeneric<>();  //Here i have told the Datatype of a placeholder
        box2.setValue(1);
        Integer value = box2.getValue();
        System.out.println(value);

        BoxWithGeneric<String> box3 = new BoxWithGeneric();
        box3.setValue("Hello baby");
        String greet = box3.getValue();
        System.out.println(greet);

    }
}

