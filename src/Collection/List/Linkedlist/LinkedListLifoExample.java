package Collection.List.Linkedlist;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 🔹 Does LinkedList implement Stack?
 * No, LinkedList does not implement the Stack class.
 *
 * But LinkedList can behave like a stack because it implements the Deque interface
 * which supports LIFO operations.
 * */

public class LinkedListLifoExample {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();

        // Push elements (add to top
        stack.addFirst("A");  // Top -> A
        stack.addFirst("B");  // Top -> B, A
        stack.addFirst("C");  // Top -> C, B, A

        System.out.println("Stack (LIFO): " + stack); // Output: [C, B, A]

        // Pop elements (remove from top)
        String popped = stack.removeFirst();
        System.out.println("Popped: " + popped); // Output: C

        System.out.println("Stack after pop: " + stack); // Output: [B, A]
    }
}
