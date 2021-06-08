package LeetCode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberofGoodPairs {
	public static void main(String args[]) {
		int[] arr = { 1, 1, 1, 1 };
		int n = numIdenticalPairs(arr);
		System.out.print(n);
	}

	public static int numIdenticalPairs(int[] nums) {
		Arrays.sort(nums);
		int ret = 0;
		int c = nums[0];
		int k = 0;
		int[] arr = new int[nums.length];
		Arrays.fill(arr, 0);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == c) {
				arr[k] += 1;
			} else {
				c = nums[i];
				k++;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			int b = arr[j] / 2;
			if (arr[j] != 0) {
				if (arr[j] % 2 == 0) {
					ret += ((arr[j] + 1) * b);
				} else {
					ret += (((arr[j] + 1) * b) + b + 1);
				}
			}
		}
		return ret;
	}
}
