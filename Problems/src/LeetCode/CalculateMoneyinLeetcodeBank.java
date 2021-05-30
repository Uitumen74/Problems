package LeetCode;

public class CalculateMoneyinLeetcodeBank {
	public static void main(String args[]) {
		int n = 20;
		int res = totalMoney(n);
		System.out.print(res);
	}

	public static int totalMoney(int n) {
		int c = 1, sum = 0;
		while (n != 0) {
			for (int i = c; i < c + 7; i++) {
				if (n == 0) {
					break;
				}
				sum += i;
				n--;
			}
			c++;
		}
		return sum;
	}
}
