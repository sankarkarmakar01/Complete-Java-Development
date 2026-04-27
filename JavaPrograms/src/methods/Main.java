package methods;

public class Main {
    //* The Simple Method (No Input, No Output)
    public static void printWelcome() {
        System.out.println("Welcome to Java Class!");
    }

    //* Adding Parameters (Giving Inputs)
    public static void greetUser(String name) { //* 'name' is the parameter
        System.out.println("Hello, " + name + "!");
    }

    //*Returning Values (Getting Outputs)
    public static int addNumbers(int a, int b) {
        int add = a + b;
        return add; // Handing back an integer
    }

    // Method Overloading
    // Method for two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method for three numbers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        printWelcome(); //* the call
        greetUser("Sankar"); // "Sankar" is the argument
        int result = addNumbers(5, 10);
        System.out.println("The sum is: " + result);
        System.out.println("Multiply of 2: " + multiply(10, 6));
        System.out.println("Multiply of 3: " + multiply(10, 6, 2));
    }
}
