//Problem: Product of Array Except Self
//Link:
https://leetcode.com/problems/product-of-array-except-self/description/
// Medium Level
//Approach:  this q  might be tricky but i take a time to solving this. the approach is i calculate prefix product and multiply it with suffix product. 
// this take time complexity of O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int [nums.length];
       ans[0]=1;
        for(int i=1; i<nums.length; i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
       int suffix=1;
        for(int j=nums.length-2; j>=0; j--){
            suffix=suffix*nums[j+1];
       
        ans[j]=ans[j]*suffix;
        }
return ans;
      }
   }   
