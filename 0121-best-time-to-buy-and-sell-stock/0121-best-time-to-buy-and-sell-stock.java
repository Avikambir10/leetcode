class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int maxi = 0;
        int profit = 0;
        for (int price : prices) {
            if (min_price > price) {
                min_price = price;
            }

            profit = price - min_price;

            if (profit > maxi) {
                maxi = profit;
            }
        }

        return maxi;
    }
}