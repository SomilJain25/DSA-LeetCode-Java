//Problem: Two Sum
//Link:
https://leetcode.com/problems/two-sum/
//Easy Level
//Approach: i used hashmap to store pair and check if exist in map.this take time complexity O(n) ......

class Solution {
    public int[] twoSum(int [] num,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
         for (int j = 0; j < num.length; j++) {
            int pair = target - num[j];

            if (map.containsKey(pair)) {
                return new int[] {j, map.get(pair)};
            } 
            else {
                map.put(num[j],j);
            }
        }
        return new int[]{};
    }
}
