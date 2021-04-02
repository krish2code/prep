package com.krish.iw;

import java.util.HashMap;

public class LRU {
    public static void main(String[] args) {
        LRUCache lru = new LRUCache(5);
        lru.set(1, 1);
        lru.set(2, 2);
        lru.set(3, 3);
        lru.set(4, 4);
        lru.set(5, 5);
        lru.set(6, 6);
        lru.set(1, 1);
        
        System.out.println(lru.get(1));
        System.out.println(lru.get(2));
        System.out.println(lru.get(3));
        System.out.println(lru.get(4));
        System.out.println(lru.get(5));
        System.out.println(lru.get(6));
        
    }
}
class LRUCache {
    int capacity;
    HashMap<Integer, LRUNode> map = new HashMap<Integer, LRUNode>();
    LRUNode head=null;
    LRUNode end=null;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
            LRUNode old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
            LRUNode created = new LRUNode(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
            }else{
                setHead(created);
            }    
            map.put(key, created);
        }
    }
    
    private void setHead(LRUNode n) {
        n.next = head;
        n.prev = null;
        
        if(head!=null)
            head.prev = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
    
    
    public int get(int key) {
        if(map.containsKey(key)) {
            LRUNode n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }

    private void remove(LRUNode n) {
        if(n.prev != null) {
            n.prev.next = n.next;
        } else {
            head = n.next;
        }
        
        if(n.next != null) {
            n.next.prev = n.prev;
        } else {
            end = n.prev;
        }
    }
}

class LRUNode {
    int key;
    int value;
    LRUNode prev;
    LRUNode next;
    
    public LRUNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}