class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit  = 0 ;
        int currentprice = prices[0]; 
        for(int i = 1 ; i < prices.length ; i++){
             if(prices[i]>currentprice){
                maxprofit+=prices[i]-currentprice;
                currentprice = prices[i];
             }
             else{
                currentprice = prices[i];
             }

        }
        return maxprofit ; 

    }
}