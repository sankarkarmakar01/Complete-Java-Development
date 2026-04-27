package collectionsFramework;

import java.util.*;

class MyIntegerComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        list1.add(100);

        list.add(12);
        list.add(20);

        list.add(1,25);

        list.addAll(list1);

        list.addAll(1,list1);

        System.out.println(list);
        System.out.println(list.contains(20));
        System.out.println(list.containsAll(list1));
        System.out.println(list.equals(list1));
        System.out.println(list.get(2));
        System.out.println(list.hashCode());
        System.out.println(list.indexOf(100));
        System.out.println(list.isEmpty());
        final Iterator<Integer> iterator = list.iterator();
        final ListIterator<Integer> integerListIterator = list.listIterator();
        final ListIterator<Integer> integerListIterator1 = list.listIterator(1);
        System.out.println(list.lastIndexOf(100));
        System.out.println(list.remove(0));
        System.out.println(list);
        System.out.println(list.set(2,200));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list);

        list.sort(new MyIntegerComparator());
        System.out.println(list);

        List<Integer> newList = list.subList(0,2);
        System.out.println(newList);

        System.out.println(Arrays.toString(list.toArray()));

    }
}
