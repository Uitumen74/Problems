package LeetCode;

public class BestTimetoBuyandSellStockII {

    public static void main(String args[]) {
        int[] n = {7, 6, 4, 3, 1};
        int c = maxProfit(n);
        System.out.println(c);
    }

    static public int maxProfit(int[] prices) {
        int sum = 0;
        int b = prices[0];
        int s = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length - 1; i++) {
            if (s != Integer.MIN_VALUE && prices[i] < s) {
                sum += (s - b);
                s = Integer.MIN_VALUE;
                b = prices[i];
            } else if (prices[i] < b) {
                b = prices[i];
            } else if (prices[i] >= b) {
                if (prices[i] >= s) {
                    s = prices[i];
                } else if (prices[i] < s) {
                    sum += (s - b);
                    b = prices[i];
                    s = Integer.MIN_VALUE;
                }
            }
        }
        if (prices[prices.length - 1] > s) {
            s = prices[prices.length - 1];
        }
        if (s > b) {
            sum += (s - b);
        }
        return sum;
    }
}
