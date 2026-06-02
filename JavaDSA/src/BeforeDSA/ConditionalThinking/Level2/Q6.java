package BeforeDSA.ConditionalThinking.Level2;

// Check voting eligibility for a given age (18+).
public class Q6 {
    public static void main(String[] args) {
        int age = 19;
        if(age >= 18) {
            System.out.println("Voter");
        } else {
            System.out.println("Non Voter");
        }
    }
}
