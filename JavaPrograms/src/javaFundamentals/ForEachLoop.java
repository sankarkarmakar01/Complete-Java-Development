package javaFundamentals;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int ans = 0;
        for (int i : arr) {
            System.out.println(i);
            ans += i;
        }
        System.out.println("Sum is: " + ans);
    }
}
