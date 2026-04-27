package oop.inheritance;

class Vehicle {
    void drive() { // Renamed for clarity
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Car is driving fast");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.drive();

        Car car = new Car();
        car.drive();

        // Dynamic Method Dispatch
        Vehicle myCar = new Car();
        myCar.drive(); // Prints: "Car is driving fast"

        Vehicle car1 = new Car();
        if (car1 instanceof Car) {
            ((Car) car1).drive(); // This works!
        }

    }
}
