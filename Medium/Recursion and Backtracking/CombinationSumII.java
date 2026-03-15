//Problem: Combination Sum II
//Link:
https://leetcode.com/problems/combination-sum-ii/description/
// Medium Level
//Approach: dfs or backtracking approach firstly add elements to list and subtract it from target and start from next index get the output;
//we need to sort the array first;

class Solution {
    public void dfs( int[] candidates,int target,int start,List<Integer> curr,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList <>(curr));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            } 
            if(candidates[i]<=target){
                curr.add(candidates[i]);
            
            dfs(candidates,target-candidates[i],i+1,curr,result);
            curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList <>();
        List<Integer> curr=new ArrayList <>();
        dfs(candidates,target,0,curr,result);
        return result;
    }
}
