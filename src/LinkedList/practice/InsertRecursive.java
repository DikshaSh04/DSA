package LinkedList.practice;
//Insert elements into a Linked List using recursion
public class InsertRecursive {
    //IMPLEMENTATION OF LL
    private Node head;
    private Node tail;
    private int size;

    InsertRecursive(int size){
        this.size = size;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    //METHOD
    public void insertRec(int value){
        
    }

}

