//Problem: Combination Sum
//Link:
https://leetcode.com/problems/combination-sum/description/
// Medium Level
//Approach: dfs or backtracking approach firstly add elements to list and subtract it from target and get the output;

class Solution {
    public void dfs(int[] candidates,int target,int start, List<List<Integer>> result,List<Integer> curr){
        if(target==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(candidates[i]<=target){
                curr.add(candidates[i]);
                dfs(candidates,target-candidates[i],i,result,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList <>();
        List<Integer> curr= new ArrayList <>();
        
        dfs(candidates,target,0,result,curr);
        return result;
    }
}
