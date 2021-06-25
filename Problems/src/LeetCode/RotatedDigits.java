package LeetCode;

public class RotatedDigits {

    public static void main(String args[]) {
        int n = 857;
        n = rotatedDigits(n);
        System.out.println(n);
    }

    static public int rotatedDigits(int n) {
        int count = 0;
        int k;
        int bit, step1, step2, c;
        for (int i = 1; i <= n; i++) {
            bit = 0;
            step1 = 0;
            step2 = 0;
            k = i;
            while (k != 0) {
                c = i % 10;
                bit++;
                if (c == 2 || c == 5 || c == 6 || c == 9) {
                    step1++;
                } else if (c == 0 || c == 1 || c == 8) {
                    step2++;
                }
                k /= 10;
            }
            if (step1 != 0 && bit == (step1 + step2)) {
                count++;
            }
        }
        return count;
    }
}
