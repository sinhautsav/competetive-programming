package com.online.geeksforgeeks;

import com.structs.Node;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 12/12/19
 */
public class ReverseLinkedList {
    Node<Integer> head;
    int size;

    public ReverseLinkedList(int size) {
        this.size = size;
        create();
    }

    public static void main(String[] args) {
        int i = 10;
        ReverseLinkedList rll = new ReverseLinkedList(i);
        rll.print();
    }

    private Node<Integer> create() {
        int i = 1;
        head = new Node<>(i++);
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        while(i < size) {
            Node<Integer> node = new Node<>(i++);
            curr.setRightNode(node);
            curr.setLeftNode(prev);
            prev = curr;
            curr = node;
        }
        curr.setLeftNode(prev);
        return head;
    }

    private void print() {
        if(head == null) return;
        StringBuilder sb = new StringBuilder();
        Node<Integer> curr = head.getRightNode();
        sb.append(valueWithArrow(head));
        while(curr != null) {
            sb.append(valueWithArrow(curr));
            curr = curr.getRightNode();
        }
        sb.append(valueWithArrow(curr));
        System.out.println(sb.toString());
    }

    private static String valueWithArrow(Node<Integer> node) {
        return node == null ? "NIL" : node.getValue().toString()+"<->";
    }
}
