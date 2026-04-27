package strings;

public class Main {
    public static void main(String[] args) {
        String s1 = "Java";               // Literal (stored in Pool)
        String s2 = "Java";               // Points to the same object as s1
        String s3 = "java";               // Now points to the another object as s1
        String s4 = new String("Java");   // New object in Heap
    }
}
