package LeetCode;

import java.util.Arrays;

public class MinimizeMaximumPairSumiArray {
	public static void main(String args[]) {
		int[] n = { 3, 5, 4, 2, 4, 6 };
		int a = minPairSum(n);
		System.out.print(a);
	}

	public static int minPairSum(int[] nums) {
		int c = nums.length - 1;
		Arrays.sort(nums);
		int res = 0;
		int ret = 0;
		for (int i = 0; i < (nums.length / 2); i++) {
			res = nums[i] + nums[i + c];
			c -= 2;
			if (res > ret) {
				ret = res;
			}
		}
		return ret;
	}
}
