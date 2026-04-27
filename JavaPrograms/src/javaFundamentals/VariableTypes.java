package javaFundamentals;

public class VariableTypes {
    static int a = 10; //* static variable
    public static void main(String[] args) {
        Demo demo = new Demo(); // instant variable
        int b = 20; // local variable
        System.out.println(a);
        System.out.println(b);
        demo.greet();
    }
}

class Demo {
    void greet() {
        System.out.println("Welcome");
    }
}