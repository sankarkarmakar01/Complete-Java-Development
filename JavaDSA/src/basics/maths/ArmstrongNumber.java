package basics.maths;

public class ArmstrongNumber {

    public static void main(String[] args) {
        String ans = new ArmstrongNumber().isArmstrong(371);
        System.out.println(ans);
    }

    int countDigit(int num) {
        if (num == 0)
            return 1;
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    String isArmstrong(int num) {
        int ans = 0, temp = num;
        int count = countDigit(num);
        while (num > 0) {
            int rem = num % 10;
            ans = (int) (ans + Math.pow(rem, count));
            num /= 10;
        }
        if (temp == ans)
            return "Armstrong Number";
        return "Not Armstrong Number";
    }
}
