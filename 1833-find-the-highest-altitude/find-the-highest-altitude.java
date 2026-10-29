class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int j = 1;
        for(int i = 0 ; i < gain.length ; i++ ){
            altitude[j] = gain[i] + altitude[j-1];
            j++;
        }
        int maxaltitude = altitude[0];
        for(int i = 1 ; i < altitude.length ; i++){
            if(altitude[i]> maxaltitude){
                maxaltitude = altitude[i];
            }
        }
        return maxaltitude;
        
    }
}