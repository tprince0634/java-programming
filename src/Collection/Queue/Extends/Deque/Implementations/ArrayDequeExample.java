package Collection.Queue.Extends.Deque.Implementations;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(32);
        deque.addLast(34);
        deque.offerFirst(5);
        deque.offerLast(1);
        System.out.println(deque);
//     5,32,34,1

        System.out.println("First: " + deque.removeFirst());
        System.out.println("Last: "  + deque.pollLast());
        System.out.println(deque.getFirst());


        Deque<Integer> deque1 = new LinkedList<>();
    }

}
