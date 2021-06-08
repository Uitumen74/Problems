package RGB7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RGB7276 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][10];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		List<String> res = Lumberjack(n, arr);
		for (String l : res) {
			System.out.println(l);
		}
	}

	public static List<String> Lumberjack(int n, int[][] arr) {
		ArrayList<String> res = new ArrayList<>();
		res.add("Lumberjacks:");
		ArrayList<Integer> list = new ArrayList<>(10);
		int tool;
		for (int i = 0; i < n; i++) {
			tool = 0;
			for (int j = 0; j < 10; j++) {
				list.add(arr[i][j]);
			}
			ArrayList<Integer> sorted = (ArrayList<Integer>) list.clone();
			Collections.sort(list);
			int c = 9;
			for (int a = 0; a < 5; a++) {
				if (sorted.get(a) == list.get(a + c)) {
					tool++;
				}
				c -= 2;
			}
			if (tool == 5) {
				res.add("Ordered");
			} else if (sorted.equals(list)) {
				res.add("Ordered");
			} else {
				res.add("Unordered");
			}
			list.clear();
		}
		return res;
	}
}
