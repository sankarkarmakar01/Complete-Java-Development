package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int result = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This always runs. Clean up complete.");
        }
    }
}
