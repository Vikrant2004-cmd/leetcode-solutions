class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int place = 0;
        for(int i = 0;i<nums.length;i++){
            squares[place]=nums[i]*nums[i];
            place++;
        }
        Arrays.sort(squares);
        return squares;
        
    }
}