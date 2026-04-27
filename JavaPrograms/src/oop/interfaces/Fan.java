package oop.interfaces;

// Implementation 2: A Fan
class Fan implements Switchable, Actions {
    @Override
    public void turnOn() {
        System.out.println("Fan: Spinning fast!");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Stopping.");
    }

    @Override
    public void speedUp() {
        System.out.println("Speed Up the fan...");
    }

    @Override
    public void speedDown() {
        System.out.println("Speed down the fan...");
    }
}
