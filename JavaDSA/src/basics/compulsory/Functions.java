package basics.compulsory;

public class Functions {

    //* pass by value
    static void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    //* pass by reference(address)
    static void modifyArr(int[] arr) {
        arr[0] = 999;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        add(10, 5);

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        modifyArr(arr);
        System.out.println();
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}
