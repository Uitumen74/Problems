package LeetCode;

public class CountingBits {

    public static void main(String args[]) {
        int n = 5;
        int[] arr = countBits(n);
        System.out.println(arr);
    }

    static public int[] countBits(int num) {
        int[] arr = new int[num + 1];
        for (int i = 0; i < num + 1; i++) {
            arr[i] = i;
        }
        int[] count = new int[num + 1];
        count[0] = 0;
        for (int i = 1; i < num + 1; i++) {
            while (arr[i] != 0) {
                arr[i] = arr[i] & (arr[i] - 1);
                count[i]++;
            }
        }
        return count;
    }
}
