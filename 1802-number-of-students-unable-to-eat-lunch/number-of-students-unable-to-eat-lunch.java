class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count1 = 0 ;
        int count0 = 0;
        int sandwich = 0;
        for(int i = 0 ; i < students.length ; i++){
            if(students[i]==0){
                count0++;
            }
            else{
                count1++;
            }
        }
        while((count0 + count1) != 0 ){
            if(sandwiches[sandwich]==0 && count0 == 0){
                break;
            }
            else if (sandwiches[sandwich] == 1 && count1 == 0){
                break;

            }
            if(sandwiches[sandwich]==0){
                count0--;
                sandwich++;
            }
            else{
                count1--;
                sandwich++;
            }
        }
        return count0 + count1;



        
    }
}