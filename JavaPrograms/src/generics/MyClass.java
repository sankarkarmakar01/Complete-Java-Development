package generics;

public class MyClass {
    public static void main(String[] args) {
        try {
            throw new MyException(123);
        } catch (MyException e) {
            System.out.println("caught exception: " + e.getMessage());
        }

        try {
            throw new MyException("String");
        } catch (MyException e) {
            System.out.println("caught exception: " + e.getMessage());
        }

    }
}
