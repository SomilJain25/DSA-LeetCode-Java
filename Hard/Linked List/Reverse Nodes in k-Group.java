//Problem:  Reverse Nodes in k-Group
//Link:
https://leetcode.com/problems/reverse-nodes-in-k-group/description/
// Hard Level
//Approach: i used recursive approach firstly find the total count then find prev recursively and reverse the list and get the ans;

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode curr=head;
        int count=0;
        while(curr!=null && count<k){
            curr=curr.next;
            count++;
        }
        if(count==k){
            ListNode prev=reverseKGroup(curr,k);
        while(count-->0){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        head=prev;
        }
        return head;
    }
}
