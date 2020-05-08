/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
121
*/
class BuySellStock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for (int i = 0; i< prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
                }else{
                profit = Math.max(profit, prices[i] - buy);
            }

            }

        return profit;

    }
}
