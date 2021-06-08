package LeetCode;

import java.util.Arrays;

public class HeightChecker {
	public static void main(String args[]) {
		int[] arr = { 1, 1, 4, 2, 1, 3 };
		int n = heightChecker(arr);
		System.out.print(n);
	}

	public static int heightChecker(int[] heights) {
		int[] a = heights.clone();
		Arrays.sort(heights);
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			if (heights[i] != a[i])
				k++;
		}
		return k;
	}
}
