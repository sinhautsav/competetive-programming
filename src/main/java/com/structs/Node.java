package com.structs;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 26/08/19
 */
public class Node<T> {

    private T value;
    private Node<T> leftNode;
    private Node<T> rightNode;

    public Node(T value) {
        this.value = value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public void setLeftNode(Node<T> leftNode) {
        this.leftNode = leftNode;
    }
    public void setRightNode(Node<T> rightNode) {
        this.rightNode = rightNode;
    }
    public T getValue() {
        return value;
    }
    public Node<T> getLeftNode() {
        return leftNode;
    }
    public Node<T> getRightNode() {
        return rightNode;
    }
    public void removeLeft() { this.leftNode = null; }
    public void removeRight() { this.rightNode = null; }

    public void detach() {
        if(this.leftNode == null && this.rightNode == null) return;

        if(this.leftNode != null) {
            this.leftNode.setRightNode(this.rightNode);
            if(this.rightNode != null) this.rightNode.setLeftNode(this.leftNode);
            this.removeLeft();
            this.removeRight();
        } else {
            this.rightNode.removeLeft();
        }
    }
}
