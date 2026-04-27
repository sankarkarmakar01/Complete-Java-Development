package javaFundamentals;

public class SwitchStatements {
    public static void main(String[] args) {
        int day = 5;
        switch (day) {
            case 1, 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
        }
    }
}
