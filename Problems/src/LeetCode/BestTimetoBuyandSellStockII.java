package LeetCode;

public class BestTimetoBuyandSellStockII {

    public static void main(String args[]) {
        int[] n = {1, 2, 3, 4, 5};
        int c = maxProfit(n);
        System.out.println(c);
    }

    static public int maxProfit(int[] prices) {
        int sum = 0;
        int b = prices[0];
        int s = prices[1];
        int l = 0;
        for (int i = 1; i < prices.length - 1; i++) {
            if (prices[i] <= b) {
                if (l == 1) {
                    sum += (s - b);
                    s = prices[i + 1];
                    l = 0;
                }
                b = prices[i];
            } else if (prices[i] > b) {
                if (prices[i] >= s) {
                    s = prices[i];
                    l = 1;
                }
            }
        }
        if (s > b) {
            sum += (s - b);
        }
        return sum;
    }
}
