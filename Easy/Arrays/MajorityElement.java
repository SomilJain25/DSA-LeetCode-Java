//Problem: Majority Element
//Link:
https://leetcode.com/problems/majority-element/description/
//Easy Level
//Approach: i used hashmap to store number and its frequency. now check if exist in map then increase its frequency;
            //if not then put it into map.this take time complexity O(n) ......

class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int output=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)>n/2){
                output= key;
            }
        }
        return output;
    }
}
