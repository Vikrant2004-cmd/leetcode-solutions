class Solution {
    public int maximumWealth(int[][] accounts) {
        int currentwealth = 0 ;
        int maxwealth = 0;
        for(int i = 0 ; i < accounts.length ; i++){
            for(int j = 0; j < accounts[0].length ; j++){
                currentwealth = currentwealth + accounts[i][j];
            }
            if(currentwealth>maxwealth){
                maxwealth = currentwealth;
            }
            currentwealth = 0;
        }
        return maxwealth;
        
    }
}