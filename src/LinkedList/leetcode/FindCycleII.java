package LinkedList.leetcode;
//Q: https://leetcode.com/problems/linked-list-cycle-ii/description/
public class FindCycleII {
    //Implementation of LL given in question
     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }

     //SOLUTION
    //1. First find out whether the linked list has a cycle or not, using fast and slow pointers
    //2. If no cycle, return null
    //3. If cycle is detected, i.e. if fast and slow pointers land on the same node,
    //   a. Move one of the pointer back to head
    //   b. Now move both slow and fast pointers by 1 (same speed) until they again become equal
    //   c. The node where they become equal again, is always the beginning of cycle.
    // WHY DOES THIS WORK?
    // Mathematically,
    // distance from head to beginning of cycle = distance from where fast and slow met to beginning of cycle

    public ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                fast = head;
                while(fast!=slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;

    }

}
