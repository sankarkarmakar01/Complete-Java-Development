package methods;

public class Recursion {
    public static int factorial(int n) {
        // Base Case: 1! is 1
        if (n == 1) {
            return 1;
        }
        // Recursive Step: n * (n-1)!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
