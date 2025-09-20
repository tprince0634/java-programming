package Collection.Set;
import java.util.*;

public class Setoverview {
    public static void main(String[] args) {
//        Map<Integer,String> ss = new HashMap<>();
//        Set<Integer> integers = ss.keySet();     // alt+enter me Set  aya  means key of hashmap  ka key is a  set (unique)


        Set<Integer> s = new HashSet<>();
        s.add(12);
        s.add(678);
        s.add(399);
        s.add(68);
        System.out.println(s);   //no order maintain

        Set<Integer> ss = new LinkedHashSet<>();
        ss.add(12);
        ss.add(67);
        ss.add(3);
        ss.add(688);
        System.out.println("LinkedHashSet insertion order Maintain " + ss);     // LinkedHashSet insertion order maintain

        Set<Integer> sss = new TreeSet<>();
        sss.add(12);
        sss.add(67);
        sss.add(3);
        sss.add(688);
        System.out.println("Tree set natural orderig " + sss);


        //unmodifiable set
        Set<Integer> integers = Set.of(2, 3, 4, 5, 8);        //NO limitation like HashMapset
//        integers.add(6);        //you can not modified it
        System.out.println("Immutableset" + integers);

        //Fot thread Safety(Dont prefer this) instead prefer ConcurrentSkipListSet
        Set<Integer> integers1 = Collections.unmodifiableSet(integers);



    }
}
