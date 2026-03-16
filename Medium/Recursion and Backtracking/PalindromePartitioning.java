//Problem: Palindrome Partitioning
//Link:
https://leetcode.com/problems/palindrome-partitioning/description/
// Medium Level
//Approach: dfs or backtracking approach firstly check isPalindrome then by recursivey find substring and add into list;
class Solution {
    public boolean isPalindrome(int left,int right,String s){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public void dfs(String s,int start,List<String> list,List<List<String>> result){
        if(start==s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start; i<s.length(); i++){
            if(isPalindrome(start,i,s)){
            list.add(s.substring(start,i+1));
            dfs(s,i+1,list,result);
            list.remove(list.size()-1);
        }
    }
    }
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList <>();
        List<List<String>> result= new ArrayList <>();
        dfs(s,0,list,result);
        return result;
    }
}
