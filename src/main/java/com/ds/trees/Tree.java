package com.ds.trees;

import com.structs.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 26/08/19
 */
public class Tree<T extends Comparable<T>> {

    public enum DFSType {IN_ORDER, PRE_ORDER, POST_ORDER}
    private Node<T> root;
    private T[] data;

    public Tree(T[] data) {
        this.data = data;
    }


    public void createTree() {
        this.root = new Node<T>(data[0]);
        if(data.length > 1){
            for (int i = 1; i < data.length; i++) {
                T val = data[i];
                Node<T> temp = root;
                while(temp != null) {
                    if (val.compareTo(temp.getValue()) > 0) {
                        if (temp.getRightNode() == null) {
                            temp.setRightNode(new Node<>(val));
                            break;
                        }
                        else temp = temp.getRightNode();
                    } else {
                        if (temp.getLeftNode() == null) {
                            temp.setLeftNode(new Node<>(val));
                            break;
                        }
                        else temp = temp.getLeftNode();
                    }
                }
            }
        }
    }

    public void recursiveTraversal(DFSType type) {
        StringBuilder builder = new StringBuilder(type.name()).append(": ");
        switch (type){
            case IN_ORDER: printInOrderRecursive(this.root, builder); break;
            case PRE_ORDER: printPreOrderRecursive(this.root, builder); break;
            case POST_ORDER: printPostOrderRecursive(this.root, builder); break;
        }
        System.out.println(builder.deleteCharAt(builder.length() -1).toString());
    }

    public void nonRecursiveTraversal(DFSType type) {
        StringBuilder builder = new StringBuilder(type.name()).append(": ");
        switch (type){
            case IN_ORDER: printInOrderRecursive(this.root, builder); break;
            case PRE_ORDER: printPreOrderRecursive(this.root, builder); break;
            case POST_ORDER: printPostOrderRecursive(this.root, builder); break;
        }
        System.out.println(builder.deleteCharAt(builder.length() -1).toString());
    }

    private void printInOrderRecursive(Node node, StringBuilder builder){
        if(node == null) return;
        printInOrderRecursive(node.getLeftNode(), builder);
        builder.append(node.getValue()).append(",");
        printInOrderRecursive(node.getRightNode(), builder);
    }

    private void printPreOrderRecursive(Node node, StringBuilder builder){
        if(node == null) return;
        builder.append(node.getValue()).append(",");
        printPreOrderRecursive(node.getLeftNode(), builder);
        printPreOrderRecursive(node.getRightNode(), builder);
    }

    private void printPostOrderRecursive(Node node, StringBuilder builder){
        if(node == null) return;
        printPostOrderRecursive(node.getLeftNode(), builder);
        printPostOrderRecursive(node.getRightNode(), builder);
        builder.append(node.getValue()).append(",");
    }


    public void levelOrderTraversal() {
        Queue<Node<T>> queue = new LinkedList<>();
        if(this.root == null) return;
        StringBuilder builder = new StringBuilder();
        queue.add(this.root);
        while(!queue.isEmpty()) {
            Node<T> node = queue.poll();
            if(node.getLeftNode() != null) queue.add(node.getLeftNode());
            if(node.getRightNode() != null) queue.add(node.getRightNode());
            builder.append(node.getValue()).append(",");
        }

        System.out.println(builder.deleteCharAt(builder.length() - 1).toString());
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{50,45,55,35,47,53,57,32,40,46,48,51,54,56,58};
        Tree tree = new Tree<>(arr);
        tree.createTree();
        tree.levelOrderTraversal();
        tree.recursiveTraversal(DFSType.IN_ORDER);
        tree.recursiveTraversal(DFSType.PRE_ORDER);
        tree.recursiveTraversal(DFSType.POST_ORDER);
    }
}
