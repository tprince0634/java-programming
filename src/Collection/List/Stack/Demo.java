package Collection.List.Stack;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Push elements to the stack
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }

        // Print the stack size after pushing 20 elements
        System.out.println("Stack size after pushing 20 elements: " + stack.size());

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());   //19 (LIFO)
    }
}
