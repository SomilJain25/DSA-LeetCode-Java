//Problem: Find Missing and Repeated Values
//Link:
https://leetcode.com/problems/find-missing-and-repeated-values/description/
//Easy Level
//Approach: i used hashset to store number. now check if already exist in set then add this in ans array,in this way we find repeated number;
            //if not then put it into set.now traverse the set and check if not contains in set then return that value;this take time complexity O(n^2) ......
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet <Integer> set = new HashSet<>();
        int n=grid.length;
        int ans[]=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(set.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        for (int k=1; k<=(n*n); k++){
            if(!set.contains(k)){
                ans[1]=k;
            }
        }
        return ans;
    }
}
