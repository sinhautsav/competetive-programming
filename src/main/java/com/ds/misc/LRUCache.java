package com.ds.misc;

import com.ds.list.DoubleLinkedList;
import com.structs.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private Map<T , E> cache;
    private DoubleLinkedList<E> twoWayList;
    private int cacheSize;
    int count;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.cache = new HashMap<T, E>();
        this.twoWayList = new DoubleLinkedList<>();
    }

    public boolean addElement(E element) {
        if(this.cache.containsKey(element.getId())) {
            if (this.twoWayList.getSize() < this.cacheSize) {
                this.cache.put(element.getId(), element);
                this.twoWayList.addFirst(element);
            } else {

            }
        }
        return false;
    }

    public E get(T key){
        E node;
        if ((node = this.cache.get(key)) != null) {
        }
        return null;
    }
}
