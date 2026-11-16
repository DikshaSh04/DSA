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
    //1. Find the length of the cycle, if present, and store it in variable length.
    //2. If cycle is not present i.e. length == 0, return null.
    //3. Now take two pointers first and second, starting from head.
    //4. Move the second pointer ahead by length of cycle times.
    //5. Now, keep moving first and second one by one till first == second,
    //   i.e. they land on the same node -> that node marks the beginning of cycle.

    public ListNode cycleBeginAt(ListNode head){
         int length = cycleLen(head);

         if(length == 0){
             return null;
         }

         ListNode first = head;
         ListNode second = head;

         for(int i=0; i<length; i++){
             second = second.next;
         }

         while(first!=second){
             first = first.next;
             second = second.next;
         }
         return first;
    }

    public static int cycleLen(ListNode head){
         ListNode fast = head;
         ListNode slow = head;

         while(fast!=null && fast.next!=null){
             fast = fast.next.next;
             slow = slow.next;

             if(fast == slow){
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
