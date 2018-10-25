package treeExample;


import java.util.LinkedList;
import java.util.Queue;

// Iterative Queue based Java program to do level order traversal (BFS)
// of Binary Tree
class Node_queue{

    int data;
    Node left, right;

    public Node_queue(int item){
        data=item;
        left=null;
        right=null;
    }
}
public class BreadthFirstTraversal {

    Node root;

    void printLevelOrder(){
        Queue<Node> queue = new LinkedList<Node>();
        ((LinkedList<Node>) queue).add(root);

        while (!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.println(tempNode.key + " ");

            if (tempNode.left !=null)
            {
                ((LinkedList<Node>) queue).add(tempNode.left);
            }
            if (tempNode.right!=null)
            {
                ((LinkedList<Node>) queue).add(tempNode.right);
            }

        }

    }

    public static void main (String args[]){
        BreadthFirstTraversal tree_level= new BreadthFirstTraversal();
        tree_level.root=new Node(1);
        tree_level.root.left=new Node(2);
        tree_level.root.right=new Node(3);
        tree_level.root.left.left=new Node(4);
        tree_level.root.right.right=new Node(5);
        System.out.println("level order traversal of binary tree is(BFS): ");
        tree_level.printLevelOrder();
    }
}
