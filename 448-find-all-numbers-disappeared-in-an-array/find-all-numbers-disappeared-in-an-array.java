class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);

        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        int i = 0;

        for (int num = 1; num <= n; num++) {
            while (i < n && nums[i] < num) {
                i++;
            }

            if (i == n || nums[i] != num) {
                result.add(num);
            }
        }

        return result;
    }
}