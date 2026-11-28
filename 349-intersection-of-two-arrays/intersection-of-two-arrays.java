class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        int[] result = new int[nums1.length];
        int j = 0 ;
        for(int i = 0 ; i < nums1.length ; i++){
            set1.add(nums1[i]);

        
        }
        for(int i = 0 ; i < nums2.length ;  i ++ ){
            set2.add(nums2[i]);
        }
        for(int num : set1){
            if(set2.contains(num)){
                result[j] = num ; 
                j++;
            }
        }
        return Arrays.copyOfRange(result , 0 , j) ; 
    }
}