class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlength = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        for(int num : set) {
            if(!set.contains(num - 1)) {
                int endposition = num;
                int length = 0;

                while(set.contains(endposition)) {
                    length++;
                    endposition++;
                }

                maxlength = Math.max(length, maxlength);
            }
        }

        return maxlength;
    }
}