package BeforeDSA.ConditionalThinking.Level1;

// Take three numbers and print the larger one
public class Q7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
        if (a > b && a > c) {
            System.out.println("a is larger.");
        } else if (b > a && b > c) {
            System.out.println("b is larger.");
        } else {
            System.out.println("c is larger.");
        }

    }
}
