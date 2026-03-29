//Problem: Is Graph Bipartite?
//Link:
https://leetcode.com/problems/is-graph-bipartite/description/
// Medium Level
//Approach: using bfs approach; 
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int []pointout=new int[n];

        for(int i=0; i<n; i++){
            if(pointout [i] !=0){
                continue;
            }
            Queue <Integer> q=new LinkedList <>();
            q.add(i);
            pointout[i]=1;
            while(!q.isEmpty()){
                int node=q.poll();
                for(int j=0; j<graph[node].length; j++){
                    int neighbour=graph[node][j];

                    if(pointout[neighbour]==0){
                        pointout[neighbour]=-pointout[node];
                        q.add(neighbour);
                    }
                    else if(pointout[neighbour]==pointout[node]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
