package oop;

class Dog {
    String breed = "German Shepherd";
    int age = 2;
    String color = "Black";
    final String name = "Tommy"; //* Read only
}

public class ClassAttributes {
    public static void main(String[] args) {
        Dog dog = new Dog();

        System.out.println(dog.name);

        System.out.println(dog.breed);
        System.out.println(dog.age);
        System.out.println(dog.color);

        // Modifying class attributes
        dog.breed = "Golden Retriever";
        dog.age = 3;
        dog.color = "Golden";

        System.out.println("\nAfter modifying:");
        System.out.println(dog.breed);
        System.out.println(dog.age);
        System.out.println(dog.color);


    }
}
