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
 * Make it thread safe
 */

public class LRUCache<T, E extends UniquelyIdentifiable<T>> {
    private Map<T , Node<E>> cache;
    private int cacheSize;
    private Node<E> head, tail;

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
            T key = tail.getValue().getId();
            Node<E> tailLeft = tail.getLeftNode();
            tailLeft.removeRight();
            tail = tailLeft;

            this.addInFirst(node);
            this.cache.remove(key);
        } else if(mapSize < this.cacheSize){
            if(mapSize == 0){
                head = node;
                tail = node;
            } else this.addInFirst(node);
        }
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
