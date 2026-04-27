package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        final ArrayList<?> list = new ArrayList<String>(); //* read only
//        list.add("Hello");
//        list.add(2);

        System.out.println(sum(Arrays.asList(1, 2.2, 22)));

        List<? super Integer> numbers = Arrays.asList(1,2,3);
        numbers.add(12);
        numbers.add(null);

    }

//    public <T> void printArrayList(ArrayList<T> list) {
//        for(T o:list) {
//            System.out.println(o);
//        }
//    }

//    public Object getFirst(ArrayList<?> list) {
//      return list.get(0);
//    }

    public <T> T getFirst(ArrayList<T> list) {
        return list.get(0);
    }

    public void copy(ArrayList<?> source, ArrayList<?> destination) {
        for (Object item : source) {
//            destination.add(item);
        }


    }

    // Upper Bound
    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number o : numbers) {
            sum += o.doubleValue();
        }
        return sum;
    }

    // Lower Bound
    public static void printNumbers(List<? super Integer> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

}
