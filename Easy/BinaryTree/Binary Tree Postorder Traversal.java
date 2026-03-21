//Problem:  Binary Tree Postorder Traversal
//Link:
https://leetcode.com/problems/binary-tree-postorder-traversal/description/
//Easy Level
//Approach: using stack based approach; 

class Solution {
   
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> list=new ArrayList<>();
        Stack <TreeNode> stack=new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
       
        while(!stack.isEmpty()){
        TreeNode curr=stack.pop();
        list.add(curr.val);

        if(curr.left!=null){
            stack.push(curr.left);
        }
        if(curr.right!=null){
        stack.push(curr.right);
        }
    }
    Collections.reverse(list);
        return list;
    }
}
