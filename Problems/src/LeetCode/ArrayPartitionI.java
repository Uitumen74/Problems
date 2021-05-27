package LeetCode;

import java.util.Arrays;

public class ArrayPartitionI {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 3, 2 };
		Arrays.sort(arr);
		int res = arrayPairSum(arr);
		System.out.println(res);
	}

	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int res = 0;
		for (int i = 0; i < nums.length - 1; i += 2) {
			res += Math.min(nums[i], nums[i + 1]);
		}
		return res;
	}
}
