package oop;

public class ClassMethods2 {
    // Instance Variable num
    int num = 10;

    public ClassMethods2() {
        System.out.println("This is an example program on keyword this.");
    }

    public ClassMethods2(int num) {
        // Invoking the default constructor
        this();

        // Assigning the local variable num to the instant variable num
        this.num = num;
    }

    public void greet() {
        System.out.println("Hi, Welcome to this world...");
    }

    public void print() {
        // Local variable num
        int num = 20;

        // Printing the local variable
        System.out.println("Value of local variable num is: " + num);

        // printing the instance variable
        System.out.println("Value of instance variable num is:" + this.num);

        // Invoking the greet method
        this.greet();
        
    }

    public static void main(String[] args) {
        //* Instantiating the class
        ClassMethods2 obj1 = new ClassMethods2();

        //* Invoking the print method
        obj1.print();

        // Passing a new value to the num variable through parametrized constructor
        ClassMethods2 obj2 = new ClassMethods2(30);

        // Invoking the print method again
        obj2.print();
    }
}
