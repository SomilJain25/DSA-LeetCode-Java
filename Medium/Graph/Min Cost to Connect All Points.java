//Problem:  Min Cost to Connect All Points
//Link:
https://leetcode.com/problems/min-cost-to-connect-all-points/description/
// Medium Level
//Approach: concept of prims algorithm;

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        boolean [] visited=new boolean[n];
        int mindist[]=new int [n];

        Arrays.fill(mindist, Integer.MAX_VALUE);
        mindist[0]=0;
        int ans=0;
        for(int i=0; i<n; i++){
            int u=-1;
            for(int j=0; j<n; j++){
                if(!visited[j] && (u==-1 || mindist[j] < mindist[u])){
                    u=j;
                }
            }
            visited[u]=true;
            ans+=mindist[u];

            for(int v=0; v<n; v++){
                if(!visited[v]){
                    int dist=Math.abs(points[u][0]-points[v][0])+Math.abs(points[u][1]-points[v][1]);
                    mindist[v]=Math.min(mindist[v],dist);
                }
            }
        }
        return ans;
    }
}
