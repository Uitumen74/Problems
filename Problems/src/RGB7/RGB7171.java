package RGB7;

import java.util.Scanner;

public class RGB7171 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int davhar = sc.nextInt();
		int orts = sc.nextInt();
		int haalga = sc.nextInt();
		int a = 0, b = 0, c = 0, niit = 0;
		int n = sc.nextInt();
		niit = davhar * haalga;
		if (n % niit == 0 && n / niit > 0) {
			a = n / niit;
			b = davhar;
			c = haalga;
		} else {
			a = n / niit + 1;
			b = n % niit / haalga;
			if (n % niit % b == 0)
				c = haalga;
			else
				c = n % niit % b;
		}
		System.out.format("%d %d %d", a, b, c);
	}
}
