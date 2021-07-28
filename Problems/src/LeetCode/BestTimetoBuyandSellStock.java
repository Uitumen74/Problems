package LeetCode;

/**
 *
 * @author uitumen.t
 */
public class BestTimetoBuyandSellStock {

    public static void main(String args[]) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    static public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}
