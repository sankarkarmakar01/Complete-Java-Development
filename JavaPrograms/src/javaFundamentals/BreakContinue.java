package javaFundamentals;

public class BreakContinue {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if(i==10){
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
