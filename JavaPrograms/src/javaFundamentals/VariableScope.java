package javaFundamentals;

public class VariableScope {
    static String name = "Sankar"; // global scope
    static void greet() {
        String name = "White"; // local scope / block scope
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        greet();
        System.out.println("Hello " + name);
    }
}
