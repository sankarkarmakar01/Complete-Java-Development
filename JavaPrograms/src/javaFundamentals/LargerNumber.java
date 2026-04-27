package javaFundamentals;

public class LargerNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 56;
        int c = 89;

        if (a > b && a > c) {
            System.out.println(a + " is larger");
        } else if (b > a && b > c) {
            System.out.println(b + " is larger");
        } else {
            System.out.println(c + " is larger");
        }

    }
}
