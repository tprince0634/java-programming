package Generic2.Bounded.Bounded;
// Upper Bounded Type Parameters -> type argument must be a subtype of a specific type

public class Demo<T extends Number> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
//        Demo<String> demo = new Demo();  //you can not give string because you have used boundation  of Number
        Demo<Integer> demo = new Demo<>();
        demo.setItem(56);
        Integer item1 = demo.getItem();
        System.out.println(item1);
    }
}
