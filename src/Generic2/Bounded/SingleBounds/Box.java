package Generic2.Bounded.SingleBounds;
//Single  bounds

//public class Box <T extends Object>{
public class Box <T extends Number>{        //the value of a type holder only can be class that extends Number class
    private  T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
//      Box<String> box = new Box<>();
        Box<Integer> box = new Box<>();
        box.setItem(12);
//      box.setItem("Ice-cream");
        System.out.println(box.getItem());
    }
}


