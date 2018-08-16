package LinkedlistCode;




public  class LinkedlistTraversal {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;}
    }

    public void printList(){
        LinkedlistTraversal.Node n=head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args){

        LinkedlistTraversal linkedlistTraversal=new LinkedlistTraversal();
        linkedlistTraversal.head= new LinkedlistTraversal.Node(1);
        LinkedlistTraversal.Node second = new LinkedlistTraversal.Node(2);
        LinkedlistTraversal.Node third= new LinkedlistTraversal.Node(3);

        linkedlistTraversal.head.next=second;
        second.next=third;
        linkedlistTraversal.printList();

    }

}
