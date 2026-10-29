class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double  currentlength = 0;
        double  currentaverage = 0 ; 
        double maxaverage = Double.NEGATIVE_INFINITY; 
        double  currentsum = 0;
        for(int i = 0 ; i< nums.length ; i++){
            currentsum = currentsum + nums[i];
            currentlength++;
            if(currentlength == k){
                currentaverage = currentsum / k ; 
                if(currentaverage > maxaverage){
                    maxaverage = currentaverage ; 
                }
                currentsum = currentsum - nums[i-k+1];
                currentlength = currentlength-1 ;

            }

        }
        return maxaverage ;


    }
}