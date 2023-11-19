package org.example;

public class AlternateTree {
    NodeTree root;

    public AlternateTree() {
    }

    public NodeTree mirror(NodeTree node) {

        if (node == null) {
            return null;
        }

        NodeTree right = mirror(node.right);

        node.right = mirror(node.left);
        node.left = right;

        return node;
    }

    void inOrder(NodeTree node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    public boolean compareTree(NodeTree n1, NodeTree n2) {
        if (n1 == null && n2 == null) {
            return true;
        } else if (n1 == null || n2 == null) {
            return false;
        }
        return (n1.data == n2.data) && compareTree(n1.right, n2.right) && compareTree(n1.left, n2.left);
    }


}
