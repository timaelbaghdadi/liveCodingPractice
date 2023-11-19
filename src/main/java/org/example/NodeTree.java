package org.example;

public class NodeTree {

    Integer data;
    NodeTree left;
    NodeTree right;

    public NodeTree(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}
