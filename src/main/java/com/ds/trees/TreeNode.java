package com.ds.trees;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 26/08/19
 */
public class TreeNode<T extends Comparable<T>> {

    private T value;
    private TreeNode<T> leftNode;
    private TreeNode<T> rightNode;

    public TreeNode(T value, TreeNode<T> leftNode, TreeNode<T> rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    public T getValue() {
        return value;
    }

    public TreeNode<T> getLeftNode() {
        return leftNode;
    }

    public TreeNode<T> getRightNode() {
        return rightNode;
    }
}
