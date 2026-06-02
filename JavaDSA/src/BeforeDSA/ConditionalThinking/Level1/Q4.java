package BeforeDSA.ConditionalThinking.Level1;

// Check if a number is divisible by both 3 and 5
public class Q4 {
    public static void main(String[] args) {
        int num = 15;
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible  by 3 and 5");
        } else {
            System.out.println("Not divisible by 3 and 5");
        }
    }
}
