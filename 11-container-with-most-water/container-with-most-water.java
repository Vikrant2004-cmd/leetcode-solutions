class Solution {
    public int maxArea(int[] height) {
        int currentwater = 0;
        int maxwater = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            int minimum = Math.min(height[left],height[right]);
            currentwater = minimum*(right-left);
            if(currentwater>maxwater){
                maxwater=currentwater;
            }
            if(minimum==height[left]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxwater;
        
    }
}