//Problem:  Peak Index in a Mountain Array
//Link:
https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// Medium Level
//Approach: two pointer approach;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if(arr.length==0 ||arr.length==1){
            return 0;
        }
        int high=0;
        for(int i=0; i<arr.length; i++){
            high++;
            if(arr[i]>arr[high]){
                return i;
            } 
        }
        return -1;
    }
}
