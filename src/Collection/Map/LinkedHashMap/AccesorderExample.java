package Collection.Map.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class AccesorderExample {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> dem = new LinkedHashMap<>(3, 0.5f, false);
        dem.put(4, "Dog");
        dem.put(1, "Apple");
        dem.put(2, "Boll");
        dem.put(3, "Cat");

        System.out.println(dem.entrySet());

        for (Map.Entry<Integer, String> entry : dem.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        System.out.println("TRUEEEEEE");

//------------------------------------------------------------------------------------------------

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        map.get(1);  // Access 1st entry

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
