package RGB7;

import java.util.Scanner;

public class RGB7312 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = Fac(n);
		if (res == -1)
			System.out.print("No");
		else
			System.out.print(res - 1);
	}

	public static int Fac(int n) {
		int c = 1;
		int i = 1;
		while (c < n) {
			c *= i;
			i++;
		}
		if (c == n)
			return i;
		return -1;
	}
}
