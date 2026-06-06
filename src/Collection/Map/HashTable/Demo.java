package Collection.Map.HashTable;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

//      Hashtable<Integer,String> leo = new Hashtable<>();   //synchronized
        HashMap<Integer,String> leo = new HashMap<>();   //Not synchronized

        //Lambda expression Thread
        Thread thread = new Thread(() ->{
            for(int i=0;i<1000;i++){
                leo.put(i,"Thread1");
            }
        });


        Thread thread2 = new Thread(() ->{
            for(int i=0;i<1000;i++){
                leo.put(i,"Thread2");
            }
        });



        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(leo.size());



    }
}
