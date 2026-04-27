package oop.inheritance;

class Parent {
    void parent_method() {
        System.out.println("I am parent");
    }
}

class Child1 extends Parent {
    void greet() {
        System.out.println("I am child");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.greet();
        child1.parent_method();
    }
}
