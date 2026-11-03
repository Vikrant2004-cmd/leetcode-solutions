class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0 ;
        int[] prefixsum = new int[nums.length];
        prefixsum[0] = nums[0];
        for( int i = 1 ; i < nums.length ; i++){
            prefixsum[i] = prefixsum[i-1] + nums[i];

        }
        HashMap<Integer,Integer> map = new HashMap<>();
        
        map.put(0,1);
        for(int num : prefixsum){
            int required  = num - k;
            if(map.containsKey(required)){
                count = count + map.get(required) ;

            }
            map.put(num , map.getOrDefault(num,0)+1);
        }
        return count ; 

        
        
    }
}