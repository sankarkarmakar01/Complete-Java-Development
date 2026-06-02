package BeforeDSA.ConditionalThinking.Level2;

// If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
public class Q2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles Triangle.");
        } else if (a != b && a != c && b != c) {
            System.out.println("Scalene Triangle.");
        }
    }
}
