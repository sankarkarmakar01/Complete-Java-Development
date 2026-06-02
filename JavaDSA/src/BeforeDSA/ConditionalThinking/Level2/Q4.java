package BeforeDSA.ConditionalThinking.Level2;

// Check if one of two given numbers is a multiple of the other.
public class Q4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        if (a % b == 0 || b % a == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
