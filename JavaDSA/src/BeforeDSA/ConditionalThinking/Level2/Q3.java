package BeforeDSA.ConditionalThinking.Level2;

// Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
public class Q3 {
    public static void main(String[] args) {
        float marks = 85.6f;
        if (marks > 90) {
            System.out.println("Grade: A");
        } else if (marks <= 90 && marks > 70) {
            System.out.println("Grade: B");
        } else if (marks <= 70 && marks > 50) {
            System.out.println("Grade: C");
        } else if (marks <= 50 && marks > 35) {
            System.out.println("Grade: D");
        } else if (marks < 35) {
            System.out.println("Fail");
        }
    }
}
