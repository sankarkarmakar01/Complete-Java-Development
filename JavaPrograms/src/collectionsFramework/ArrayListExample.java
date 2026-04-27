package collectionsFramework;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //    int[] arr = new int[20];
        ArrayList<Integer> list = new ArrayList<>(11); //* initial capacity 10

        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());

//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        Object[] elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);
//
//        list.add(1);
//
//        elementData = (Object[]) field.get(list);
//        System.out.println("ArrayList capacity: " + elementData.length);









//        list.add(1);
//        list.add(5);
//        list.add(80);

//        System.out.println(list);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for (int i = 0;i<list.size();i++) {
//            System.out.println(list.get(i));
//        }
//        for (int x:list) {
//            System.out.println(x);
//        }
//        System.out.println(list.contains(15));
//        System.out.println(list.contains(5000));

//        list.remove(2);
//        System.out.println(list);

//        list.add(2,50);
//        System.out.println(list);

//        list.set(2,50);
//        System.out.println(list);

    }
}
