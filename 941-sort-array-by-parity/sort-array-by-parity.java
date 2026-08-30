class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1){
            return nums;
        }
        int[] sortedarray = new int[nums.length];
        int evenplace = 0;
        int oddplace = sortedarray.length-1;
        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i]%2==0){
                sortedarray[evenplace]=nums[i];
                evenplace++;
            }
            else{
                sortedarray[oddplace]=nums[i];
                oddplace--;
            }
        }
        return sortedarray;
        
    }
}