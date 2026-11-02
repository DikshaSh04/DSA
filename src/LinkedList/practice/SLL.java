package LinkedList.practice;
//Implementation of Singly Linked List along with basic operations :
//insert, traverse, delete

public class SLL {

    //fields of a SLL
    private Node head;
    private Node tail;
    private int size;

    //constructor for SLL - makes size = 0 when SLL object is declared
    public SLL(){
        this.size = 0;
    }

    //class for a node
    private static class Node{
        //fields of a node
        private int value;
        private Node next;

        //constructor that only takes a value
        public Node(int value){
            this.value = value;
        }

        //constructor that takes both value and link to next node
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    //METHOD to insert a node at first position of a SLL
    public void insertAtFirst(int value){
        //first create a new node that will be inserted
        Node newNode = new Node(value);
        //if sll is empty, both head and tail point to the newly created node
        if(size==0){
            head = newNode;
            tail = newNode;
        }
        //if sll is not empty, 'next' field of newly created node will point to current head
        //then head will be updated and will point to newly created node
        else{
            newNode.next = head;
            head = newNode;
        }
        //after each insertion, size of sll will increase by 1
        size++;
    }

    //METHOD to display a sll
    public void displaySLL(){
        //take a temporary node that points to the head node, then make it point to
        //every node until next node = null
        //We take a temporary node because if we update the head node, the whole structure
        //of SLL will change
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //METHOD to insert a node at the last position
    public void insertAtLast(int value){
        //create the node to be inserted, then make 'next' field of tail(last node) point
        //to the newly created node and then update tail of sll
        Node newNode = new Node(value);
        if(size!=0){
            tail.next = newNode;
            tail = newNode;
        }//if size of sll is 0, both head and tail point to newly created node
        else{
            tail = newNode;
            head = newNode;
        }
        size++; //increment size after insertion
    }

    //METHOD to insert a node at any 'index'
    public void insert(int value, int index){
        //take a temp node for traversal that starts at head
        Node temp = head;
        //keep moving temp until it is at node previous to the required index
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        //then create a new node and and point its 'next' to the 'next' of temp node
        Node newNode = new Node(value,temp.next);
        //then point the 'next' of temp node to the newly created node
        temp.next = newNode;
        //increment size
        size++;

    }

    //METHOD to delete node at first position
    public void deleteAtFirst(){
        //just make the head point to the next node
        head = head.next;

        //EDGE CASE: if head becomes null, that means head and tail were pointing to same
        //node, so make tail also equal to null
        if(head==null){
            tail = null;
        }
        //decrement the size
        size--;
    }

    //METHOD to delete node at last position
    public void deleteLast(){
        //create a temp node and traverse it up to second-last node
        Node temp = head;
        for(int i=1; i<size-1; i++){
            temp = temp.next;
        }
        //point the 'next' of temp to null
        temp.next = null;
        //update tail
        tail = temp;
        //decrement the size
        size--;
    }

    //METHOD to delete a node at any 'index'
    public void delete(int index){
        //create a temp node and traverse it up to index previous to the required index
        Node temp = head;
        for(int i=1; i<index; i++){
            temp = temp.next;
        }
        //now make the 'next' of temp point to 'next' of temp.next
        temp.next = temp.next.next;

        //decrement the size
        size--;
    }

    //METHOD to search for a key in a sll
    public boolean searchKey(int key){
        //take temp node
        Node temp = head;
        //traverse the list and check if value of any node matches the key
        while(temp!=null){
            if(temp.value == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

}
