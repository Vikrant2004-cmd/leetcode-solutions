class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0 ; 

        for(int i = 0 ; i<nums.length ; i++){
            int countdigit = 0;
            int num = nums[i];
            while(num>0){
                countdigit++;
                num = num/10;
            }
            if(countdigit%2==0){
                evencount++;
            }
        }
        return evencount;
        
    }
}