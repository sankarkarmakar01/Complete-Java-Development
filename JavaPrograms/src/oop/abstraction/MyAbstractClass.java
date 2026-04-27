package oop.abstraction;

abstract class MyAbstractClass {

    public MyAbstractClass() {
        System.out.println("I am the constructor of a abstract class.");
    }

    abstract void greet();
    void fun() {
        System.out.println("Hello I am from abstract class.");
    }
    final void hello() {
        System.out.println("hello");
    }
}
