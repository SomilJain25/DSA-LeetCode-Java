//Problem: Search in Rotated Sorted Array
//Link:
https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// Medium Level
//Approach: just have to return index;
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        for(int i=0; i<nums.length; i++){
            if(target==nums[i]){
                return i;
            }
        }
        return -1;
    }
}
