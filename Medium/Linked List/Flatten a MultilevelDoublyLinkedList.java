//Problem: Flatten a Multilevel Doubly Linked List
//Link:
https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/description/
// Medium Level
//Approach:  dfs
// this take time complexity of O(n)

class Solution {

    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    public Node dfs(Node head) {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            Node next = temp.next;
            if (temp.child != null) {
                Node childLast = dfs(temp.child);
                temp.next = temp.child;
                temp.child.prev = temp;
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }
                temp.child = null;
                last = childLast;
            } else {
                last = temp;
            }
            temp = next;
        }
        return last;
    }
}
