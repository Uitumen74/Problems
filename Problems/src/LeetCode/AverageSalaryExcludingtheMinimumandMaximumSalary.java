package LeetCode;

import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary {
	public static void main(String args[]) {
		int[] n = { 48000, 59000, 99000, 13000, 78000, 45000, 31000, 17000, 39000, 37000, 93000, 77000, 33000, 28000,
				4000, 54000, 67000, 6000, 1000, 11000 };
		double b = average(n);
		System.out.print(b);
	}

	public static double average(int[] salary) {
		Arrays.sort(salary);
		double sum = 0;
		for (int i = 1; i < salary.length - 1; i++) {
			sum += salary[i];
		}
		double b = sum / (salary.length - 2);
		return b;
	}
}
