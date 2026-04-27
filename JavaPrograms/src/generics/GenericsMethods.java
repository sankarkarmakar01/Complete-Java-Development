package generics;

public class GenericsMethods {
    public static void main(String[] args) {
        GenericsMethods test = new GenericsMethods();
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"Hello", "World"};
        test.printArray(intArray);
        test.printArray(stringArray);
    }

    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
