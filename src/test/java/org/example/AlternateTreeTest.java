package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlternateTreeTest {



    @Test
    public void checkMirrorTree(){
        AlternateTree tree = new AlternateTree();
        tree.root = new NodeTree(1);
        NodeTree initialRoot = tree.root;
        tree.root.left = new NodeTree(2);
        tree.root.right = new NodeTree(3);
        tree.root.left.left = new NodeTree(4);
        tree.root.left.right = new NodeTree(5);
        NodeTree changedRoot = tree.root;

        tree.inOrder(initialRoot);
        tree.mirror(tree.root);
        tree.inOrder(tree.root);

        assertTrue(tree.compareTree(initialRoot,changedRoot));



    }

}