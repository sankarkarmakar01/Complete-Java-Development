package oop.abstraction;

class General extends MyAbstractClass {
    @Override
    void greet() {
        System.out.println("Hello, I am a child method.");
    }

    // This is not Possible because the hello() method is final
//    @Override
//    void hello() {
//
//    }
}

public class Main {
    public static void main(String[] args) {
        General obj = new General();
        obj.greet();
        obj.fun();
        obj.hello();

//        MyAbstractClass obj2 = new MyAbstractClass() {
//            @Override
//            void greet() {
//
//            }
//        };

    }
}
