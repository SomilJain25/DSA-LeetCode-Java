//Problem: Find Bottom Left Tree Value
//Link:
https://leetcode.com/problems/find-bottom-left-tree-value/description/
// Medium Level
//Approach: using dfs based approach;

class Solution {
    ArrayList <Integer> list=new ArrayList <>();
    public void dfs (TreeNode p,int level){
        if(p==null){
            return;
        }
        if(level==list.size()){
            list.add(p.val); 
        }
        dfs(p.left,level+1);
        dfs(p.right,level+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        int element=list.get(list.size()-1);
        return element;
    }
}
