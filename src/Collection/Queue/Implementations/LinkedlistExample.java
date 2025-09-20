package Collection.Queue.Implementations;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedlistExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.size());

        System.out.println(queue.remove());   //Exception if empty
        System.out.println(queue.poll());      //Null if empty

        System.out.println(queue.peek());     //Null if empty
        System.out.println(queue.element());  //Exception if empty

    }
}
