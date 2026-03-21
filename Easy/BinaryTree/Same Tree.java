//Problem:  Same Tree
//Link:
https://leetcode.com/problems/same-tree/description/
//Easy Level
//Approach: basic recursion; 

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
                return true;
            }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
