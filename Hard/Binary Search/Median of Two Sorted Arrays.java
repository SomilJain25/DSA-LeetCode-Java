//Problem: Median of Two Sorted Arrays
//Link:
https://leetcode.com/problems/median-of-two-sorted-arrays/
// Hard Level
//Approach: low high approach or mid level;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int m = nums1.length;
        int n = nums2.length;

        int low = 0, high = m;

        while (low <= high) {
            int divide_1=(low+high)/2;
            int divide_2=(m+n+1)/2-divide_1;

            int left_1,left_2,right_1,right_2;
            if(divide_1==0){
                left_1=Integer.MIN_VALUE;
            }
            else{
                left_1=nums1[divide_1 - 1];
            }
            if(divide_2==0){
                left_2=Integer.MIN_VALUE;
            }
            else{
                left_2=nums2[divide_2-1];
            }

            if(divide_1==m){
                right_1=Integer.MAX_VALUE;
            }
            else{
                right_1=nums1[divide_1];
            }
            
            if(divide_2==n){
                right_2=Integer.MAX_VALUE;
            }
            else{
                right_2=nums2[divide_2];
            }

            if(left_1<=right_2 && left_2<=right_1){
                if((m+n)%2==0){
                    return (Math.max(left_1,left_2)+Math.min(right_1,right_2))/2.0;
                }
                else{
                    return (Math.max(left_1,left_2));
                }
            }
            else if(left_1>right_2){
                high=divide_1-1;
            }
            else{
                low=divide_1+1;
            }
        }
        return 0.0;
    }
}
