package LeetCode;

import java.util.Arrays;

public class CheckIfNandItsDoubleExist {
	public static void main(String args[]) {
		int[] n = { -10, 12, -20, -8, 15 };
		boolean res = checkIfExist(n);
		System.out.println(res);
	}

	public static boolean checkIfExist(int[] arr) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] * 2 == arr[j]) {
						return true;
					}
				}
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] * 2 == arr[i]) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
