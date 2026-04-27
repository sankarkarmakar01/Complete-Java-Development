package javaFundamentals;

public class DanglingElseProblem {
    public static void main(String[] args) {
        int num = 6;

        //* this code totally wrong
        if (num > 5)
            if (num > 9)
                System.out.println("True");
            else
                System.out.println("False");

        //* true code is this
        if (num > 5) {
            if (num > 9) {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
    }
}
