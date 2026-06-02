package BeforeDSA.ConditionalThinking.Level2;

// Take three sides and check if they form a valid triangle
public class Q1 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Valid Triangle.");
        } else {
            System.out.println("Invalid Triangle.");
        }
    }
}
