/*
Leetcode problem number : 122
https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
*/
class BuySellStock {
    public int maxProfit(int[] prices) {
        int total = 0;
        for(int i = 0; i< prices.length - 1; i++){
            int c = prices[i] - prices[i+1];
            if(c < 0){
                total += c;
            }
        }
        return (total * -1);

    }
}
