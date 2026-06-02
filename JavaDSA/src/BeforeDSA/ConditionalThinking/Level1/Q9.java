package BeforeDSA.ConditionalThinking.Level1;

// Take a character and check if it’s a vowel or consonant.
public class Q9 {
    public static void main(String[] args) {
        char c = 'i';
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}
