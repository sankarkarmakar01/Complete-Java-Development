package oop.inheritance;

class Grandparent1 {
    void grandparent() {
        System.out.println("I am grandparent");
    }
}

class Parent1 extends Grandparent1 {
    void parent() {
        System.out.println("I am parent");
    }
}

class Child2 extends Parent1 {
    void child() {
        System.out.println("I am child");
    }
}

public class MultilineInheritance {
    public static void main(String[] args) {
//        Grandparent1 child = new Child2();
//        Parent1 child = new Child2();
        Child2 child = new Child2();
        child.child();
        child.parent();
        child.grandparent();
    }
}
