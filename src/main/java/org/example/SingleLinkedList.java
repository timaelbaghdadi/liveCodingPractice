package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SingleLinkedList {

    Node head = null;
    Node tail = null;

    public SingleLinkedList() {
    }

    public void push(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            this.head.next = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

    }

    public Node getMiddleElement() {
        if (this.head == null) {
            System.out.println("Empty list. Add elements to find the middle element");
            return null;
        } else {
            Node slowPtr = this.head;

            for(Node fastPtr = this.head; fastPtr != null && fastPtr.next != null; fastPtr = fastPtr.next.next) {
                slowPtr = slowPtr.next;
            }

            return slowPtr;
        }
    }

    public Node reverseLinkedList() {
        Node prev = null;
        Node next = null;

        for(Node current = this.head; current != null; current = next) {
            next = current.next;
            current.next = prev;
            prev = current;
        }

        return prev;
    }

    public void removeDuplicated() {
        Node current = this.head;
        Node prevNode = null;

        for(Set<Integer> uniqueNodes = new HashSet(); current != null; current = current.next) {
            Boolean isNodeAdded = uniqueNodes.add(current.data);
            if (!isNodeAdded) {
                Node nextNode = current.next;
                prevNode.next = nextNode;
            } else {
                prevNode = current;
            }
        }

        this.printList(this.head);
    }

    public void printList(Node tnode) {
        while(tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }

        System.out.println("NULL");
    }

    public Integer countLength(Node node, Integer count) {
        return node == null ? count : this.countLength(node.next, 1 + count);
    }

    public Integer findNthNodeFromEnd(Node node, int N) {
        int length = 0;
        int tempIndex = 0;

        Node tempNode;
        for(tempNode = node; tempNode != null; tempNode = tempNode.next) {
            ++length;
        }

        tempNode = node;
        if (length - N >= 0) {
            while(tempNode != null) {
                if (tempIndex == length - N) {
                    return tempNode.data;
                }

                ++tempIndex;
                tempNode = tempNode.next;
            }
        }

        return null;
    }

    public void sumTwoLinkedLists(Node head1, Node head2) {
        this.printList(head1);
        this.printList(head2);
        Stack<Integer> stack1 = new Stack();

        Stack stack2;
        for(stack2 = new Stack(); head1 != null; head1 = head1.next) {
            stack1.add(head1.data);
        }

        while(head2 != null) {
            stack2.add(head2.data);
            head2 = head2.next;
        }

        int carry = 0;
        Node result = null;
        Node firstNode = null;

        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            int a = false;
            int b = false;
            int a = (Integer)stack1.pop();
            int b = (Integer)stack2.pop();
            int total = a + b + carry;
            Node temp = new Node(total % 10);
            carry = total / 10;
            if (result == null) {
                result = temp;
                firstNode = temp;
            } else {
                result.next = temp;
                result = temp;
            }
        }

        if (carry > 0) {
            result.next = new Node(carry);
            new Node(carry);
        }
    }
}
