package LeetCode;

public class LongerContiguousSegmentsofOnesthanZeros {
	public static void main(String args[]) {
		String n = "110100010";
		boolean b = checkZeroOnes(n);
		System.out.println(b);
	}

	public static boolean checkZeroOnes(String s) {
		char prev = s.charAt(0);
		int num = 0;
		int[] stack = { 0, 0 };
		for (char c : s.toCharArray()) {
			if (c == '1') {
				if (prev == '1') {
					num++;
				}
				if (prev == '0') {
					if (stack[0] < num) {
						stack[0] = num;
					}
					num = 1;
					prev = '1';
				}
			} else if (c == '0') {
				if (prev == '0') {
					num++;
				}
				if (prev == '1') {
					if (stack[1] < num) {
						stack[1] = num;
					}
					num = 1;
					prev = '0';
				}
			}
		}
		if(num != 0) {
			if(prev == '0') {
				if (stack[0] < num) {
					stack[0] = num;
				}
			}
			if(prev == '1') {
				if (stack[1] < num) {
					stack[1] = num;
				}
			}
		}
		if(stack[0] < stack[1]) return true;
		return false;
	}
}
