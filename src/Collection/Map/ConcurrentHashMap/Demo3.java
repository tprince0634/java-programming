package Collection.Map.ConcurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Demo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("One",1);

        boolean one = map.replace("One", 1, 11);
        System.out.println(one);
        System.out.println(map);


    }
}
