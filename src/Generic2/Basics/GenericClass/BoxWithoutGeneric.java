package Generic2.Basics.GenericClass;
//Without Generic
public class BoxWithoutGeneric {
    private Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    public static void main(String[] args) {
        BoxWithoutGeneric box = new BoxWithoutGeneric();
        box.setValue(1);
        int value1 = (int) box.getValue();   //no typesafe
        System.out.println(value1);

        //If i make this Blunder ki mai set integer kr hra hu aur get String to exception (ClassCastException)
        String value2 = (String) box.getValue();
        System.out.println(value2);

    }
}
