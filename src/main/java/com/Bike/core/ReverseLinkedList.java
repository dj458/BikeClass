package com.Bike.core;

class LinkedList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;next=null;}
    }
}
public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedList llist=new LinkedList();
        llist.head= new LinkedList.Node(1);
        LinkedList.Node second =new LinkedList.Node(2);
        LinkedList.Node third =new LinkedList.Node(3);
        llist.head.next=second;
              second.next=third;
     System.out.println(llist.head.data);
     System.out.println(second.data);
     System.out.println(third.data);
    }
}
