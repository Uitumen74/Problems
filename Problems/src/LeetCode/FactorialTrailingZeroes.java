package LeetCode;

public class FactorialTrailingZeroes {
	public static void main(String args[]) {
		int n = 10;
		n = trailingZeroes(n);
		System.out.print(n);
	}

	public static int trailingZeroes(int n) {
		long fac = 1;
		int tool = 0;
		for (int i = 1; i <= n; i++) {
			fac = fac * i;
		}
		String str = Long.toString(fac);
		for (int j = str.length() - 1; j >= 0; j--) {
			if (str.charAt(j) == '0') {
				tool++;
			} else {
				return tool;
			}
		}
		return tool;
	}
}
