package com.krish.impl;



public class ListImpl {

    public static void main(String[] args) {
        List list = new List();
        list.add(1);
        list.add(2);
        list.add(3);

        list.print();
        list.printReverse();
        System.out.println(list.isEmpty());
        System.out.println("list.size() : " + list.size());
        System.out.println(list.get(1));
        
        System.out.println(list.remove(1));
        System.out.println("list.size() : " + list.size());
        System.out.println("*******");
        list.print();
    }
}

class List {

    Node node;
    int size = -1;
    
    
    // ***********************************
    
    private static boolean hasLoop(Node first) {
        if(first == null) 
            return false;
        
        Node slow, fast;
        slow = fast = first;
        
        while(true) {
            slow = slow.next;
            
            if(fast.next != null)
                fast = fast.next.next;
            else
                return false;
            
            if(slow == null || fast == null)
                return false;
            
            if(slow == fast)
                return true;
        }
    }
    
    // ***********************************
    
    private static Node MergeLists(Node node1, Node node2) {
        if (node1 == null)
            return node2;
        if (node2 == null)
            return node1;

        if (node1.data < node2.data) {
            node1.next = MergeLists(node1.next, node2);
            return node1;
        } else {
            node2.next = MergeLists(node2.next, node1);
            return node2;
        }
    }
    
    // ***********************************
    
    public void printReverse() {
        printReverse(node);
    }
    
    private void printReverse(Node node) {
        if(node != null) {
            printReverse(node.next);
            System.out.println(node.data);
        }
    }

    // ***********************************
    public void print() {
        print(node);
    }

    private void print(Node node) {
        if (node != null) {
            System.out.println(node.data);
            print(node.next);
        }
    }

    // ***********************************
    public boolean remove(int index) {
        return remove(node, index);
    }

    private boolean remove(Node node, int index) {
        // [0,1,2,3]

        if (index > size)
            return false;

        Node targetNode = null;
        Node prev = null;

        if (node != null) {
            targetNode = node;
            for (int i = 0; i < index; i++) {
                if (targetNode == null) {
                    return false;
                }
                prev = targetNode;
                targetNode = targetNode.next;
            }
            
            if(prev != null) {
                prev.next = targetNode.next;
            }
            
            targetNode = null;
            size--;
            return true;
        }
        return false;
    }

    // ***********************************
    public Object get(int index) {
        return get(node, index);
    }

    private Object get(Node node, int index) {
        Node targetNode = null;
        if (index > size) {
            return new ArrayIndexOutOfBoundsException();
        } else {
            if (node != null) {
                targetNode = node;
                for (int i = 0; i < index; i++) {
                    if (targetNode.next == null) {
                        return null;
                    }
                    targetNode = targetNode.next;
                }
            }
        }
        return targetNode;
    }

    // ***********************************
    public void add(int data) {
        node = add(node, data);
        size++;
    }

    private Node add(Node node, int data) {
        if (node == null) {
            node = new Node(node, data);
        } else {
            node.next = add(node.next, data);
        }
        return node;
    }

    // ***********************************
    public boolean isEmpty() {
        return (size == -1);
    }

    // ***********************************
    public int size() {
        return size + 1;
    }
}

class Node {
    Node next;
    int data;

    public Node() {
        next = null;
        data = 0;
    }

    public Node(Node node, int data) {
        this.next = node;
        this.data = data;
    }
}