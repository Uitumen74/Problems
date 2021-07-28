package LeetCode;

/**
 *
 * @author uitumen.t
 */
public class subMaxArray {

    public static void main(String args[]) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(subMax(arr));
    }

    static private int subMax(int[] arr) {
        int localMax = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            localMax = Integer.max(arr[i], arr[i] + localMax);
            if (localMax > max) {
                max = localMax;
            }
        }
        return max;
    }
}
