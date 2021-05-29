package RGB7;

import java.util.Scanner;

public class RGB7440 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		int a = n;
		char b;
		int k = 0;
		for (int i = a; i <= 90; i++) {
			for (int j = a; j <= i; j++) {
				b = (char) j;
				System.out.print(b);
			}
			k++;
			System.out.print("\n");
		}
	}
}
