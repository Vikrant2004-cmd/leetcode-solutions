class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ; 
        int requiredsum = (n*n+n ) / 2 ; 
        int sum = 0 ; 
        for(int i = 0 ; i < nums.length ; i++ ){
            sum +=nums[i];
        }
        int missing = requiredsum - sum ; 
        return missing ;
        
    }
}