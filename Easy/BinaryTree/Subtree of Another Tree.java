//Problem:  Subtree of Another Tree
//Link:
https://leetcode.com/problems/subtree-of-another-tree/description/
//Easy Level
//Approach: using dfs or recursive approach; 

class Solution {
    public boolean iscontains(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return iscontains(p.left,q.left) && iscontains(p.right,q.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(iscontains(root,subRoot)){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
