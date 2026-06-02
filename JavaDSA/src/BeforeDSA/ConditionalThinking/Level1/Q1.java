package BeforeDSA.ConditionalThinking.Level1;

//Take a number and print whether it’s positive, negative, or zero
public class Q1 {
    public static void main(String[] args) {
        int num = -1;
        if (num == 0) {
            System.out.println("This number is zero.");
        } else if (num > 0) {
            System.out.println("This number is positive.");
        } else if (num < 0) {
            System.out.println("This number is negative.");
        } else {
            System.out.println("this is not a number.");
        }
    }
}
