package oop.inheritance;

class ParentClass {
    void greet() {
        System.out.println("parent");
    }
}

public class SingleInheritance  extends ParentClass {
    String name = "child";
    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        System.out.println(s.name);
        s.greet();
    }
}
