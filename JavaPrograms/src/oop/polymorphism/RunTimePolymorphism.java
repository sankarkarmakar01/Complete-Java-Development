package oop.polymorphism;

class Parent {
    int a = 10;
    void land() {
        System.out.println("I am Parent, I have 10 km^2 land");
    }
}

class Child extends Parent {
    @Override
    void land() {
        System.out.println("I am Child, I have more 20 km^2 land");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        parent.land();
        child.land();
    }
}
