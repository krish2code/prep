package com.krish.search;

import java.util.HashMap;

public class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("hi");
    }
    
    public void insert(String word) {
        HashMap<Character, TrieNode> children = root.children;
        
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            
            TrieNode t;
            
            if(children.containsKey(c)){
                t = children.get(c);
            } else {
                t = new TrieNode(c);
                children.put(c, t);
            }
            
            children = t.children;
            
          //set leaf node
            if(i==word.length()-1)
                t.isLeaf = true;    
        }
    }
}

class TrieNode {
    char c;
    HashMap<Character, TrieNode> children = new HashMap<Character, TrieNode>();
    boolean isLeaf;

    public TrieNode() {
    }

    public TrieNode(char c) {
        this.c = c;
    }
}