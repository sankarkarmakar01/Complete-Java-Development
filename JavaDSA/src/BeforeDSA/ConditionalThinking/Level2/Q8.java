package BeforeDSA.ConditionalThinking.Level2;

// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.
public class Q8 {
    public static void main(String[] args) {
        char c = 's';
        if (c >= 'a' && c <= 'm') {
            System.out.println("Lies between 'a' and 'm'");
        } else {
            System.out.println("Lies between 'n' and 'z'");
        }
    }
}
