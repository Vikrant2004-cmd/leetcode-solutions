class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        int count = (arr.length)/4;
        int currentcount = 1;
        int currentelement = arr[0];
        for(int i = 1; i<arr.length;i++){
            if(arr[i]==currentelement){
                currentcount++;
                if(currentcount>count){
                    return arr[i];
                }

            }
            else{
                currentelement = arr[i];
                currentcount = 1;
            }

        }
        return 0;
        
    }
}