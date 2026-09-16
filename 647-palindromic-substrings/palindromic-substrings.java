class Solution {
    public int countSubstrings(String s) {
        int count = s.length();
        for(int i = 0; i < s.length();i++){
            int left = i-1;
            int right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        for( int i = 0;i<s.length();i++){
            int left = i;
            int right = i+1;
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;


        
    }
}