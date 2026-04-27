package oop;

class Student {
    String name;
    int age;
    String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
        System.out.println("Master constructor Called");
    }

    public Student(String name, int age) {
        // Calls the Master Constructor with a default major
        this(name, age, "Undeclared");
        System.out.println("Two-parameter Constructor Called");
    }

    public Student() {
        // Calls the two-parameter constructor with default values
        this("Unknown", 0);
        System.out.println("Default Constructor Called");
    }

    void display() {
        System.out.println(name + " | " + age + " | " + major);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.display();
        Student student2 = new Student("White", 99);
        student2.display();
        Student student3 = new Student("Sankar", 21, "Computer Science");
        student3.display();
    }
}

//* Wrong Process
/*
class Student {
    String name;
    int age;

    Student(String n) {
        this.name = n;
        this.age = 18; // Default age
    }

    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }
}
*/