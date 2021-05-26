package LeetCode;

public class RichestCustomerWealth {

	public static void main(String args[]) {
		int[][] arr = { { 2, 8, 7 }, { 7, 1, 3 }, { 1, 9, 5 } };
		int n = maximumWealth(arr);
		System.out.println(n);
	}

	public static int maximumWealth(int[][] accounts) {
		int sum = 0;
		int max = 0;
		for (int i = 0; i < accounts.length; i++) {
			sum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			max = Math.max(max, sum);
		}
		return max;
	}
}
