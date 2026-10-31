
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];

        int i = 0;
        int j = 0;
        int k = 0;

        
        while (i < n && j < m) {

            if (nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                i++;
            } 
            else {
                merged[k] = nums2[j];
                j++;
            }

            k++;
        }

       
        while (i < n) {
            merged[k] = nums1[i];
            i++;
            k++;
        }

        
        while (j < m) {
            merged[k] = nums2[j];
            j++;
            k++;
        }

        
        int total = n + m;

        if (total % 2 != 0) {
            return merged[total / 2];
        } 
        else {
            int mid1 = total / 2 - 1;
            int mid2 = total / 2;

            return (merged[mid1] + (double) merged[mid2]) / 2;
        }
    }
}
