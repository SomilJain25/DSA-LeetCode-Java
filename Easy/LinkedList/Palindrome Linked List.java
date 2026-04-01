//Problem: Palindrome Linked List
//Link:
https://leetcode.com/problems/palindrome-linked-list/
// Easy Level
//Approach: using stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack <ListNode> stack=new Stack <>();
        ListNode p=head;
        while(p!=null){
            stack.push(p);
             p=p.next;
        }
        
        while(!stack.isEmpty()){
            ListNode q=stack.pop();
            if(q.val!=head.val){
                return false;
            }
            head=head.next;
        } 
        return true;
    }
}
