package LeetCode;

public class DefanginganIPAddress {
	public static void main(String args[]) {
		String n = "ha.haha.ha";
		String res = defangIPaddr(n);
		System.out.println(res);
	}

	public static String defangIPaddr(String address) {
		StringBuilder str = new StringBuilder();
		for(char c : address.toCharArray())
		{
			str.append(c == '.' ? "[.]" : c);
		}
		return str.toString();
	}
}
