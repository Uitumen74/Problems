package LeetCode;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber {
	public static void main(String args[]) {
		int[] arr = { 8, 1, 2, 2, 3 };
		int[] res = smallerNumbersThanCurrent(arr);
		for (int l : res) {
			System.out.print(l);
		}
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int[] arr = new int[nums.length];
		Arrays.fill(arr, 0);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					if (nums[i] > nums[j]) {
						arr[i]++;
					}
				}
			}
		}
		return arr;
	}
}
