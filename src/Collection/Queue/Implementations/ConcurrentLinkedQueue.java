package Collection.Queue.Implementations;
import java.util.Queue;

//Thread safe

public class ConcurrentLinkedQueue {
    public static void main(String[] args) {
        Queue<String> queue = new java.util.concurrent.ConcurrentLinkedQueue<>();

        queue.add("Task1");
        queue.add("Task2");

        System.out.println(queue.poll()); // Task1
        System.out.println(queue.peek()); // Task2
    }
}
