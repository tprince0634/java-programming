package Collection.Queue.Implementations;
import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample {
     public static void main(String[] args) {

            Queue<String> queue = new ArrayDeque<>();
            // Adding elements
            queue.add("A");             // Inserts element, throws exception if fails
            queue.offer("B");        // Inserts element, returns false if fails
            queue.add("C");

            System.out.println("Queue after adding: " + queue); // [A, B, C]

            // Removing elements
            System.out.println(queue.poll()); //  A (removes front, returns null if empty)
            System.out.println(queue.remove()); // B (removes front, throws exception if empty)

            // Accessing front
            System.out.println(queue.peek()); // C (views front, returns null if empty)
            System.out.println(queue.element()); // C (views front, throws exception if empty)

            // Final state
            System.out.println("Queue after operations: " + queue); // [C]


        }
    }

