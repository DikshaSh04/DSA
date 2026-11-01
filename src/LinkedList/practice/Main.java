package LinkedList.practice;

public class Main {

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtFirst(5);
        list.insertAtLast(18);
        list.insertAtFirst(2);
        list.insert(6,1);
        list.insert(13,2);
        list.displaySLL();
        list.deleteAtFirst();
        list.deleteLast();
        list.delete(1);
        list.displaySLL();


    }
}
