class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0, current_profit, min_price = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_price)
                min_price = prices[i];
            current_profit = prices[i] - min_price;
            if (current_profit > max_profit)
                max_profit = current_profit;
        }
        return max_profit;
    }
}