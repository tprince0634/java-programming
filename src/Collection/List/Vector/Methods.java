package Collection.List.Vector;
import java.util.Vector;

public class Methods {
    public static void main(String[] args) {
        Vector<Integer>v2=new Vector<>(10);
        v2.add(1);
        v2.add(2);
        v2.add(2,33);  //at specific index
//        v2.get(0);                 //get at specific index
        System.out.println("M"+ v2);
        v2.set(2,4);
        System.out.println("k" + v2);   //set at a specific index
        v2.add(1);
        v2.remove(Integer.valueOf(1)); //To remove the first occurrence object
        System.out.println(v2);
        v2.size();       //size of vector
        boolean y = v2.isEmpty();
        System.out.println(y);


        for(int i =0; i< v2.size();i++){
            System.out.println("Loop" + v2.get(i));
        }

    }
}

