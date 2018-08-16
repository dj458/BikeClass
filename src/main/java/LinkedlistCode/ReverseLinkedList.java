package LinkedlistCode;

class LinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    Node reverse(Node node ){
        Node prev=null;
        Node current=node;
        Node next=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;

        }
        node=prev;
        return node;
    }


    public  static  void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(1);
        list.head.next = new LinkedList.Node(2);
        list.head.next.next = new LinkedList.Node(3);
        System.out.println("Given Linkedlist: ");
        list.printList(head);
        head=list.reverse(head);
        System.out.println("Reversed Linkedlist: ");
        list.printList(head);
    }
}