package BeforeDSA.ConditionalThinking.Level2;

//Take a month number (1–12) and print the number of days in that month (ignore leap years).
public class Q10 {
    public static void main(String[] args) {
        int month = 6;

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println(31);
        }
        else if (month == 2) {
            System.out.println(28);
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println(30);
        }
        else {
            System.out.println("Invalid month number. Please enter a number between 1 and 12.");
        }
    }
}
