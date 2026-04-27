package oop.inheritance;

class ParentDemo {
    void greet() {
        System.out.println("Hello, I am parent.");
    }
}

class ChildDemo extends ParentDemo {
    @Override
    void greet() {
        System.out.println("Hello, I am child.");
    }
}

public class OverrideMethods {
    public static void main(String[] args) {
        ParentDemo parentDemo = new ParentDemo();
        ChildDemo childDemo = new ChildDemo();
        parentDemo.greet();
        childDemo.greet();
    }
}
