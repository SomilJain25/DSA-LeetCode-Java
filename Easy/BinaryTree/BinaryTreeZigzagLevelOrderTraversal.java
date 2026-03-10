//Problem: Binary Tree Zigzag Level Order Traversal
//Link:
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
//Easy Level
//Approach: use Bfs 

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
        int size=q.size();
        List<Integer> level = new ArrayList<>();
        for(int i=0; i<size; i++){
            TreeNode curr=q.poll();
            if(leftToRight){
                level.add(curr.val);
            }
            else{
                level.add(0, curr.val);
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        list.add(level);
        leftToRight = !leftToRight;
        }
        
        return list;
        }
    }
