package collectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(90);

        System.out.println(queue);
        System.out.println(queue.peek());

    }
}
