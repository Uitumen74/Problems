package LeetCode;

import java.util.Arrays;

public class ShuffletheArray {
	public static void main(String args[]) {
		int[] arr = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		int[] a = shuffle(arr, n);
		System.out.println(Arrays.toString(a));
	}

	public static int[] shuffle(int[] nums, int n) {
		int[] res = new int[nums.length];
		int b = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			res[b] = nums[i];
			b++;
			res[b] = nums[i + n];
			b++;
		}
		return res;
	}
}
