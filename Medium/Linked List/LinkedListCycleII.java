//Problem: Linked List Cycle II
//Link:
https://leetcode.com/problems/linked-list-cycle-ii/description/
// Medium Level
//Approach:  slow fast approach; check the condition of cycle; reinitialilse another variable;
// this take time complexity of O(n)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
             
            slow=slow.next;
            fast=fast.next.next;
           
            if(slow==fast){
                ListNode temp = head;
                while (temp != slow) {
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp;
            }
        }
    return null;
    }
}
