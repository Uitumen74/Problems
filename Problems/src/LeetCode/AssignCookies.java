package LeetCode;

import java.util.Arrays;

public class AssignCookies {
	public static void main(String args[]) {
		int[] g = { 10, 9, 8, 7 };
		int[] s = { 5, 6, 7, 8 };
		int n = findContentChildren(g, s);
		System.out.println(n);
	}

	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int j = 0;
		for (int i = 0; i < s.length && j < g.length; i++) {
			if (g[j] <= s[i]) {
				++j;
			}
		}
		return j;
	}
}
