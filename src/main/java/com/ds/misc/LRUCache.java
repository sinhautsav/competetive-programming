package com.ds.misc;

import com.structs.Node;

import java.util.HashMap;
import java.util.LinkedList;
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

public class LRUCache<E extends Comparable<E>> {
    private Map<Integer ,E> cache;
    private LinkedList<E> twoWayList;
    private int cacheSize;
    int count;

    public LRUCache(int cacheSize) {
        int count = 0;
        this.cacheSize = cacheSize;
        this.cache = new HashMap<>();
        this.twoWayList = new LinkedList<>();
    }

    public void addElement(E element) {
        if(this.twoWayList.size() < this.cacheSize) {
            this.cache.put(count++, element);
            this.twoWayList.addFirst(element);
        } else {

        }
    }


}
