class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int target2 = numbers[left]+numbers[right];
            if(target2==target){
                return new int[]{left+1,right+1};
            }
            else if(target2>target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
        
    }
}