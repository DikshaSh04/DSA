package LinkedList.leetcode;
//Q: https://leetcode.com/problems/delete-node-in-a-linked-list/description/

//Q: How to delete a given node when head of LL is not provided
// HINT: How to become another person in the world? Two steps.
//       1. change your appearance to whom you want to be.
//       2. kill that person.
public class DeleteWithoutHead {
    //implementation of LL given in ques
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

  //SOLUTION:
  public void deleteNode(ListNode node) {
      node.val = node.next.val;
      node.next = node.next.next;
  }

}
