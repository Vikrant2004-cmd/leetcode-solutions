class Solution {
    public void moveZeroes(int[] nums) {
        int place = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }
            else{
                nums[place]=nums[i];
                if(i!=place){
                    nums[i]=0;
                }
                place++;
            }
        }

    }
}
        