//Problem: Balanced Binary Tree
//Link:
https://leetcode.com/problems/balanced-binary-tree/description/
//Easy Level
//Approach: calculating left height and right height recursively; then use the conditions of balanced tree and get the ans;

class Solution {
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int leftheight = height(node.left);
       int rightheight = height(node.right);

        if(leftheight==-1 || rightheight==-1){
            return -1;
        }
        if(Math.abs(leftheight-rightheight)>1){
            return -1;
        }
        return Math.max(leftheight,rightheight)+1;
    }

    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }
}
