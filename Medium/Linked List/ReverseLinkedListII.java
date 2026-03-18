//Problem: Reverse Linked List II
//Link:
https://leetcode.com/problems/reverse-linked-list-ii/description/
// Medium Level
//Approach: pointer approach;  simply reverse the list and change the left & right;

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
        ListNode temp=new ListNode (0);
        temp.next=head;
        ListNode prev=temp;

        for(int i=1; i<left; i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        for(int i=0; i<right-left; i++){
            ListNode n =curr.next;
            curr.next=n.next;
            n.next=prev.next;
            prev.next=n;
        }
           
        return temp.next;
    }
}
