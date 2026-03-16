//Problem: Count Dominant Indices
//Link:
https://leetcode.com/problems/count-dominant-indices/description/
//Easy Level
//Approach:  calculate totalsum then avg and get the result;

class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        if (n == 1){
          return 0;
        }
        int totalSum = 0;
        for (int x : nums) {
            totalSum += x;
        }
        int rightSum = totalSum;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            rightSum -= nums[i];          // sum of elements to the right
            int avg = rightSum / (n - i - 1);

            if (nums[i] > avg) {
                count++;
            }
        }
        return count;
    }
}
