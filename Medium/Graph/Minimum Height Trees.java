//Problem: Minimum Height Trees
//Link:
https://leetcode.com/problems/minimum-height-trees/description/?envType=problem-list-v2&envId=topological-sort
// Medium Level
//Approach:  topological sorting approach ;

class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList <Integer> list=new ArrayList <>();
        if(n==1){
            list.add(0);
            return list;
        }
        List<List<Integer>> graph=new ArrayList <>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList <>());
        }
        int [] height=new int [n];
        for(int i=0; i<edges.length; i++){
            int u=edges[i][0];
            int v=edges[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);

            height[u]++;
            height[v]++;
        }
        Queue <Integer> q= new LinkedList<>();
        for(int i=0; i<n; i++){
            if(height[i]==1){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            list=new ArrayList <>();
            int size=q.size();

            for(int i=0; i<size; i++){
                int node=q.poll();
                list.add(node);

                for (int j = 0; j < graph.get(node).size(); j++) {
                    int neighbor = graph.get(node).get(j);

                    height[neighbor]--;
                    if (height[neighbor] == 1) {
                        q.add(neighbor);
                        }
                    }
                }
            }
        return list;
    }
}
