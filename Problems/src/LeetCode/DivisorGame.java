package LeetCode;

public class DivisorGame {

    public static void main(String args[]) {
        int n = 4;
        boolean b = divisorGame(n);
        System.out.println(b);
    }

    public static boolean divisorGame(int n) {
        int Alice_win = 0;
        while (n > 1) {
            n--;
            Alice_win ^= 1;
        }
        return Alice_win != 0;
    }
}
