class Solution {
    public int maxProfit(int[] prices) {
        int yetmin = prices[0];
        int profit  = 0 ; 
        int maxprofit = 0 ; 
        for(int i = 1 ; i < prices.length ; i ++){
            if(prices[i]< yetmin){
                yetmin = prices[i];

            }
            else{
                profit = prices[i] - yetmin;
                maxprofit = Math.max(profit,maxprofit);
            }
        }
        return maxprofit ;
    }
}