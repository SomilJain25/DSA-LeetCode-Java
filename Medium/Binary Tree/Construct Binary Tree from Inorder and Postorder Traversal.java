//Problem:  Construct Binary Tree from Inorder and Postorder Traversal
//Link:
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/
// Medium Level
//Approach: recursively solve ;

class Solution {
     int postidx;
    public int search(int[] inorder,int left,int right,int val){
        for(int i=left; i<=right; i++){
            if(inorder[i]==val){
                return i;
            }
        }
        return -1;
    }
    public TreeNode buildtree(int[]postorder,int []inorder,int left,int right){
        if(left>right){
            return null;
        }
        TreeNode root=new TreeNode (postorder[postidx--]);

        int inidx=search(inorder,left,right,root.val);
        
        root.right=buildtree(postorder,inorder,inidx+1,right);
        root.left=buildtree(postorder,inorder,left,inidx-1);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
     postidx=postorder.length - 1;
        return buildtree(postorder,inorder,0,inorder.length-1);
    }
}
