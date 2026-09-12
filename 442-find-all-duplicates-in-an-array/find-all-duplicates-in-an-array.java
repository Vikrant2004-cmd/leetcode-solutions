class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int x = Math.abs(nums[i]);
            int index = x - 1;

            if (nums[index] < 0) {
                ans.add(x);
            } else {
                nums[index] = -nums[index];
            }
        }

        return ans;
    }
}