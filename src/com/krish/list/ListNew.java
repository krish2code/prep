package com.krish.list;

public class ListNew {
    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();

        System.out.println(list.isEmpty());

    }
}

class List {

    Node1 node;
    int size;


    public boolean isEmpty() {
        return (size == 0);

    }

    public void print() {
        print(node);
    }

    public void print(Node1 node) {
        if (node == null)
            return;
        else {
            System.out.println(node.cargo);
            print(node.next);
        }
    }

    public void add(int i) {
        node = node(node, i);
    }

    public Node1 node(Node1 node, int i) {
        if (node == null) {
            node = new Node1(i, null);
        } else {
            node.next = node(node.next, i);
        }
        size++;
        return node;
    }
}

class Node1 {
    int cargo;
    Node1 next;

    public Node1() {
        cargo = 0;
        next = null;
    }

    public Node1(int cargo, Node1 next) {
        this.cargo = cargo;
        this.next = next;
    }

    public String toString() {
        return cargo + " ";
    }
}