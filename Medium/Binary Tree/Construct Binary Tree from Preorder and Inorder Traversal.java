//Problem:  Construct Binary Tree from Preorder and Inorder Traversal
//Link:
https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
// Medium Level
//Approach: recursively solve ;

class Solution {
    int preidx=0;
    public int search(int[] inorder,int left,int right,int val){
        for(int i=left; i<=right; i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
    public TreeNode build_tree(int[] preorder, int[] inorder,int left,int right){
        if(left>right){
            return null;
        }
        TreeNode Root =  new TreeNode (preorder[preidx++]);
        
        int inidx = search(inorder,left,right,Root.val);
        
        Root.left=build_tree(preorder,inorder,left,inidx-1);
        Root.right=build_tree(preorder,inorder,inidx+1,right);

        return Root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build_tree(preorder,inorder,0,inorder.length-1);
    }
}
