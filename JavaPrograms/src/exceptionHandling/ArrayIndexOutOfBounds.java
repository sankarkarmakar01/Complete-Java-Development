package exceptionHandling;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        arr[0] = 10;
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException("Not Accessible because: " + e.getMessage());
        } finally {
            assert System.out != null;
            System.out.println("I always run...");
        }
    }
}
