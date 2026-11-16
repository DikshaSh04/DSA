package LinkedList.practice;
//Q: If the given linked list contains a cycle, return its length otherwise return 0

public class CycleLength {
    //Implementation of LL
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //SOLUTION
    //1. Use the fast-slow pointer method to detect cycle
    //2. If cycle is not present return 0
    //3. If cycle is present (fast and slow pointers meet), move the slow pointer ahead
    // and keep a counter = 1, then keep traversing slow, and incrementing count
    // until fast and slow meet again, returning count gives the length of cycle
    public int cycleLength(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                slow = slow.next;
                int count = 1;
                while(slow!=fast){
                    slow = slow.next;
                    count++;
                }
                return count;
            }
        }
        return 0;
    }
}
