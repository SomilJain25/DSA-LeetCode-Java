//Problem: Maximum Subarray
//Link:
https://leetcode.com/problems/maximum-subarray/description/
//Medium Level
//Approach: kadane's algorithm
// it take time complexity of O(n);
class Solution {
    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int endsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            endsum=Math.max(endsum+nums[i],nums[i]);
            result=Math.max(endsum,result);
        }
        return result;
    }
}
