//Problem:  Maximum Level Sum of a Binary Tree
//Link:
https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/
// Medium Level
//Approach: bfs approach;

class Solution {        
    public int maxLevelSum(TreeNode root) {
    Queue <TreeNode> q=new LinkedList <>();
    q.add(root);
    int level=1;
    int maxlevel=1;
    int maxSum = Integer.MIN_VALUE;

while(!q.isEmpty()){
    int size=q.size();
    int sum=0;
    for (int i=0; i<size; i++){
        TreeNode node=q.poll();
        sum+=node.val;
        if(node.left!=null){
            q.add(node.left);
        }
        if(node.right!=null){
            q.add(node.right);
        }
    }
if (sum > maxSum) {
    maxSum = sum;
    maxlevel = level;
    }
    level++;
 }
      return maxlevel;
    }
}
