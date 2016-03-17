package com.krish.impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUImpl {
    public static void main(String[] args) {
        LRU<Integer, Integer> lru = new LRU<Integer, Integer>(3);
        lru.put(1, 1);
        lru.put(2, 2);
        lru.put(3, 3);
        lru.put(4, 4);
        lru.put(1, 1);

        System.out.println(lru.get(1));
        System.out.println(lru.get(2));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
    }
}

class LRU<K, V> extends LinkedHashMap<K, V> {

    private static final long serialVersionUID = 1L;

    private int capacity;

    public LRU(int capacity) {
        super(capacity, .75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.capacity;
    }

}
