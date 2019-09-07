package com.ds.list;

import com.structs.Node;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 02/09/19
 */
public class DoubleLinkedList<E> implements Iterable<E> {

    private Node<E> head, tail;
    private int capacity;
    int size;

    public DoubleLinkedList() {
        this.capacity = -1;
        this.size = 0;
    }

    public DoubleLinkedList add(E element) {
        if(head == null) {
            head = new Node<>(element);
            tail = head;
        } else {
            Node<E> temp = new Node<>(element);
            temp.setLeftNode(tail);
            tail.setRightNode(temp);
            tail = temp;
        }
        size++;
        return this;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        Node temp = head;
        if(temp == null) return "[]";
        StringBuilder builder = new StringBuilder("[");
        while(temp != null) {
            builder.append(temp.getValue()).append(",");
            temp = temp.getRightNode();
        }
        return builder.deleteCharAt(builder.length() -1).append("]").toString();
    }

    public void addFirst(E element) {
        Node<E> newEle = new Node<E>(element);
        assert head.getLeftNode() == null;
        head.setLeftNode(newEle);
        newEle.setRightNode(head);
        head = newEle;
    }

    public void moveFirst(E element) {
        Node<E> newEle = new Node<E>(element);
        assert head.getLeftNode() == null;
        head.setLeftNode(newEle);
        newEle.setRightNode(head);
        head = newEle;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    public static void main(String[] args) {
        DoubleLinkedList<String> list = new DoubleLinkedList<String>();
        list.add("Hello").add("World").add("I").add("am").add("a").add("good").add("boy");
        System.out.println(list);
        System.out.println(list.size);
    }
}
