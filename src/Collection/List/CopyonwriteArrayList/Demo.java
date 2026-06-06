package Collection.List.CopyonwriteArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
        List<String> fruits = new CopyOnWriteArrayList<>();
//        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("pupaya");

        for(String item:fruits){
            System.out.println(item);

            if (item.equals("Grapes")) {
                fruits.add("Banana");
                System.out.println("Added");
            }
        }
        System.out.println(fruits);
    }
}
