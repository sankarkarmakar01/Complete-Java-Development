package basics.patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= count; k++) {
                System.out.print("*");
            }
            System.out.println();
            count += 2;
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + (i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
