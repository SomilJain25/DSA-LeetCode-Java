//Problem: Symmetric Tree
//Link:
https://leetcode.com/problems/symmetric-tree/description/
//Easy Level
//Approach: using recursive approach or dfs based; 

class Solution {
    public boolean ismirror(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1==null || t2==null){
            return false;
        }
        if(t1.val!=t2.val){
            return false;
        }
      return ismirror(t1.left,t2.right) && ismirror(t1.right,t2.left);  
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return ismirror(root.left,root.right);
    }
}
