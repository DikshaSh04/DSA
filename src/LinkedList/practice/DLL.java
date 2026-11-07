package LinkedList.practice;
//Implementation of Doubly Linked List and its operations

public class DLL {
    //fields of a dll
    private Node head;
    private Node tail;
    private int size;

    //constructor
    public DLL(){
        this.size = 0;
    }

    private class Node{
        //fields of a node in dll
        private int value;  //value of the node
        private Node next;  //reference to the next node
        private Node prev;  //reference to the previous node

        //constructors
        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    //METHOD to insert a node at the beginning of dll
    public void insertFirst(int val){
        //create a new node
        Node newNode = new Node(val);
        //if size is 0, both head and tail will point to newly created node
        if(size==0){
            head = newNode;
            tail = newNode;
        }
        else{
            //created a new node, point its 'next' to the head and
            //point 'prev' of head to the newly created node, then update head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        //increment size at the end
        size++;
    }

    //METHOD to insert a node at the last of dll
    public void insertLast(int val){
        //edge case: if size=0
        if(size==0){
            insertFirst(val);
        }
        else{
            //create a new node, point its 'prev' to tail and 'next' of tail to
            //newly created node, then update tail
            Node newNode = new Node(val);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        //increment the size
        size++;
    }

    //METHOD to display dll
    public void display(){
        //create a temp node starting from head and traverse while temp is not null
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + "<->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    //METHOD to display dll in reverse
    public void reverse(){
        //create a temp node starting from tail and traverse while temp is not null
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.value + "<->");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }



}
