package collectionsFramework;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(55);
        list.add(80);
        list.add(80);

        list.add(3, 900);

        list.addFirst(100);
        list.addLast(5000);

        System.out.println(list);
        System.out.println(list.element());
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.indexOf(900));
        System.out.println(list.lastIndexOf(80));

        System.out.println("--------------");
        System.out.println(list);
        list.offer(1);
        list.offer(2);
        list.offerFirst(1111);
        list.offerLast(99999);

        System.out.println(list);
        System.out.println(list.peek());
        System.out.println(list.element());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println("--------------");
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println(list.pollFirst());
        System.out.println(list);
        System.out.println(list.pollLast());
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);
        list.push(523);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list);
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list);

        list.add(5000);
        System.out.println(list);
        list.removeLastOccurrence(5000);
        System.out.println(list);

        System.out.println(list.size());


    }
}
