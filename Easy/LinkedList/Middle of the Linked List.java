//Problem: Middle of the Linked List
//Link:
https://leetcode.com/problems/middle-of-the-linked-list/
// Easy Level
//Approach: using two pointer approach;

class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode i=head;
       ListNode j=head;
       
       while (j!=null && j.next!=null){
         i=i.next;
        j=j.next.next;
        
       } 
       return i;
    }
}
