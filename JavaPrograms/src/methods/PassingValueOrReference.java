package methods;

class Dog {
    String name;
}

public class PassingValueOrReference {
    public static void changeNumber(int num) {
        num = 50; // We only changed the 'photocopy'
    }

    public static void renameDog(Dog d) {
        d.name = "Buddy"; // We followed the 'key' to the house and painted the walls.
    }

    public static void main(String[] args) {
        int x = 10;
        changeNumber(x);
        System.out.println("Main x: " + x); // Still prints 10!

        Dog myDog = new Dog();
        myDog.name = "Rex";

        renameDog(myDog);
        System.out.println(myDog.name); // Prints "Buddy"!

    }
}