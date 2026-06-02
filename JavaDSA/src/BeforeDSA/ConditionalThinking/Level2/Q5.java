package BeforeDSA.ConditionalThinking.Level2;

// Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.
public class Q5 {
    public static void main(String[] args) {
        int hour = 15;
        if (hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon");
        } else if (hour >= 17 && hour < 20) {
            System.out.println("Good Evening");
        } else if (hour >= 20) {
            System.out.println("Good Night");
        }
    }
}
