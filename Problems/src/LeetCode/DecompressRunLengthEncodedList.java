package LeetCode;

import java.util.Stack;

public class DecompressRunLengthEncodedList {
	public static void main(String args[]) {
		int[] arr = { 1, 1, 2, 3 };
		int[] ret = decompressRLElist(arr);
		for (int i : ret) {
			System.out.print(i);
		}
	}

	public static int[] decompressRLElist(int[] nums) {
		Stack<Integer> arr = new Stack<>();
		for (int i = 0; i < nums.length; i += 2) {
			for (int j = 0; j < nums[i]; j++) {
				arr.add(nums[i + 1]);
			}
		}
		int[] n = new int[arr.size()];
		for (int a = 0; a < arr.size(); a++) {
			n[a] = arr.get(a);
		}
		return n;
	}
}
