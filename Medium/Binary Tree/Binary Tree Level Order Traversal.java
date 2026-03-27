//Problem:  Binary Tree Level Order Traversal
//Link:
https://leetcode.com/problems/binary-tree-level-order-traversal/description/
// Medium Level
//Approach: using bfs approach using queue;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue <TreeNode> q=new LinkedList <>();
        q.add(root);
        while (!q.isEmpty()){
            List<Integer> list=new ArrayList<>();
            int size=q.size();
           for(int i=0; i<size; i++){
            TreeNode curr=q.remove();
                list.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            result.add(list);
        }    
        return result;
    }
}
