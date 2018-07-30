package com.Bike.core;

class Node{
    int key;
    Node left, right;
    public Node (int item){
        key=item;
        left=right=null;
    }
}
public class BinaryTreeInorderTraversal {
    Node root;
    BinaryTreeInorderTraversal(int key){
        root=new Node(key);
    }
    BinaryTreeInorderTraversal(){
        root = null;
    }

    void printInorder(Node node)
    {
        if (node==null)
            return;
        printInorder(node.left);
        System.out.println(node.key+" ");
        printInorder(node.right);
    }

    void printPreorder(Node node)
    {
        if(node==null)
            return;
        System.out.println(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInorder()
    {
        printInorder(root);
    }

    void printPreorder()
    {
        printPreorder(root);
    }

    public static void main(String[] args){
        BinaryTreeInorderTraversal tree = new BinaryTreeInorderTraversal();
        tree.root=new Node(1);
        tree.root.left=new Node(0);
        tree.root.right=new Node(2);
        tree.root.right.left=new Node(3);
        System.out.println("Inorder Traversal of Binary tree is: ");
        tree.printInorder();
        System.out.println("Preorder Traversal of Binary tree is ");
        tree.printPreorder();
    }
}
