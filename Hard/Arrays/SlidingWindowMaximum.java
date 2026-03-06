//Problem: Sliding Window Maximum
//Link:
https://leetcode.com/problems/sliding-window-maximum/description/
// Hard Level
//Approach: deque
// this take time complexity of O(n)

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque <Integer> q=new ArrayDeque <>();
        int []result=new int [nums.length-k+1];

        if (nums == null || k == 0) return new int[0];

        for(int i=0; i<nums.length; i++){
            while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.removeLast();
            }
            q.addLast(i);
            if(i>=k-1){
                result[i-k+1]=nums[q.peekFirst()];
            }
        }
return result;
    }
}        
