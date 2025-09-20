package Collection.Queue.Implementations;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

//       PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        //natural ordering
        //comparator allow

        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        pqueue.add(10);
        pqueue.add(56);
        pqueue.add(55);
        pqueue.add(7);
        System.out.println(pqueue);             //Sorted order me ayaga

        while(!pqueue.isEmpty()){
            System.out.println(pqueue.remove());
        }

        System.out.println(pqueue.isEmpty());


        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a); // Max-Heap
        pq.add(10);
        pq.add(5);
        pq.add(20);
        System.out.println(pq.poll()); // 20 (highest priority in max-heap)

/**
 *
 * 🔹 Internal Working
 * Internally, PriorityQueue is implemented using a binary heap (specifically, a min-heap by default).
 * The heap is stored in an array.
 * In a min-heap, the smallest element is always at the root (index 0).*/



    }
}
