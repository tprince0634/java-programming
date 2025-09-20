package Collection.Queue.Extends.Deque.Implementations;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        Deque<String> deque2 = new LinkedList<>();

        deque2.addFirst("A");
        deque2.addLast("B");
        deque2.addFirst("C");

        System.out.println("Deque: " + deque2);
        System.out.println("Removed First: " + deque2.removeFirst()); // Removes C
        System.out.println("Removed Last: " + deque2.removeLast());   // Removes B
        System.out.println("Deque after operations: " + deque2);

    }


}
