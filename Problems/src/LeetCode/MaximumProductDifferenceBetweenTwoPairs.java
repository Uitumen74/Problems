package LeetCode;

import java.util.Arrays;

/**
 *
 * @author uitumen.t
 */
public class MaximumProductDifferenceBetweenTwoPairs {

    public static void main(String args[]) {
        int[] arr = {4,2,5,9,7,4,8};
        System.out.println(maxProductDifference(arr));
    }

    static public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] * nums[nums.length - 2] - nums[0] * nums[1];
    }
}
