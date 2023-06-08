package popular_problems.max_profit;

public class MaxProfit {



    public static void main(String[] args) {
        int luka = maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        System.out.println(luka);
    }

    private static int maxProfit(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }
}
