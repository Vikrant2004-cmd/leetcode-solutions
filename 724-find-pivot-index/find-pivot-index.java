class Solution {
    public int pivotIndex(int[] nums) {
        int[] runningsum = new int[nums.length];
        runningsum[0] = nums[0];
        for(int i = 1 ; i<nums.length;i++){
            runningsum[i] = runningsum[i-1] + nums[i];
        } 
        int high = runningsum.length-1;
        for(int i = 0;i<runningsum.length;i++){
            if(runningsum[i]-nums[i]==runningsum[high]-runningsum[i]){
                return i ; 
            }
        } 
        return -1;      
    }
}