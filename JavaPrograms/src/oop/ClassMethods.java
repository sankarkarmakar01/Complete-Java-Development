package oop;

class Util {
    public int minimum(int a, int b) {
        return Math.min(a, b);
    }
}

public class ClassMethods {
    void greet() {
        System.out.println("Hello, Welcome to this world...");
    }

    public static void main(String[] args) {
        ClassMethods methods = new ClassMethods();
        methods.greet();

        Util util = new Util();
        System.out.println(util.minimum(10,20));
    }
}
