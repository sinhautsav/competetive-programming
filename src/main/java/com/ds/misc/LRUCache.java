package com.ds.misc;

import com.structs.Node;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Author: Utsav Sinha
 * Online Forum (Problem Code if any):
 * Difficulty Level:
 * Status:
 * Description:
 * Created On : 01/09/19
 */

/**
 * TODO
 * 1. Make it generic for a node to have uniquely identifiable id for map as a key. It will an integer for now.
 * 2. When #1 is done , remove count variable.
 */

public class LRUCache<E extends UniquelyIdentifiable<T>, T> {
    private Map<T , Node<E>> cache;
    private int cacheSize;
    Node<E> head, tail;
    int count;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.cache = new HashMap<>();
    }

    public boolean add(E element) {
        if(this.cache.get(element.getId()) != null) return false;
        int mapSize = this.cache.size();
        Node<E> node = new Node<>(element);
        if(mapSize == this.cacheSize){
            //remove the last node
            Node<E> tailLeft = tail.getLeftNode();
            tailLeft.removeRight();
            tail = tailLeft;

        } else if(mapSize < this.cacheSize){
            if(mapSize == 0){
                head = node;
                tail = node;
            }
        }
        this.addInFirst(node);
        this.cache.put(element.getId(), node);

        return true;
    }

    public Optional<E> get(T key){
        Node<E> node;
        if ((node = this.cache.get(key)) == null) return Optional.empty();
        node.detach();
        this.addInFirst(node);
        return Optional.of(node.getValue());
    }

    private void addInFirst(Node<E> node) {
        head.setLeftNode(node);
        node.setRightNode(head);
        head = node;
    }
}
