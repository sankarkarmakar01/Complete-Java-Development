package oop.interfaces;

// Implementation 1: A LightBulb
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Glowing bright!");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Darkness...");
    }
}