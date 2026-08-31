class Solution {
    public int maxProfit(int[] prices) {
        int minimumprice = prices[0];
        int currentprofit = 0;
        int maxprofit = 0;
        for(int i = 0; i<prices.length;i++){
            if(prices[i]<minimumprice){
                minimumprice = prices[i];
                continue;
            }
            else{
                currentprofit = prices[i]-minimumprice;
                if(currentprofit>maxprofit){
                    maxprofit = currentprofit;
                }
            }
        }
        return maxprofit;
        
    }
}