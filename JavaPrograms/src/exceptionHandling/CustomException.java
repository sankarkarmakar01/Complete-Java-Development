package exceptionHandling;

public class CustomException extends ArithmeticException {
    public CustomException(String message) {
        super(message);
    }
}
