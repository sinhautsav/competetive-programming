package com.online.geeksforgeeks;

import com.ds.trees.Recursive;
import com.structs.Node;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any): Geeks4Geeks
 * Difficulty Level: Easy
 * Status: Accepted
 * Description:
 * Created On : 07/09/19
 */
public class FullBinaryTree {

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        node.setLeftNode(new Node<>(2));
        node.setRightNode(new Node<>(3));

        node.getLeftNode().setLeftNode(new Node<>(4));
        node.getLeftNode().setRightNode(new Node<>(5));

        node.getRightNode().setLeftNode(new Node<>(6));
        node.getRightNode().setRightNode(new Node<>(7));

        System.out.println(isFullBinary(node));
    }

    @Recursive
    private static boolean isFullBinary(Node node) {
        if(node == null) return false;
        boolean bothChildrenPresent = node.getLeftNode() != null && node.getRightNode() != null;
        boolean bothChildrenAbsent = node.getLeftNode() == null && node.getRightNode() == null;

        if(bothChildrenPresent) {
            return isFullBinary(node.getRightNode()) && isFullBinary(node.getLeftNode());
        }
        return bothChildrenAbsent;
    }
}
