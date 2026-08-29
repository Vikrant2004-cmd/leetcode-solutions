class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            char ch = s.charAt(left);
            char ch2 = s.charAt(right);
            if(Character.isLetterOrDigit(ch) && Character.isLetterOrDigit(ch2)){
                ch = Character.toLowerCase(ch);
                ch2 = Character.toLowerCase(ch2);
                if(ch==ch2){
                    left++;
                    right--;
                    
                }
                else{
                    return false;
                }
                
            }
            else if(!Character.isLetterOrDigit(ch)){
                left++;

            }
            else{
                right--;
            }

        }
        return true;
        
    }
}