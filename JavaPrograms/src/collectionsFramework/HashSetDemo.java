package collectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(50);
        set.add(50);
        set.add(70);
        set.add(90);
        set.add(99);

        System.out.println(set);
    }
}
