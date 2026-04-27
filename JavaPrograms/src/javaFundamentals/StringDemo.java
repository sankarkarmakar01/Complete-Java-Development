package javaFundamentals;

public class StringDemo {
    public static void main(String[] args) {
//        String name = new String("Sankar");
        String name = "Sankar";
        System.out.print("The name is: ");
        System.out.println(name);

        int a = 6;
        float b = 5.6965f;
        System.out.printf("The value of a is %d and the value of b is %f",a,b);
        System.out.println();
        System.out.format("The value of a is %d and the value of b is %f",a,b);

    }
}
