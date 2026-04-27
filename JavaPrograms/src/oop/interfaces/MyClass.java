package oop.interfaces;


public class MyClass {
    public static void main(String[] args) {
        LightBulb lightBulb = new LightBulb();
        lightBulb.turnOn();
        lightBulb.turnOff();
        Fan fan = new Fan();
        fan.turnOn();
        fan.turnOff();
        fan.speedUp();
        fan.speedDown();
    }
}
