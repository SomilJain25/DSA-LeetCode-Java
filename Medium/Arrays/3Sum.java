//Problem: 3 Sum
//Link:
https://leetcode.com/problems/3sum/description/
// Medium Level
//Approach:  generate all possible triplets and compare the sum of every triplet with the given target. 
            //If the sum is equal to target, return true
// this take time complexity of O(n)

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int target = -nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int c = target - nums[j];
                // FIX: ensure c comes from previous index
                if (map.containsKey(c)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], c);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                // put AFTER check to avoid same element reuse
                map.put(nums[j], j);
            }
        }
        return new ArrayList<>(set);
    }
}
