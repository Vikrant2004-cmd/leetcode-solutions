class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0,1);
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum = sum + nums[i];
            int remainder = ((sum % k) + k ) % k;
            if(map.containsKey(remainder)){
                count = count + map.get(remainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
        return count ; 
        
    }
}