package collectionsFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offerFirst(500);
        deque.offerLast(600);

        System.out.println(deque);
    }
}
