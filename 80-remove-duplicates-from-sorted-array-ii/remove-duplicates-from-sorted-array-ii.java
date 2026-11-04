class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int occur = nums[0];
        int occurcount = 1;
        int j = 1;
        int k = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == occur){
                occurcount++;
            }
            else{
                occur = nums[i];
                occurcount = 1;
            }

            if(occurcount <= 2){
                nums[j] = nums[i];
                j++;
                k++;
            }
        }

        return k;
    }
}