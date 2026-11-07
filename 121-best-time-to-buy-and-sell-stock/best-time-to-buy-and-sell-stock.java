class Solution {
    public int maxProfit(int[] prices) {
        int yetmin = Integer.MAX_VALUE;
        int profit = 0 ; 
        int maxprofit  = 0 ;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i]<yetmin){
                yetmin = prices[i];
            }
            profit = prices[i] - yetmin;
            if(profit>maxprofit){
                maxprofit = profit ;
            }

        }
        return maxprofit ;  
    }

}