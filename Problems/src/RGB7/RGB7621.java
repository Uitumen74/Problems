package RGB7;

import java.util.Scanner;

public class RGB7621 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n > 200)
			System.out.print("Aldaa");
		int res = Counter(n);
		System.out.print(res);
	}

	public static int Counter(int n) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n / 2; i++) {
			sum = 0;
			for (int j = i + 1; j < n; j++) {
				if (i + j > n) {
					break;
				}
				if (i + j < n) {
					sum += j;
				}
				if (i + j == n) {
					count++;
				}
			}
		}
		return count;
	}
}
