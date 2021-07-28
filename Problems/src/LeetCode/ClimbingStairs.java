package LeetCode;

/**
 *
 * @author uitumen.t
 */
public class ClimbingStairs {

    public static void main(String args[]) {
        int n = 6;
        System.out.println(climbStairs(n));
    }

    static public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int sum = 0;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        for (int i = 1; i <= n - 2; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
