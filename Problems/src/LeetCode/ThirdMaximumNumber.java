package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {

    public static void main(String args[]) {
        int[] arr = {3, 2, 1, 4, 5, 6};
        System.out.println(thirdMax(arr));
    }

    static public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= 3; i++) {
            int max = Integer.MIN_VALUE;
            int pos = -1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= max && !set.contains(nums[j])) {
                    max = nums[j];
                    pos = j;
                }
            }
            if (pos != -1) {
                set.add(max);
            }
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer data : set) {
            max = Math.max(data, max);
            min = Math.min(data, min);
        }
        return set.size() == 3 ? min : max;
    }
}
