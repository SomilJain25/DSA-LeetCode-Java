//Problem: Reverse Linked List
//Link:
https://leetcode.com/problems/reverse-linked-list/description/
//Easy Level
//Approach:  take two pointer ListNode and reverse the list; its very easy,dont need any approach;

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;

        while(curr!=null){
            ListNode newnext = curr.next;
            curr.next=prev;
            prev=curr;
            curr=newnext;
        }
        return prev;
    }
}
