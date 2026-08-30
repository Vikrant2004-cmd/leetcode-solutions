class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int currentunique = nums[0];
        int place = 1;
        int uniquelength = 1;
        for(int i =1;i<nums.length;i++){
            if(nums[i]==currentunique){
                continue;
            }
            else{
                currentunique=nums[i];
                nums[place]=nums[i];
                place++;
                uniquelength++;

            }
        }
        return uniquelength;
        
    }
}