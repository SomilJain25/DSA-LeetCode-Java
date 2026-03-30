//Problem:  Lowest Common Ancestor of a Binary Tree
//Link:
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/
// Medium Level
//Approach: using dfs;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root==null){
        return null;
       } 
       if(root==p || root==q){
        return root;
       }
       TreeNode leftlca=lowestCommonAncestor(root.left,p,q);
       TreeNode rightlca=lowestCommonAncestor(root.right,p,q);

       if(leftlca!=null && rightlca!=null){
        return root;
       }
        else if(leftlca!=null){
            return leftlca;
        }
        else{
            return rightlca;
        }
    }
}
