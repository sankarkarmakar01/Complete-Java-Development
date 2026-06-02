package BeforeDSA.ConditionalThinking.Level2;

// Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.
public class Q7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                System.out.println("Both are Even.");
            } else {
                System.out.println("A is Even and B is Odd.");
            }
        } else {
            if (b % 2 == 0) {
                System.out.println("A is Odd and B is even.");
            } else {
                System.out.println("Both are Odd.");
            }
        }
    }
}
