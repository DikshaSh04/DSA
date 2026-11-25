package LinkedList.leetcode;
//Q: https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleOfLL {
    //Implementation of LL given in question
    public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //SOLUTION
    //1. Take two pointers fast and slow starting from head
    //2. Move the fast pointer ahead by 2 nodes and slow pointer by 1 node
    //3. Do this till fast.next is not null to avoid nullpointerexception
    //4. When the loop ends, slow pointer marks the middle of linked list
    //   WHY?
    //   Because if a pointer moving at 2x speed of another pointer reaches the end,
    //   the slower pointer will have reached exactly halfway (middle)
    public ListNode middle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
