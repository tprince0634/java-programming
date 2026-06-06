package Collection.Queue;

import java.util.*;

public class PriorityandRegularExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        //regular queue (Fifo)
        queue.add(5);
        queue.add(3);
        queue.add(10);
        queue.add(7);
        System.out.println(queue.poll());


        //Priority queue
        // Elements are ordered based on their priority (natural order or a provided comparator).
        // In a min-heap, the smallest element is always at the head.

//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((Comparator.reverseOrder()));   //because i make reverse
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(5);
        priorityQueue.add(3);
        priorityQueue.add(10);
        priorityQueue.add(7);
        System.out.println(priorityQueue.poll());
    }

}
