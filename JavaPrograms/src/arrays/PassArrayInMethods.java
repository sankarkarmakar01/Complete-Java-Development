package arrays;

public class PassArrayInMethods {

    static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length -1 ;
        while (start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 100;
        int ans = binarySearch(arr, key);
        if (ans == -1) {
            System.out.println(key + " is not present in this array.");
        } else {
            System.out.println(key + " is present in the index of " + ans);
        }
    }
}
