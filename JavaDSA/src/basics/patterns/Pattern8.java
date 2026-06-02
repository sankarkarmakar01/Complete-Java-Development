package basics.patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
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
