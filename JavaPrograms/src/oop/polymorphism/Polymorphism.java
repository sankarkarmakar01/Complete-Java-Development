package oop.polymorphism;

public class Polymorphism {

    void man() {
        System.out.println("I am a Man");
    }

    void man(String name) {
        System.out.println("My name is " + name);
    }

    String man(int age) {
        return "My age is " + age;
    }

    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.man();
        obj.man("Sankar");
        System.out.println(obj.man(21));
    }
}
