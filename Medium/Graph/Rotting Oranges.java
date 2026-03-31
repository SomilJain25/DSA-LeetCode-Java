//Problem: Rotting Oranges
//Link:
https://leetcode.com/problems/rotting-oranges/description/
// Medium Level
//Approach: using BFS approach;
class Solution {
    public int orangesRotting(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        Queue <int[]> q=new LinkedList<>();
        int fresh=0;

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j]==2){
                    q.add(new int []{i,j});
                }
                else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int min=0;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            boolean rotten=false;

            for(int i=0; i<size; i++){
                int [] curr=q.poll();

                for(int j=0; j<dir.length; j++){
                    int r=curr[0]+dir[j][0];
                    int c=curr[1]+dir[j][1];
                    
                    if(r>=0 && c>=0 && r<rows && c<cols && grid[r][c]==1){
                        grid[r][c]=2;
                        q.add(new int []{r,c});
                        fresh--;
                        rotten=true;
                    }
                }
            }
            if(rotten){
                min++;
            }
        }
        if(fresh==0){
            return min;
        }
        else{
            return -1;
        }
    }
}
