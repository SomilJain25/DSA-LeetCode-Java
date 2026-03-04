//Problem: Subarray Sum Equals K
//Link:
https://leetcode.com/problems/subarray-sum-equals-k/description/
// Medium Level
//Approach: i used hashmap to store prefix sum
// this take time complexity of O(n)

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap <>();
        map.put(0,1);
            int x = 0,ans=0;
            for (int j=0; j<nums.length; j++){
               x=x+nums[j];
                    if(map.containsKey(x-k)){
                        ans+= map.get(x-k);
                    }
                    if(map.containsKey(x)){
                        map.put(x,map.get(x)+1);
                    }
                    else {
                        map.put(x,1);
                    }
                }
    return ans;
    }
    }
