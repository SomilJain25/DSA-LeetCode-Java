//Problem:  Find the City With the Smallest Number of Neighbors at a Threshold Distance
//Link:
https://leetcode.com/problems/find-the-city-with-the-smallest-number-of-neighbors-at-a-threshold-distance/description/
// Medium Level
//Approach: using Floyd Warshall Algorithm;

class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int largest = (int)1e9;
        int dist[][]=new int [n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    dist[i][j]=0;
                }
                else{
                    dist[i][j]=largest;
                }
            }
        }
        for(int i=0; i<edges.length; i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];

            dist[u][v]=w;
            dist[v][u]=w;
        }
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(dist[i][k]+dist[k][j]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];
                    }
                }
            }
        }
        int mincount=Integer.MAX_VALUE;
        int result=-1;

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(dist[i][j]<=distanceThreshold){
                    count++;
                }
            }
            count--;

            if(count<=mincount){
                mincount=count;
                result=i;
            }
        }
        return result;
    }

}
