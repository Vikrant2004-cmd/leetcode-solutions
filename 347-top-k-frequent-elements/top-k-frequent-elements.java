class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency store karo
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] answer = new int[k];

        for (int i = 0; i < k; i++) {

            int maxFrequency = 0;
            int element = 0;

            // Highest frequency dhundo
            for (int key : map.keySet()) {

                if (map.get(key) > maxFrequency) {
                    maxFrequency = map.get(key);
                    element = key;
                }
            }

            answer[i] = element;

            // Taaki next iteration mein ye dobara na aaye
            map.remove(element);
        }

        return answer;
    }
}