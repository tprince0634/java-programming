package Generic2.Basics.GenericClass;

public class Person <K,V> {
    private K  Roll;
    private V  Name;

    Person(K Roll,V Name){
        this.Name=Name;
        this.Roll=Roll;
    }

    public V getName() {
        return Name;
    }

    public K getRoll() {
        return Roll;
    }

    public static void main(String[] args) {
        Person<Integer,String> p = new Person<>(1,"Bhūmi Desi");
        System.out.println(p.getRoll());
        System.out.println(p.getName());




    }
}



