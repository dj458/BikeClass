package com.Bike.core;

public class TreeNode {
    public int value;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode(int x){
        value = x;

    }

    public TreeNode(int x, TreeNode leftNode, TreeNode rightNode){
        this.value=x;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

}