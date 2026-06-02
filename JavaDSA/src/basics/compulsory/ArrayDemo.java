package basics.compulsory;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 22;
        arr[2] = 32;
        arr[3] = 42;
        arr[4] = 52;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
