package basics.compulsory;

public class NestedIf {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println(a + " is greater.");
            }
        }
        if (b > a) {
            if (b > c) {
                System.out.println(b + " is greater.");
            }
        }
        if (c > a) {
            if (c > b) {
                System.out.println(c + " is greater.");
            }
        }
    }
}
