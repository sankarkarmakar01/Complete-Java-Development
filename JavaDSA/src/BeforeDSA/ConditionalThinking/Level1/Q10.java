package BeforeDSA.ConditionalThinking.Level1;

// Take a character and check whether it’s uppercase, lowercase, a digit, or a special
//character
public class Q10 {
    public static void main(String[] args) {
        char c = '5';
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Uppercase.");
        } else if (c >= 'a' && c <= 'z') {
            System.out.println("Lowercase.");
        } else if (c >= '0' && c <= '9') {
            System.out.println("Digit.");
        } else {
            System.out.println("Special Character.");
        }
    }
}
