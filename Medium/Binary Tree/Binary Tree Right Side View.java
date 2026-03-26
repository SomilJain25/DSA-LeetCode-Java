//Problem:  Binary Tree Right Side View
//Link:
https://leetcode.com/problems/binary-tree-right-side-view/description/
// Medium Level
//Approach: dfs approach;

class Solution {
    ArrayList<Integer> list= new ArrayList <>();
    public void dfs (TreeNode p,int level){
        if(p==null){
            return;
        }
        if(level==list.size()){
            list.add(p.val);
        }
        dfs(p.right,level+1);
        dfs(p.left,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root,0);
        return list;
    }
}
