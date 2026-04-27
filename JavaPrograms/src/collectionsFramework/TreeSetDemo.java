package collectionsFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(20);
        set.add(50);
        set.add(70);
        set.add(77);
        set.add(90);
        set.add(99);

        System.out.println(set);

        System.out.println(set.ceiling(900));
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.floor(90));
        System.out.println(set.higher(90));
        System.out.println(set.lower(90));
        System.out.println(set.last());

        System.out.println(set.subSet(50,90));
        System.out.println(set.tailSet(50));

    }
}
