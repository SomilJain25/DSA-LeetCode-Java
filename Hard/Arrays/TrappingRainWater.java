//Problem: Trapping Rain Water
//Link:
https://leetcode.com/problems/trapping-rain-water/description/
// Hard Level
//Approach: approach is easy but this q want ability of thought process. 
          //i calculate leftmax array and rightmax array and then get the watertrap...  
// this take time complexity of O(n)

class Solution {
    public int trap(int[] height) {
        int leftmax []=new int[height.length];
        int rightmax[]=new int [height.length];
        int watertrap=0;
        leftmax[0]=height[0];
        rightmax[rightmax.length-1]=height[height.length-1];

        for(int i=1; i<leftmax.length; i++){
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        for(int j=rightmax.length-2; j>=0; j--){
            rightmax[j]=Math.max(rightmax[j+1],height[j]);
        }
        for(int k=0; k<height.length; k++){
           watertrap+= Math.min(leftmax[k],rightmax[k])-height[k];
        }
        return watertrap;
    }
}
