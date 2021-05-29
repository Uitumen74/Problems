package RGB7;

import java.util.Scanner;

public class RGB7560 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
		double max, min;
		int maxP, minP;
		if (arr[0] < arr[1]) {
			max = arr[1];
			min = arr[0];
			minP = 0;
			maxP = 1;
		} else {
			max = arr[0];
			min = arr[1];
			minP = 1;
			maxP = 0;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxP = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				minP = i;
			}
		}
		double s = arr[maxP];
		arr[maxP] = arr[minP];
		arr[minP] = s;
		int count = 1;
		for (double ar : arr) {
			System.out.print(String.format("%.2f", ar));
			if (count < n) {
				count++;
				System.out.print(" ");
			}
		}
	}

}
