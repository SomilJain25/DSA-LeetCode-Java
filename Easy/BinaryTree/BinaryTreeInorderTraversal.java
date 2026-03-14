//Problem:  Binary Tree Inorder Traversal
//Link:
https://leetcode.com/problems/binary-tree-inorder-traversal/description/
//Easy Level
//Approach: using stack based approach; 

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !stack.isEmpty()){

            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            list.add(curr.val);
            curr=curr.right;
        }
        return list;
    }
}
