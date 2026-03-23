//Problem: Validate Binary Search Tree
//Link:
https://leetcode.com/problems/validate-binary-search-tree/description/
// Medium Level
//Approach: dfs based approach; 
class Solution {
    public boolean isbst(TreeNode root,TreeNode min,TreeNode max){
        if(root==null){
            return true;
        }
        if(min!=null && root.val<= min.val){
            return false;
        }
        if(max!=null && root.val >= max.val){
            return false;
        }
         return isbst(root.left,min,root) && isbst(root.right,root,max);
    }
    public boolean isValidBST(TreeNode root) {
       return isbst(root,null,null);
    }
}
