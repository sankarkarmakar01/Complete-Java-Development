//* Palindrome number

package basics.maths;


public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int add = 0;
        while (x > 0) {
            int rem = x % 10;
            add = (add * 10) + rem;
            x /= 10;
        }
        if (temp == add) {
            return true;
        }
        return false;
    }
}