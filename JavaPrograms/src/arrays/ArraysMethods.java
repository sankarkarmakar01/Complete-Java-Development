package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9, 6, 4, 5, 2};

        //* Built-in Array Properties
        // length: A public property (not a method) that returns the total number of elements the array can hold.
        System.out.println(arr.length);

        // clone(): Creates a shallow copy of the array, duplicating the structure but not the objects inside.
        int[] newArr = arr.clone();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArr));
        System.out.println(arr == newArr);

        //* Searching and Sorting
        // sort(array): Sorts the specified array into ascending numerical or alphabetical order
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // parallelSort(array): Uses a parallel sort-merge algorithm to sort large arrays faster on multi-core systems.
        System.out.println(Arrays.toString(arr));
        arr = new int[]{1, 2, 3, 4, 5, 8, 9, 6, 4, 5, 2};
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));

        int ans = Arrays.binarySearch(arr, 5);
        System.out.println(ans);

        //* Manipulation and Filling
        int[] fillArr = new int[5];
        System.out.println(Arrays.toString(fillArr));
        Arrays.fill(fillArr, 5);
        System.out.println(Arrays.toString(fillArr));

        Arrays.setAll(fillArr, i -> i * 2);
        System.out.println(Arrays.toString(fillArr));

        int[] original_arr = {1, 2, 3};
        int[] copy_arr = Arrays.copyOf(original_arr, 10);
        System.out.println(Arrays.toString(original_arr));
        System.out.println(original_arr.length);
        System.out.println(Arrays.toString(copy_arr));
        System.out.println(copy_arr.length);

        int[] original_arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] copy_arr2 = Arrays.copyOfRange(original_arr2, 2, 6);
        System.out.println(Arrays.toString(original_arr2));
        System.out.println(original_arr2.length);
        System.out.println(Arrays.toString(copy_arr2));
        System.out.println(copy_arr2.length);

        // Comparison and Hashing
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.equals(arr1, arr2));

        int[][] arr_2d1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr_2d2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepEquals(arr_2d1, arr_2d2));

        System.out.println(Arrays.toString(arr));
        System.out.println("Hash: " + Arrays.hashCode(arr));

        System.out.println("Hash of 2D: " + Arrays.deepHashCode(arr_2d1));

        // Conversion and Display
        int[] array = {1, 2, 3, 4, 5, 8, 9, 6, 4, 5, 2};
        int[][] arr2d = {
                {1, 5, 9},
                {3, 5, 7},
                {1, 7, 9}
        };

        System.out.println(Arrays.toString(array)); // for 1D
        System.out.println(Arrays.deepToString(arr2d)); // for multi-D array

        var list = Arrays.asList(1, 2, 5, 8, 9);
        System.out.println(list);
        System.out.println(list.size());

        var stream = Arrays.stream(array);
        System.out.println(stream);

    }
}
