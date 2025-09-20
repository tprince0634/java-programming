package Generic2.Basics.GenericInterface.Basic;
//Generic Class Implements Generic Opps.Abstraction.Interface

public class Demo<T> implements Container<T> {

    private T  name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public boolean show(T name) {
        return false;
    }

    public static void main(String[] args) {
        Demo<String> d = new Demo<>();
        d.setName("Prince");
        System.out.println( d.getName());

    }


}
