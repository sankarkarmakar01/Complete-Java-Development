package arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 6, 7, 5, 2, 14, 6, 3, 6, 8};

        //* using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //* using while loop
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();

        //* using do-while loop
        int j = 0;
        do {
            System.out.print(arr[j] + " ");
            j++;
        } while (j < arr.length);
        System.out.println();
        //* using for-each loop
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
