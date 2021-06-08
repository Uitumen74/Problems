package LeetCode;

public class GreatestCommonDivisorofStrings {
	public static void main(String args[]) {
		String str1 = "";
		String str2 = "";
		String n = gcdOfStrings(str1, str2);
		System.out.print(n);
	}

	public static String gcdOfStrings(String str1, String str2) {
		int n = str2.length();
		int tool = 0;
		if (str1.length() % str2.length() != 0)
			return "";
		for (int i = 0; i < str1.length() / str2.length(); i += str2.length()) {
			if (str1.substring(i, i + n) == str2) {
				tool++;
			}
		}
		if (str1.length() / n == tool) {
			int b = 2;
			if (n % 2 != 0)
				return str2;
			for (int k = 0; k < n; k += b) {
				for (int j = 2; j < n / 2; j++) {
					if (str2.substring(k, k + j) == str2.substring(k + j, k + j + j)) {
						return str2.substring(k, k + j);
					}
				}
				b++;
			}
		}
		return "";
	}
}
