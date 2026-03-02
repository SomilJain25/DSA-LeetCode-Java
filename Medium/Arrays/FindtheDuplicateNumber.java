//Problem: Find the Duplicate Number
//Link:
https://leetcode.com/problems/find-the-duplicate-number/description/
// Medium Level
//Approach: i used hashset to store numbers and if already contains then return that number othervise add the set;
// this take time complexity of O(n)
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i]; 
            }
            set.add(nums[i]);
        }
    return -1;
    }
}
