//Problem: Single Number
//Link:
https://leetcode.com/problems/single-number/description/
//Easy Level
//Approach: i used exor bit operation. we know that exor with same number returns null.......
            //time complexity will be O(n)
class Solution {
    public int singleNumber(int[] nums) {
        int exor=0;
        for(int num=0; num<nums.length; num++){
            exor=exor^nums[num];
            
       }
       return exor;
    }
}
