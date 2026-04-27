package exceptionHandling;

public class MyClass {
    public static void main(String[] args) throws CustomException {
        try {
            int result = 10 / 0;
        } catch (CustomException e) {
//            System.out.println("Hello");
//            System.out.println("Message:" + e.getMessage());
            throw new CustomException("Not Possible");
        }
    }
}
