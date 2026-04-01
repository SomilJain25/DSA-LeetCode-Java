//Problem: 01 Matrix
//Link:
https://leetcode.com/problems/01-matrix/description/
// Medium Level
//Approach: using bfs Algorithm;
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue <int[]> q=new LinkedList <>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j]==0){
                    q.add(new int[] {i,j});
                }
                else{
                    mat[i][j]=-1;
                }
            }
        }
        int [][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int r=curr[0];
            int c=curr[1];

            for(int i=0; i<dir.length; i++){
                int nr=r+dir[i][0];
                int nc=c+dir[i][1];

                if(nr>=0 && nc>=0 && nr<m && nc<n && mat[nr][nc]==-1){
                    mat[nr][nc]=mat[r][c]+1;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return mat;
    }
}
