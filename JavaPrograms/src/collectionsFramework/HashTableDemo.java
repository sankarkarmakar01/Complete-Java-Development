package collectionsFramework;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        hashtable.put("name", "Sankar");
        hashtable.put("age", "21");

        System.out.println(hashtable);
        System.out.println(hashtable.get("name"));
        System.out.println(hashtable.values());
    }
}
