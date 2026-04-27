package javaFundamentals;

public class VarKeyword {
    public static void main(String[] args) {
        var name = "Sankar"; //* only local scope
        System.out.println(name);
        System.out.println(name.getClass().getName());
        System.out.println(name.getClass().getSimpleName());
        name = "White"; //* it's good but
//        name = 25.0; //* it's not possible, var is also static

    }
}
