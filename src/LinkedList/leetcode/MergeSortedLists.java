package LinkedList.leetcode;
//Q: https://leetcode.com/problems/merge-two-sorted-lists/description/
public class MergeSortedLists {
    //Implementation of LL given in question:
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    //BRUTE FORCE SOLUTION - O(n+m) time and space complexity
    //1. Assign two pointers temp1 and temp2 equal to the heads of both linked lists
    //2. Create a new node dummy which will be empty, make tail equal to this
    //3. Compare values of temp1 and temp2, until both lists are not null
    // a. If value of temp1 <= value of temp2, create a new node with value = temp1 and
    //    insert it at last, then traverse temp1 further
    // b. If value of temp1 > value of temp2, create a new node with value = temp2 and
    //    insert it at last, then traverse temp2 further
    //IMP - For inserting at last, we create a new node and do tail.next = newNode, then
    //update the tail
    //4. RETURN dummy.next - because dummy is empty and was taken for reference only
    //to start the list from somewhere
    public ListNode mergeBF(ListNode list1,ListNode list2){
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(temp1!=null && temp2!=null){
            if(temp1.val <= temp2.val){
                ListNode node = new ListNode(temp1.val);
                tail.next = node;
                tail = tail.next;
                temp1 = temp1.next;
            }
            else{
                ListNode node = new ListNode(temp2.val);
                tail.next = node;
                tail = tail.next;
                temp2 = temp2.next;
            }
        }

        //if either list becomes fully traversed, add the nodes of the other list as it is
        while(temp1!=null){
            ListNode node = new ListNode(temp1.val);
            tail.next = node;
            tail = tail.next;
            temp1 = temp1.next;
        }

        while(temp2!=null){
            ListNode node = new ListNode(temp2.val);
            tail.next = node;
            tail = tail.next;
            temp2 = temp2.next;
        }

        return dummy.next;

    }

    //OPTIMAL SOLUTION - if you want to do it IN-PLACE without creating a new linked list
    //O(n+m) time and O(1) space
    //1. Create a new empty node dummy, and make tail point to it
    //2. Take the two heads list1 and list2 and compare their values
    // a. If value of list1 <= value of list2, make tail.next = list1,
    //    then move the tail pointer and list1 ahead.
    // b. If value of list1 > value of list2, make tail.next = list2,
    //    then move the tail pointer and list2 ahead.
    //Do this until list1 and list2 is not null
    //If any of the list becomes null, make tail.next point to the head of remaining list

    public ListNode mergeOP(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }

        if(list1!=null){
            tail.next = list1;
        }

        if(list2!=null){
            tail.next = list2;
        }

        return dummy.next;
    }



}
