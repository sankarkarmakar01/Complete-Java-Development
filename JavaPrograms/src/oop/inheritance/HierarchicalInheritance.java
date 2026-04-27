package oop.inheritance;

class Animal {
    void animal() {
        System.out.println("Animal");
    }
}

class Dog1 extends Animal {
    void dog() {
        System.out.println("Dog");
    }
}

class Deer extends Animal{
    void deer() {
        System.out.println("Deer");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog1 dog = new Dog1();
        Deer deer = new Deer();
        dog.dog();
        dog.animal();
        deer.deer();
        deer.animal();
    }
}
