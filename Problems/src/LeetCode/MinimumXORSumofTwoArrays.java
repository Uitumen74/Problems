package LeetCode;

import java.util.Arrays;

public class MinimumXORSumofTwoArrays {

	public static void main(String[] args) {
		int[] num1 = { 1, 0, 3 };
		int[] num2 = { 5, 3, 4 };
		int res = minimumXORSum(num1, num2);
		System.out.println(res);
	}

	public static int minimumXORSum(int[] nums1, int[] nums2) {
		int sum = 0;
		int c = 0;
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		for (int i = nums1.length - 1; i >= 0; i--) {
			sum = sum + ((nums1[i] - nums2[c]) * (-1));
			c++;
		}
		return sum;
	}
}
