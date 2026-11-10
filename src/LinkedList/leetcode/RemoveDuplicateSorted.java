package LinkedList.leetcode;
//Q: https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class RemoveDuplicateSorted {

    //implementation of LL (already given in ques)
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //SOLUTION
    public ListNode removeDuplicate(ListNode head){
        //create a temp node that will traverse the elements of ll, starting from head
        ListNode temp = head;

        //traverse until temp reaches last node and
        //also check temp should not be null (to avoid nullpointerexception)
        while(temp!=null && temp.next!=null){
            //if value of current node is same as value of next node, remove the next node
            //by pointing 'next' of current node to 'next' of next node
            //otherwise traverse temp to next node
            if(temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else{
                temp =  temp.next;
            }
        }
        return head;

    }
}
