package LeetCode;

public class FibonacciNumber {

    public static void main(String args[]) {
        int n = 10;
        n = fib(n);
        System.out.println(n);
    }

    static public int fib(int n) {
        int[] arr = new int[n + 2];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
