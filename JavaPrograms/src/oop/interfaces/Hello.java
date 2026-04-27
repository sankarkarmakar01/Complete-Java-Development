package oop.interfaces;

public class Hello implements FunctionalInterface{
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new Hello().hello();
    }
}
