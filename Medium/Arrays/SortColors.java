//Problem: Sort Colors
//Link:
https://leetcode.com/problems/sort-colors/description/
// Medium Level
//Approach: i take three variables which store frequency and return 0,1,2 according to frequency;
// this take time complexity of O(n)
class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else{
                count2++;
            } 
        }
        int idx=0;
        for(int i=0; i<count0; i++){
            nums[idx++]=0;
        }
        for(int i=0; i<count1; i++){
            nums[idx++]=1;
        }
        for(int i=0; i<count2; i++){
            nums[idx++]=2;
        }
    }
}
