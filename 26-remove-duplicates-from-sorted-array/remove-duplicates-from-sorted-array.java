class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1 ; 

        }
        int k = 1 ; 
        int chaal = nums[0];
        int j = 1 ; 
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i]!=chaal){
                nums[j] = nums[i];
                k++;
                j++;
                chaal = nums[i];

            }

        }
        return k ; 
    }
}