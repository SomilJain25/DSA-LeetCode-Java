//Problem:  Diameter of Binary Tree
//Link:
https://leetcode.com/problems/diameter-of-binary-tree/description/
//Easy Level
//Approach: min max approach i made new class taken two parameters height and diameter; 
    //then find max height and max diameter then taken max of height and diameter and get the answer;
class Solution {
    static class treeinfo{
        int height;
        int diameter;
        treeinfo(int height, int diameter){
            this.height=height;
            this.diameter=diameter;
        }
    }
    public static treeinfo diameter(TreeNode root){
        if(root==null){
            return new treeinfo(0,0);
        }
        treeinfo left=diameter(root.left);
        treeinfo right=diameter(root.right);
        int myheight=Math.max(left.height,right.height)+1;
        int diam1=left.diameter;
        int diam2=right.diameter;
        int diam3=left.height+right.height;

        int mydiam=Math.max(Math.max(diam1,diam2),diam3);

        treeinfo myinfo= new treeinfo (myheight,mydiam);
        return myinfo;
    }
    public int diameterOfBinaryTree(TreeNode root) { 
        return diameter(root).diameter;
    }
}
