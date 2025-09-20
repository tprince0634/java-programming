package Collection.List.Vector;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo2 {
    public static void main(String[] args) {

//        Vector<Integer> Jak = new Vector<>();
        ArrayList<Integer> Jak = new ArrayList<>();


        // First thread
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i =0 ; i<1000;i++){
                    Jak.add(i);
                }
            }
        });


        //Second thread
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                for(int i =0 ; i<1000;i++){
                    Jak.add(i);
                }
            }
        };

        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();

       try{
           thread1.join();
           thread2.join();
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }

        // Print the size of the list to verify
        System.out.println("Size of the list: " + Jak.size());



    }
}
