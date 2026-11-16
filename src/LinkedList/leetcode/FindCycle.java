package LinkedList.leetcode;
//Q: https://leetcode.com/problems/linked-list-cycle/description/
public class FindCycle {
    //Implementation of LL given in question
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

      //SOLUTION: FAST AND SLOW POINTER METHOD/ FLOYD'S CYCLE FINDING ALGO
    //1. Take two pointers fast and slow starting from head
    //2. In every iteration, move slow pointer one step ahead andd fast pointer two steps ahead
    //3. Do this until fast becomes null or fast.next is null(to avoid nullpointerexception)
    //4. If there is a cycle, fast and slow will eventually meet at the same node,
    //   hence return true if fast == slow in an iteration
    //5. If there is no cycle, fast will eventually reach null and loop will end, return false
    public boolean hasCycle(ListNode head){
          ListNode fast = head;
          ListNode slow = head;

          while(fast!=null && fast.next!=null){
              slow = slow.next;
              fast = fast.next.next;

              if(slow == fast){
                  return true;
              }
          }
          return false;

    }

}
