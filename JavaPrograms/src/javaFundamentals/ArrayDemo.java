package javaFundamentals;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();

        int[] age = {12, 4, 5, 2, 5};

        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);
    }
}
