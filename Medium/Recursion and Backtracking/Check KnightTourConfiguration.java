//Problem: Check Knight Tour Configuration
//Link:
https://leetcode.com/problems/check-knight-tour-configuration/description/
// Medium Level
//Approach: knight move in grid is only 2,1 and 1,2 move...

class Solution {
    public boolean checkValidGrid(int[][] grid) {
       int n=grid.length;
       if(grid[0][0]!=0){
        return false;
       } 
       int pos[][]=new int [n*n][2];
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            int val=grid[i][j];
            pos[val][0]=i;
            pos[val][1]=j;
        }
       }
       for(int i=1; i<n*n; i++){
        int x1=pos[i-1][0];
        int y1=pos[i-1][1];

        int x2=pos[i][0];
        int y2=pos[i][1];

        int dx=Math.abs(x1-x2);
        int dy=Math.abs(y1-y2);

        if(!((dx==2 && dy==1) || (dx==1 && dy==2))){
            return false;
        }
       }
       return true;
    }
}
