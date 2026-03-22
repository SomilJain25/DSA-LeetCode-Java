//Problem: Maximum Width of Binary Tree
//Link:
https://leetcode.com/problems/maximum-width-of-binary-tree/description/
// Medium Level
//Approach: i used bfs approach ; it takes too much time in finding how to solve it;

class Solution {
    class pair{
        TreeNode node;
        int index;

        pair(TreeNode node,int index){
            this.node=node;
            this.index=index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue <pair> q=new LinkedList <>();
        q.add(new pair(root,0));

        int maxwidth=0;

        while(!q.isEmpty()){
            int size=q.size();
            int minindex=q.peek().index;
            int first=0;
            int last=0;

            for(int i=0; i<size; i++){
                pair curr=q.poll();
                int index= curr.index-minindex;
                if(i==0){
                    first=index;
                }
                if(i==size-1){
                    last=index;
                }
                if(curr.node.left!=null){
                    q.add(new pair(curr.node.left,2*index));
                }
                if(curr.node.right!=null){
                    q.add(new pair(curr.node.right,2*index+1));
                }
            }
                maxwidth=Math.max(maxwidth,last-first+1);
        }
        return maxwidth;
    }
}
