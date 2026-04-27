package oop;

public class MainClass {
    public static void main(String[] args) {
        Child child = new Child(); // object or instance of a class
        child.display();
    }
}

class Child { //* class or blueprint
    String name; // attributes
    int age;

    void display() { // method
        name = "Bruno";
        age = 3;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}