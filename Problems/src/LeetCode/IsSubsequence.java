package LeetCode;

/**
 *
 * @author uitumen.t
 */
public class IsSubsequence {

    public static void main(String args[]) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    static public boolean isSubsequence(String s, String t) {
        int point = 0;
        int tool = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = point; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    tool++;
                    point = j + 1;
                    break;
                }
            }
        }
        return s.length() == tool;
    }
}
