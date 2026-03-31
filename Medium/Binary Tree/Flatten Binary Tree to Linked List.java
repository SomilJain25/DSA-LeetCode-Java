//Problem:  Flatten Binary Tree to Linked List
//Link:
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
// Medium Level
//Approach: using dfs approach;

class Solution {
    List <TreeNode> list =new ArrayList <>();
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        list.add(root);
        dfs(root.left);
        dfs(root.right);
        
    }
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        dfs(root);
        for(int i=0; i<list.size()-1; i++){
            TreeNode curr=list.get(i);
            TreeNode next=list.get(i+1);
            curr.left=null;
            curr.right= next;
        }
    }
}
