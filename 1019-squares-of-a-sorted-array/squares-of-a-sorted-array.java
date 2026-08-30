class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] squares = new int[nums.length];

        int minimumIndex = 0;
        int minimum = Math.abs(nums[0]);

        for (int k = 1; k < nums.length; k++) {

            if (Math.abs(nums[k]) < minimum) {
                minimum = Math.abs(nums[k]);
                minimumIndex = k;
            }
        }

        int i = 0;
        squares[i] = nums[minimumIndex] * nums[minimumIndex];
        i++;

        int left = minimumIndex - 1;
        int right = minimumIndex + 1;
        while (left >= 0 || right < nums.length) {
            if (left < 0) {
                squares[i] = nums[right] * nums[right];
                i++;
                right++;
            }
            else if (right == nums.length) {
                squares[i] = nums[left] * nums[left];
                i++;
                left--;
            }
            else {
                if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                    squares[i] = nums[left] * nums[left];
                    i++;
                    left--;
                }
                else {
                    squares[i] = nums[right] * nums[right];
                    i++;
                    right++;
                }
            }
        }

        return squares;
    }
}