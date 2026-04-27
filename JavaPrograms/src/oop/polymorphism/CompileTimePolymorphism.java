package oop.polymorphism;

import java.util.Arrays;

class Demo {
    void fun() {
        System.out.println("Hello, I am a function.");
    }

    void fun(String name) {
        System.out.println("My name is "+name);
    }

    void fun(int[] arr) {
        System.out.println("My job is printing this array: " + Arrays.toString(arr));
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.fun();
        obj.fun("printArr function.");
        int[] arr = {1,2,3,4,5};
        obj.fun(arr);
    }
}
