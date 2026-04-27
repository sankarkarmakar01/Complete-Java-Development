package oop;

public class Constructor {
    public static void main(String[] args) {
        Human human1 = new Human("Sankar", 21);
        human1.display();
        Human human2 = new Human("White", 99);
        human2.display();

    }
}

class Human {
    String name;
    int age;

    public Human() {
        //* Now, no need
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}