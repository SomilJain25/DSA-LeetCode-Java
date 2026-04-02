//Problem: Single Element in a Sorted Array
//Link:
https://leetcode.com/problems/single-element-in-a-sorted-array/description/
// Medium Level
//Approach: high low and mid approach or three pointer approach;
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0;
        int high=nums.length-1;

        while (low<high){
            int mid=low+(high-low)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return nums[low];
    }
}
