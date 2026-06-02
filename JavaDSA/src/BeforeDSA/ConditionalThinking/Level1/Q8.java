package BeforeDSA.ConditionalThinking.Level1;

// Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.
public class Q8 {
    public static void main(String[] args) {
        double tem = 37.5;
        if (tem < 10) {
            System.out.println("Cold");
        } else if (tem >= 10 && tem < 80) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}
