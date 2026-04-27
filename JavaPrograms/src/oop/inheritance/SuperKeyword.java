package oop.inheritance;

class Base {
    String name;
    int age;

    public Base(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: "+ age);
    }
}

class Derived extends Base {

    public Derived(String name, int age) {
        super(name, age);
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        Base base = new Base("Sankar",21);
        base.display();
        Derived derived = new Derived("White",99);
        derived.display();
    }
}
