//Problem: Rotate List
//Link:
https://leetcode.com/problems/rotate-list/description/
// Medium Level
//Approach:  i used two pointer approach firstly find the length of list then
          //the critical thinking is to find how many time is list to be rotated "(k = k % length)";

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        ListNode temp=head;
        int length=1;
        while(temp.next!=null){
            temp=temp.next;
            length++;
        }
        temp.next=head;
        k=k%length;
        int newcut = length-k;
        ListNode cut=temp;
        while(newcut-->0){
            cut=cut.next;
        }
        ListNode newhead=cut.next;
        cut.next=null;

        return newhead;
    }
}
